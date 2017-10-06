import java.util.Random;

/**
 *
 Programmer: Quan Truong
 Date: 6/17/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: VehicleMain

 Description: Creates Vehicles from the Vehicles class, combines two vehicles,
 and prints information about the vehicles created.

 */

public class VehicleMain {

    public static void main(String[] args) {


        /**
         * Default constructor
         *
         * @param manufacturer
         * @param model
         * @param cost
         * @param horsepower
         * @param capacity
         */


        //Create a Ferrari F40
        Vehicle.SuperCar ferrariF40 = new Vehicle.SuperCar("Ferrari", "F40", 4000000, 240, 2, 14, 2, "Alcanterra");

        //Create a Ford Pinto
        Vehicle fordPinto = new Vehicle("Ford", "Pinto",
                2000, 75, 2, 22);

        //Combine the Ferrari F40
        Vehicle PintoRari = combine(ferrariF40, fordPinto);

        //Print information about the newly created vehicle
        System.out.println("PintoRari details: \n");
        System.out.println(PintoRari.toString() + "\n");

        //Print information about the Ferrari F40
        System.out.println("Ferrari F40 Details: \n");
        System.out.println(ferrariF40.toString());

    }


    /**
     * Combines two vehicle's properties to output a new Vehicle
     * @param car
     * @param secondCar
     * @return Vehicle Combined car of car and secondCar
     */
    public static Vehicle combine(Vehicle car, Vehicle secondCar) {

        Random rand = new Random();
        String manufacturer = scramble(rand, car.getManufacturer()) + scramble(rand, secondCar.getManufacturer());
        String model = car.getModel() + secondCar.getModel();
        int horsePower = car.getHorsepower() + secondCar.getHorsepower();
        double cost = car.getCost() + secondCar.getCost();
        int capacity = car.getCapacity() + secondCar.getCapacity();
        int mpg = (int) (Math.pow((car.getMpg() + secondCar.getMpg()),3) * 540 /3.97);

        return new Vehicle(manufacturer, model, cost, horsePower, capacity, mpg);


    }


    /**
     * Generate a new name for a combined car.
     * @param random
     * @param inputString
     * @return String Scrambled name.
     */
    public static String scramble( Random random, String inputString )
    {
        //Convert String to char array
        char a[] = inputString.toCharArray();

        //Scramble letters
        for( int i=0 ; i<a.length ; i++ )
        {
            int j = random.nextInt(a.length);
            //Swap letters
            char temp = a[i]; a[i] = a[j];  a[j] = temp;
        }
        return new String( a );
    }



}
