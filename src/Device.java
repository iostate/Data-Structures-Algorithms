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
 *
 * KEYWORD: Inheritance, Chapter 8
 */
public class Device extends Segment {
   private String deviceName;
   private String brand;

   public Device( String deviceName, String segmentName ) {
      super( segmentName );
      setDeviceName( deviceName );
   }
         
   public String getDeviceName() {
      return deviceName;
   }
   
   public void setDeviceName( String deviceName ) {
      this.deviceName = deviceName;
   }
   
   public String getBrand() {
      return brand;
   }
   
   public void setBrand( String brand ) {
      this.brand = brand;
   }
   
   public String toString() {
      String rString = super.toString() + "\n";
      rString += "Device:";
      rString += "\n\tdeviceName=" + deviceName;
      rString += " and brand=" + brand;
      return rString;
   }
} // class

