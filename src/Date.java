//********************************************************************
//  Date.java       Java Foundations
//
//  Example of Comparable interface.
//********************************************************************

public class Date implements Comparable<Date>
{
   private int month;
   private int day;
   private int year;
      
   //-----------------------------------------------------------------
   //  Constructor: sets data values.
   //-----------------------------------------------------------------
   public Date (int month, int day, int year)
   {
      this.month = month;
      this.day = day;
      this.year = year;
   }

   //-----------------------------------------------------------------
   //  Prints a specific string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return (month + "/" + day + "/" + year);
   }

   //-----------------------------------------------------------------
   //  Tests for equality.
   //-----------------------------------------------------------------
   public boolean equals ( Date other )
   {
      return( ( month == other.month ) &&
              ( day == other.day ) &&
              ( year == other.year ) ); 
   }
   
   //-----------------------------------------------------------------
   //  Implements Comparable's method.
   //-----------------------------------------------------------------
   public int compareTo( Date other ) 
   {
      if( year != other.year ) {
         return year - other.year;
      } 
      else if( month != other.month ) {
         return month - other.month;
      } 
      else {
         return day - other.day;
      }
   }
}
