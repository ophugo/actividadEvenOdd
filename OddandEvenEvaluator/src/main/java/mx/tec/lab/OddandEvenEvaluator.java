package mx.tec.lab;

public class OddandEvenEvaluator {

	public String evaluate(double a, double b) {
		// TODO Auto-generated method stub
		final double c = a + b;
		final double d = a - b;
		int odd = 0;
		
		if (a % 2 != 0) { 
			 odd++; 
		}
			 
		if (b % 2 != 0) {
			 odd++; 
		}
			 
		if (odd == 1) { 
			
			return "C is odd and D is odd, c=" + c + " and d=" + d; 
		} 
		else { 
			
			 return "C is even and D is even, c=" + c + " and d=" + d; 
		} 
	}
	

}
