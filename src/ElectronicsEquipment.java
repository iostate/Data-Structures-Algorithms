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
public class ElectronicsEquipment {
   protected double weight;
   protected double cost;
   protected double powerConsumption;
   protected String manufacturerName;
   protected String partNumber;

   public void setWeight( double weight ) {
      this.weight = weight;
   }
   
   public double getWeight() {
      return weight;
   }

   public void setCost( double cost ) {
      this.cost = cost;
   }

   public double getCost() {
      return cost;
   }

   public void setPowerConsumption( double powerConsumption ) {
      this.powerConsumption = powerConsumption;
   }
   
   public double getPowerConsumption() {
      return powerConsumption;
   }

   public void setManufacturerName ( String manufacturerName ) {
      this.manufacturerName = manufacturerName;
   }

   public String getManufacturerName() {
      return manufacturerName;
   }

   public void setPartNumber ( String partNumber ) {
      this.partNumber = partNumber;
   }

   public String getPartNumber() {
      return partNumber;
   }

   public String toString() {
      String rString = "\nElectronicsEquipment has "; 
      rString += "weight=" + weight;
      rString += ",\n\tcost=" + cost;
      rString += ", powerConsumption=" + powerConsumption;
      rString += ",\n\tmanufacturerName=" + manufacturerName;
      rString += "\n\tand partNumber=" + partNumber;
      return rString;
   } // toString
} // class

