package esp.ws.client.sboot;

import javax.xml.bind.JAXBElement;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ws.client.core.WebServiceTemplate;

import esp.svc.calc.Calculate;
import esp.svc.calc.CalculateResponse;
import esp.svc.calc.CalculateResult;
import esp.svc.hello.Hello;
import esp.svc.hello.HelloResponse;


//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppWsClientConfiguration.class)
@SpringBootTest
public class SoapTest {


	
	
	@Autowired
	@Qualifier("calcWsTemplate")
	WebServiceTemplate calcWebserviceTemplate;
	
	@Test
	public void whenInvoked_compute_statistics() {
		//prepare
		JAXBElement<Calculate> req = WsTestFixture.buildCalculatorRequest();

		//exec
		JAXBElement<CalculateResponse>  res = (JAXBElement<CalculateResponse>)calcWebserviceTemplate.marshalSendAndReceive(req);
		CalculateResult result = res.getValue().getReturn();
		Integer actual = result.getResult();
		
		//verify
		Integer expected = 6;
		Assert.assertEquals(expected, actual);
	}

	@Autowired
	@Qualifier("helloWsTemplate")
	WebServiceTemplate helloWebserviceTemplate;
	
	@Test
	public void whenInvoked_test_hello() {
		//prepare
		JAXBElement<Hello> req = WsTestFixture.buildHelloRequest();

		//exec
		JAXBElement<HelloResponse>  res = (JAXBElement<HelloResponse>)helloWebserviceTemplate.marshalSendAndReceive(req);
		HelloResponse result = res.getValue();
		String actual = result.getReturn();
		
		//verify
		String expected = WsTestFixture.HELLO_STRING;
		
		Assert.assertEquals(expected, actual);
	}
}
