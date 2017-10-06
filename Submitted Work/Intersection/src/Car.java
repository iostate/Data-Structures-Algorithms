import java.util.Random;

/**
 *
 Programmer: Quan Truong
 Date: 7/12/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: Car

 Description: Allows for the creation of Car Objects.

 */
public class Car {
   /*
   Random number generator
    */
   public static final Random RAND = new Random();
   /*
   Keeps track of the number of the Car.
    */
   public int vehicleTrack;
   /*
   The arrival time of the Car.
    */
   private int arrivalTime;
   /*
   The departure time of the Car.
    */
   private int departureTime;
   /*
   The street that the Car is on.
    */
   private Street street;
   /*
   The direction of the car.
    */
   private Direction direction;
   /*
   Enumerated type for the street that the Car is on.
    */
   public enum Street {Dobson, Southern}
   /*
   Enumerator type of the Direction of the Car.
    */
   public enum Direction {
      N, S, W, E
   }

   /**
    * Car Constructor that allows for the creation of a Car object.
    * @param vehicleTrack -- Vehicle tracking Number.
    * @param arrivalTime -- The time that the car is created.
    * @param departureTime -- The time that the car crosses the intersection
    */
   public Car(int vehicleTrack, int arrivalTime, int departureTime) {
      this.vehicleTrack = vehicleTrack;
      this.arrivalTime = arrivalTime;
      this.departureTime = departureTime;
      street = randStreet();
      direction = randDirection();

   }


   /**
    * Generates a random direction for the Car to head in.
    * @return
    */
   public Direction randDirection() {
      int directionChosen = RAND.nextInt(2 - 0) + 1;
      if (this.street == Street.Dobson) {
         switch (directionChosen) {
            case 1:
               direction = Direction.N;
               break;
            case 2:
               direction = Direction.S;
               break;
            default:
               break;
         }
      } else if (this.street == Street.Southern) {
         switch (directionChosen) {
            case 1:
               direction = Direction.E;
               break;
            case 2:
               direction = Direction.W;
               break;
            default:
               break;
         }
      }
      return direction;
   }

   /**
    * Generates a random Street for the Car to head in.
    */
   public Street randStreet() {

      int streetChosen = RAND.nextInt(2 - 0) + 1;

      switch (streetChosen) {
         case 1:
            street = Street.Dobson;
            break;
         case 2:
            street = Street.Southern;
            break;
      }
      return street;
   }

   /**
    * Getter method for the Direction of the Car.
    * @return - Direction of the car.
    */
   public Direction getDirection() {
      return direction;
   }

   /**
    *Getter method for the "arrival time", or Car creation time, of the
    * Car.
    * @return -- "Arrival time", or car creation time.
    */
   public int getArrivalTime() {
      return arrivalTime;
   }

   /**
    * Set the arrival time of the vehicle
    * @param arrivalTime
    */
   public void setArrivalTime(int arrivalTime) {
      this.arrivalTime = arrivalTime;
   }

   /**
    * Get the vehicle Tracking Number.
    * @return -- Vehicle tracking number.
    */
   public int getVehicleTrack() {
      return vehicleTrack;
   }

   /**
    * Returns the enumerated type Street, of which Street the Car is on.
    * @return -- Street that the Car is on
    */
   public Street getStreet() {
      return street;
   }

   /**
    * Returns the departure time of the vehicle, or the time that the Car "crosses"
    * the intersection. This occurs when the Car is dequeued.
    */
   public int getDepartureTime() {
      return departureTime;
   }

   /**
    * Set the departure time of the vehicle, or the time that the Car crosses
    * the vehicle.
    * @param departureTime -- The time that the car crosses the intersection.
    */
   public void setDepartureTime(int departureTime) {
      this.departureTime = departureTime;
   }

   /**
    * Calculates the total amount of time that it took the Car to be created
    * all the way until the Car object crossed the intersection.
    */
   public int totalTime() {
      return getDepartureTime() - getArrivalTime();
   }

   /**
    * Returns a nicely formatted String detailing some of the details of
    * the Car object.
    * @return -- Formatted String with details about the Car.
    */
   public String toString() {
      String result = "Car Number: " + getVehicleTrack() +
              "\nVehicle Direction & Street: " + getDirection() + " / " +
              getStreet() +
              "\nVehicle Departure Time: " + getDepartureTime() +
              "\nVehicle Arrival Time: " + getArrivalTime()
              + "\nTime To Get Across: " + (getDepartureTime() - getArrivalTime());
      return result;
   }
}
