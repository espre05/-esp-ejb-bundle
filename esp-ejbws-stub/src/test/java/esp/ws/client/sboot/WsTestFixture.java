package esp.ws.client.sboot;

import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBElement;

import esp.svc.calc.Calculate;
import esp.svc.calc.CalculateRequest;
import esp.svc.calc.InputData;
import esp.svc.calc.StatisticalOperation;
import esp.svc.hello.Hello;

public class WsTestFixture {
	static final esp.svc.calc.ObjectFactory calcObjFactory = new esp.svc.calc.ObjectFactory();
	static final esp.svc.hello.ObjectFactory helloObjFactory = new esp.svc.hello.ObjectFactory();

	public static JAXBElement<Calculate> buildCalculatorRequest() {

		Calculate req = calcObjFactory.createCalculate();
		{
			CalculateRequest calcReq = calcObjFactory.createCalculateRequest();
			InputData data = new InputData();
			List<Integer> list = Arrays.asList(1, 2, 3);
			data.getData().addAll(list);
			calcReq.setInputData(data);
			calcReq.setStatsOperation(StatisticalOperation.SUM);
			req.setCalculateRequest(calcReq);
		}
		return calcObjFactory.createCalculate(req);
	}

	public static final String HELLO_STRING = "This is Hello Input to ejbws";
	public static JAXBElement<Hello> buildHelloRequest() {

		Hello req = helloObjFactory.createHello();
		{
			req.setArg0(HELLO_STRING);
		}
		return helloObjFactory.createHello(req);
	}
}
