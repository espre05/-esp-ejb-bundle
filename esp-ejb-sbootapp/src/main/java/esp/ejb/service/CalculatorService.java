package esp.ejb.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import esp.ejb.ws.calc.Calculate;
import esp.ejb.ws.calc.CalculateResponse;
import esp.ejb.ws.calc.InputData;
import esp.ejb.ws.calc.ObjectFactory;
import esp.ejb.ws.calc.StatisticalOperation;

@Service
public class CalculatorService {
	private static final Logger log = LoggerFactory.getLogger(CalculatorService.class);
	@Autowired
	private WebServiceTemplate ws;

	public CalculatorService() {
	}

	public Integer sum(Collection<Integer> numbers) {
		Calculate req = buildRequest(numbers, StatisticalOperation.SUM);
		JAXBElement<CalculateResponse> res = (JAXBElement<CalculateResponse>) ws.marshalSendAndReceive(req);
		Integer result = res.getValue().getReturn().getResult();
		log.info("Calculated Result : " + res.getValue().getReturn().getResult());
		return result;
	}

	private Calculate buildRequest(Collection<Integer> numbers, StatisticalOperation operation) {
		ObjectFactory fact = new ObjectFactory();

		Calculate request = fact.createCalculate();
		{
			InputData data = new InputData();
//			List<Integer> numbers = Arrays.asList(1, 2, 3);
			data.getData().addAll(numbers);

			request.setData(data);
			request.setOperation(operation);
		}
		return request;
	}

}
