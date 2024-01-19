package recursion;

public class EnglishRuler {
	
	/**
	 * 
	 * @param nInches Number of inches that the ruler is.
	 * @param majorLength 
	 */
	public static void drawRuler(int nInches, int majorLength ) {
		drawLine(majorLength, 0);
		for(int i = 1; i <= nInches; i++) {
			drawInterval(majorLength - 1);
			// After drawing the interval, draw nInches - 2
			drawLine(majorLength, i);
		}
		
	}
	
	/**
	 * 
	 * @param tickLength Number of dashes for major tick (denotes
	 * whole inch).
	 * @param tickLabel Label for major tick (which again, denotes
	 * whole inch).
	 */
	public static void drawLine(int tickLength, int tickLabel) {
		
		for(int i = 0; i < tickLength; i++) {
			System.out.print("-");
		}
		
		
		if(tickLabel >= 0) {
			System.out.print(" " + tickLabel);
		}
		System.out.print("\n");
	}
	
	/**
	 * Draw tick line without the tick label.
	 * @param tickLength
	 */
	public static void drawLine(int tickLength) {
		drawLine(tickLength, -1);
	}
	
	public static void drawInterval(int centralLength) {
		if(centralLength >= 1) {

			// reduce down to 1
			drawInterval(centralLength - 1);
			// draw 1 line
			drawLine(centralLength);
			// reduce down to 1
			drawInterval(centralLength - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		drawRuler(4,4);
		drawInterval(3);
		System.out.println("\n");
		drawInterval(2);
		
	}

}
