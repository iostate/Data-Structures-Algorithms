import jsjf.CircularArrayQueue;
import jsjf.exceptions.InvalidInputException;
import jsjf.exceptions.EmptyCollectionException;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Programmer: Quan Truong
 * Date: 7/12/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: Simulator
 * <p>
 * Description: Creates a Simulator for the Intersection at Southern and Dobson.
 */
public class Simulator {

   /*
   Keyboard Scanner
    */
   public static final Scanner KB = new Scanner(System.in);
   /*
   Used to dictate to the program the max time allowed for the simulation.
    */
   private static int vehicleNumber = 1;

   /*
   Array Queues for Delay Times
    */
   private static CircularArrayQueue<Integer> SDobsonDelaysQueue = new CircularArrayQueue<>();
   private static CircularArrayQueue<Integer> NDobsonDelaysQueue = new CircularArrayQueue<>();
   private static CircularArrayQueue<Integer> WSouthernDelaysQueue = new CircularArrayQueue<>();
   private static CircularArrayQueue<Integer> ESouthernDelaysQueue = new CircularArrayQueue<>();
   /*
   Array Queues for Car Objects
    */
   private CircularArrayQueue<Car> SDobson = new CircularArrayQueue<>();
   private CircularArrayQueue<Car> NDobson = new CircularArrayQueue<>();
   private CircularArrayQueue<Car> ESouthern = new CircularArrayQueue<>();
   private CircularArrayQueue<Car> WSouthern = new CircularArrayQueue<>();
   /*
   Global variables used for the probability, simulation, and light values
    */
   private int probabilityInt, simulationTimeInt, lightTimeInt;

   /*
   Default constructor that allows for the creation of a Simulator
    */
   public Simulator() {
   }

   /**
    * Run the simulation.
    *
    * @throws FileNotFoundException Thrown if the file that is being written
    *                               to is not found.
    * @throws InvalidInputException Thrown if a user input is invalid.
    */
   public void run() throws FileNotFoundException, InvalidInputException {

      runAllSubMethodsThatMakeUpTheEntireProgram();

   }

   /**
    * Runs all the sub methods that make up the entire prgoram.
    *
    * @throws FileNotFoundException Throws if the File that output is being
    *                               written to is not found.
    */
   public void runAllSubMethodsThatMakeUpTheEntireProgram() throws FileNotFoundException {

      Simulator simulator = new Simulator();
      receiveProbabilityFromUser();
      receiveSimulationTimeFromUser();
      receiveLightTimeFromUser();
      int simulationTime = runForThisLong(simulationTimeInt);
      System.out.println(simulator.displayProbability(probabilityInt,
              simulationTimeInt, lightTimeInt) + "\n");
      System.out.println(simulator.displayNESWHeader());
      System.out.println(carsAcross());
      System.out.println(totalDelays());
      System.out.println(avgDelays());
      System.out.println(stranded());
   }

   /**
    * Receives the probability from the user.
    */
   public void receiveProbabilityFromUser() {
      String probability;
      System.out.println("Enter probability percentage (1-100): ");
      probability = KB.next();
      while (falseProbabilityCheck(probability)) {
         try {
            if (falseProbabilityCheck(probability)) {
               throw new InvalidInputException(probability);
            }
         } catch (InvalidInputException e) {
            System.out.println("Please enter an integer (1-100).");

         }

         System.out.println("Enter probability percentage: ");
         probability = KB.next();
      }
      probabilityInt = Integer.parseInt(probability);
   }

   /**
    * Receives the simulation time from the user.
    */
   public void receiveSimulationTimeFromUser() {
      String simulationTime;
      System.out.println("Enter simulationTime: ");
      simulationTime = KB.next();

      while (falseIntegerCheck(simulationTime)) {
         try {

            if (falseIntegerCheck(simulationTime)) {
               throw new InvalidInputException((simulationTime));
            }
         } catch (InvalidInputException e) {
            System.out.println("Please input an integer.");
         }
         System.out.println("Enter simulationTime: ");
         simulationTime = KB.next();
      }
      simulationTimeInt = Integer.parseInt(simulationTime);
   }

   /**
    * Receives the light time value from the user.
    */
   public void receiveLightTimeFromUser() {
      String lightTime;
      System.out.println("Enter lightTime: ");
      lightTime = KB.next();

      while (falseIntegerCheck(lightTime)) {

         try {
            if (falseIntegerCheck(lightTime)) {
               throw new InvalidInputException(lightTime);
            }
         } catch (InvalidInputException e) {
            System.out.println("Please enter an integer.");
         }
         System.out.println("Enter lightTime: ");
         lightTime = KB.next();
      }

      lightTimeInt = Integer.parseInt(lightTime);
   }

