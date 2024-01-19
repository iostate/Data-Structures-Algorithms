package strings;

import java.util.ArrayList;
import java.util.List;

public class ExcelLetterToInt {
	
	public int titleToNumber(String columnTitle) {
        for(int i = 0; i < columnTitle.length() - 1; i++) {
            int colNum = (int) columnTitle.charAt(i);
            System.out.println(colNum);
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0,1);
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		 
        // Again adding elements to object of List interface
        // Custom inputs
        l2.add(1);
        l2.add(2);
        l2.add(3);
        
        System.out.println(l2);
        

	}

}
