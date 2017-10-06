/*
 * Victoria J. Heil
 * CSC205 -- Data Structures -- Summer 2014
 * 
 * Programming Project 8.7 -- Electronics
 * Design and implement a set of classes that define
 * various types of electronics equipment(computers,
 * cell phones, pagers, digital cameras, and so on).
 * Include data values that describe various attributes
 * of the electronics, such a the weight, cost, power
 * usage, and name of the manufacturer. Include methods
 * that are named appropriately for each class and that
 * print an appropriate message. Create a driver class
 * to instantiate and exercise several of the classes.
 */
public class Segment extends ElectronicsEquipment {

   protected String segmentName;
   protected double marketShare;
   
   public Segment( String segmentName ) {
      setSegmentName( segmentName );
   }
   
   public void setSegmentName( String segmentName ) {
      this.segmentName = segmentName;
   }
         
   public double getMarketShare() {
      return marketShare;
   }
   
   public void setMarketShare( double marketShare ) {
      this.marketShare = marketShare;
   }
   
   public String toString() {
      String rString = super.toString() + "\n";
      rString += "Segment: ";
      rString += "\n\tsegmentName=" + segmentName;
      rString += ",\n\tmarketShare=" + marketShare;
      return rString;
   }
   
   
} // class