   /**
    * Used to specify how long to run the simulation for.
    *
    * @param simulationTimeInt -- Run the simulation for this amopunt of seconds.
    */
   public int runForThisLong(int simulationTimeInt) {
      int time = 0;
      int simTime = 0;
      while (time < simulationTimeInt) {
         for (int i = 0; i < lightTimeInt; i++) {
            simTime = populate(probabilityInt, simTime);
         }
         //12 seconds has passed
         time += lightTimeInt;
         //Begin moving traffic for North and South

         simTime = moveTrafficNS(lightTimeInt, simTime);
         //12 seconds has passed
         time += lightTimeInt;
         //Populate again
         for (int i = 0; i < lightTimeInt; i++) {
            simTime = populate(probabilityInt, simTime);
         }
         //12 seconds has passed
         time += lightTimeInt;
         //Move east and west
         simTime = moveEW(lightTimeInt, simTime);
         time += lightTimeInt;
      }
      return simTime;
   }

   /**
    * Creates Car Objects based on the probability specified by the user.
    *
    * @param prob -- Probability chance, this is (1-100).
    */
   private int populate(int prob, int simTime) {
      int randNum;

      randNum = Car.RAND.nextInt(100) + 1;
      if (randNum <= prob) {
         //Car Object with destination and arrival time at 0
         Car newCar = new Car(vehicleNumber++, simTime, simTime);
         placeQueue(newCar);

      }
      simTime++;
      return simTime;
   }

   /**
    * Places the Car object into its corresponding Queue.
    *
    * @param car -- Car Object that is to be placed into the Queue.
    */
   private void placeQueue(Car car) {
      if (car.getStreet() == Car.Street.Dobson && car.getDirection() ==
              Car.Direction.N) {
         NDobson.enqueue(car);
      } else if (car.getStreet() == Car.Street.Dobson && car.getDirection() ==
              Car.Direction.S) {
         SDobson.enqueue(car);

      } else if (car.getStreet() == Car.Street.Southern && car.getDirection() ==
              Car.Direction.E) {
         ESouthern.enqueue(car);
      } else if (car.getStreet() == Car.Street.Southern && car.getDirection() ==
              Car.Direction.W) {
         WSouthern.enqueue(car);
      }
   }


   /**
    * Checks if the probability input from the user is an acceptable input.
    * Rules: No value less than 1, and the value must be a number.
    *
    * @param input -- User's input
    * @return True if an invalid input is found, false otherwise.
    * @throws InvalidInputException Thrown if the input is not an integer.
    */
   public boolean falseProbabilityCheck(String input) throws InvalidInputException {
      boolean invalidValueFound = false;
      char[] inputArray = ((input).toCharArray());
      for (int i = 0; i < inputArray.length; i++) {
         if ((inputArray[i] < 48 || inputArray[i] > 57)) {
            invalidValueFound = true;
         }
      }
      if (Integer.parseInt(input) < 1) {
         invalidValueFound = true;
      }
      return invalidValueFound;
   }

   /**
    * Used to check that the simulation time is all numbers.
    *
    * @param input -- Simulation time input given by user.
    * @return -- True if the simulation time given by the user is valid.
    */
   public boolean falseIntegerCheck(String input) throws InvalidInputException {
      boolean invalidValueFound = false;

      char[] inputArray = input.toCharArray();

      for (int i = 0; i < inputArray.length; i++) {
         if ((inputArray[i] < 48 || inputArray[i] > 57)) {
            invalidValueFound = true;
         }
      }

      return invalidValueFound;
   }

   /**
    * Move traffic North and South. It allows Car objects to "pass through"
    * (dequeue) by allowing One Car Object per second. The amount of seconds
    * it is allowed is explicitly given by the method parameter, lightTime.
    *
    * @param lightTime -- The amount of time that Car objects are allowed
    *                  to pass through.
    *                  One Car per second.
    */
   private int moveTrafficNS(int lightTime, int simTime) {
      int i = 0;
      while (i < lightTime) {
         try {
            if (!NDobson.isEmpty()) {
               Car car = new Car(0, 0, 0);
               car = (Car) NDobson.dequeue();
               car.setDepartureTime(simTime);
               NDobsonDelaysQueue.enqueue(car.totalTime());
            }
         } catch (EmptyCollectionException e) {
         }
         try {
            if (!SDobson.isEmpty()) {
               Car car = new Car(0, 0, 0);
               car = (Car) SDobson.dequeue();
               car.setDepartureTime(simTime);
               SDobsonDelaysQueue.enqueue(car.totalTime());
            }
         } catch (EmptyCollectionException e) {
         }
         i++;
      }
      simTime += lightTimeInt;
      return simTime;
   }

