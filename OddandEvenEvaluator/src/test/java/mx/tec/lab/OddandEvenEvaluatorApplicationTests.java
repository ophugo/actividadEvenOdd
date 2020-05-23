package mx.tec.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OddandEvenEvaluatorApplicationTests {

	OddandEvenEvaluator evaluator = new OddandEvenEvaluator();
	
	@Test
	void givenA2B2_whenEvaluate_thenCEvenDEven() {
		//Given
		double a = 2;
		double b = 2;
		
		//When
		String result = evaluator.evaluate(a,b);
				
		//Then
		assertEquals("C is even and D is even, c=" + (a + b) + " and d=" + (a - b), result);
	}
	
	@Test
	void givenA1B2_whenEvaluate_thenCEvenDEven() {
		//Given
		double a = 1;
		double b = 2;
		
		//When
		String result = evaluator.evaluate(a,b);
				
		//Then
		assertEquals("C is odd and D is odd, c=" + (a + b) + " and d=" + (a - b), result);
	}
	
	@Test
	void givenA1B1_whenEvaluate_thenCEvenDEven() {
		//Given
		double a = 1;
		double b = 1;
		
		//When
		String result = evaluator.evaluate(a,b);
				
		//Then
		assertEquals("C is even and D is even, c=" + (a + b) + " and d=" + (a - b), result);
	}

}
