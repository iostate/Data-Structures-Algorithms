   //********************************************************************
   //  DateMain.java       Java Foundations
//
//  Example of testing Comparable interface.
//********************************************************************

import java.util.Random;

public class DateMain {

   public static void main ( String[] args ) {
      Random rand = new Random();
      dateTest( rand, 25 );
   }
   
   public static int genRandInt( Random rand, int min, int max ) {
      return rand.nextInt((max - min) + 1) + min;
   }
   
   public static void dateTest(Random rand, int count ) {
      int month1, month2, day1, day2, year1, year2, answer;
      
      for( int i=1; i<=count; i++ ) {
         month1 = genRandInt( rand, 1, 12 );
         if( i % 4 == 1 )
            month2 = genRandInt( rand, 1, 12 );
         else month2 = month1;
         day1 = genRandInt( rand, 1, 30 );
         day2 = genRandInt( rand, 1, 30 );
         year1 = genRandInt( rand, 1956, 2015 );
         if( i % 2 == 1 )
            year2 = genRandInt( rand, 1956, 2015 );
         else year2 = year1; 
         Date date1 = new Date( month1, day1, year1 );
         Date date2 = new Date( month2, day2, year2 );
         System.out.print( "Is date1, " + date1 + " earlier than date2, " 
            + date2 + "? " );
         answer =  date1.compareTo(date2);
         if( answer < 0 ) 
            System.out.println( "yes" );
         else if ( answer > 0 ) 
            System.out.println( "no" );
         else if ( answer == 0 )
            System.out.println( "dates are equal" ); 
         System.out.println();
      }
   }
}

