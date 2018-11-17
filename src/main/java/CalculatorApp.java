
public class CalculatorApp {

	public int addNumbers(int x, int y) {
		return (x + y);
		
	}
	
	
	public int subNumbers(int x, int y) {
		return (x - y);
		
	}
	
	public int mulNumbers(int x, int y) {
		return (x * y);
		
	}
	
	public int divNumbers(int x, int y) {
		if (y != 0)
		{
			return (x / y);
		}
		else
			return 0;   
	}
	
	
	public int modNumbers(int x, int y) {
		return (x % y);
		
	}
	
	
	
	
	
}
