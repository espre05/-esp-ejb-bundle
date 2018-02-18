package esp.ejb;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import esp.ejb.service.CalculatorService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EjbWebserviceApp.class)
@SpringBootTest
public class CalculatorServiceTest {
	
	@Autowired 
	CalculatorService calc;
	
	@Test
	public void test() {
		List<Integer> list = Arrays.asList(1, 2, 3);
		Integer expected = list.stream().mapToInt(Integer::intValue).sum();;
		Integer actual = calc.sum(list);
		assertEquals(expected, actual);
	}
}
