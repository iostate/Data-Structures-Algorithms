package recursion;

public class Factorial {
	
	public static int factorial(int n) throws IllegalArgumentException {
		
		if(n < 0) {
			throw new IllegalArgumentException();
		} else if ( n == 1) {
			return 1;
		} else {
			return n * factorial(n-1);			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factOfFive = factorial(5);
		System.out.println(factOfFive);
	}

}