   /**
    * Move traffic East and South. It allows Car objects to "pass through"
    * (dequeue) by allowing One Car Object per second. The amount of seconds
    * it is allowed is explicitly given by the method parameter, lightTime.
    *
    * @param lightTime -- The amount of time that Car objects are allowed
    *                  to pass through. One Car per second.
    */
   private int moveEW(int lightTime, int simTime) {
      int i = 0;
      while (i < lightTime) {
         try {
            if (!ESouthern.isEmpty()) {
               Car car = new Car(0, 0, 0);
               car = ESouthern.dequeue();
               car.setDepartureTime(simTime);
               ESouthernDelaysQueue.enqueue(car.totalTime());
            }
         } catch (EmptyCollectionException e) {
         }
         try {
            if (!WSouthern.isEmpty()) {
               Car car = new Car(0, 0, 0);
               car = WSouthern.dequeue();
               car.setDepartureTime(simTime);
               WSouthernDelaysQueue.enqueue(car.totalTime());
            }
         } catch (EmptyCollectionException e) {
         }
         i++;
      }
      simTime += lightTime;
      return simTime;
   }


   /**
    * Displays the introduction, which is shown at the beginning of the program,
    * slightly before the user enters in the data.
    *
    * @param probability    -- Enter a probability chance (1 - 100).
    * @param simulationTime -- Total amount of time that the Simulator is
    *                       allowed to run.
    * @param lightChange    -- The total amount of time that the light is allowed to
    *                       be green before turning red.
    * @return -- String that displays an introduction for the program.
    */
   private String displayProbability(int probability, int simulationTime,
                                     int lightChange) {
      String result = String.format("Each street has a %2d%% chance to get a " +
              "new ", probability);
      String result1 = "car each second.";
      String result2 = String.format("\nLight changes from red to green every " +
              "%d" +
              " seconds.\n", lightChange);
      String result3 = String.format("Simulation length is %04d seconds",
              simulationTime);
      return result + result1 + result2 + result3;

   }

   /**
    * Displays a header for all the different queue's inside the Simulator Object
    * (North Dobson, South Dobson, East Southern, West Southern)
    *
    * @return -- Formatted String that displays a header for the different
    * queues in the Simulator Object.
    */
   private String displayNESWHeader() {
      String NSEW = String.format("%20s %5s %5s %6s", "N", "S", "E", "W");
      return NSEW;
   }


   /**
    * Returns a nicely formatted String that displays the amount of cars that
    * made it across the intersection.
    *
    * @return
    */
   private String carsAcross() {
      String result = String.format("%-18s %-5s %-5s %-6s %-7s",
              "Cars across: ",
              NDobsonDelaysQueue.size(),
              SDobsonDelaysQueue.size(),
              ESouthernDelaysQueue.size(),
              WSouthernDelaysQueue.size());

      return result;
   }

   /**
    * Calculates the total amount of delay times for a given queue.
    *
    * @param queue -- Queue to be calculated.
    * @return -- Sum of all elements in a queue.
    */
   private int calculateDelaysQueue(CircularArrayQueue queue) {
      int result = 0;
      int count = queue.size();
      int scan = 0;
      while (scan < count) {
         if (queue.getElement(scan) != null) {
            result += (int) queue.getElement(scan++);
         }
      }
      return result;
   }

   /**
    * Calculates the average delay time per Car in a queue.
    *
    * @param queue -- Queue to be calculated
    * @return The average delay time per Car
    */
   private int calculateAvgDelaysQueue(CircularArrayQueue queue) {
      int delaysQueueCounter = 0;
      int result = 0;
      int count = queue.size();
      int scan = 0;

      while (scan < count) {
         if (queue.getElement(scan) != null) {
            result += (int) queue.getElement(scan++);
            delaysQueueCounter++;
         }
      }
      return result / delaysQueueCounter;
   }

   /**
    * Returns a nicely formatted String of the total amount of delay times for
    * each Car Object for each queue.
    *
    * @return -- String that displays total delay times for each Queue in
    * the Simulator object.
    */
   private String totalDelays() {
      return String.format("%-18s %-5s %-5s %-6s %-7s", "Delay (tot): ",
              this.calculateDelaysQueue(NDobsonDelaysQueue),
              this.calculateDelaysQueue(SDobsonDelaysQueue),
              this.calculateDelaysQueue(ESouthernDelaysQueue),
              this.calculateDelaysQueue(WSouthernDelaysQueue));
   }

   /**
    * Returns a nicely formatted String of the average delay times for each
    * queue in the Simulator Object.
    *
    * @return -- Formatted string of the average delay times for each queue.
    */
   private String avgDelays() {
      return String.format("%-18s %-5s %-5s %-6s %-7s", "Delay (avg): ",
              (this.calculateAvgDelaysQueue(NDobsonDelaysQueue)),
              (this.calculateAvgDelaysQueue(SDobsonDelaysQueue)),
              (this.calculateAvgDelaysQueue(ESouthernDelaysQueue)),
              (this.calculateAvgDelaysQueue(WSouthernDelaysQueue)));
   }

   /**
    * Returns a nicely formatted String of the cars that were "stranded", or
    * left in the queue.
    *
    * @return -- Formatted String of the cars that were not dequeue'd at the
    * end of the simulation.
    */
   private String stranded() {
      return String.format("%-18s %-5s %-5s %-6s %-7s", "Stranded: ",
              this.NDobson.size(), this.SDobson.size(), this.ESouthern.size(),
              this.WSouthern.size());

   }
}
