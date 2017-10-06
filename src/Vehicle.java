/**
 *
 Programmer: Quan Truong
 Date: 6/17/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: Vehicle

 Description: Allows for the creation of various types of vehicles, with
 detailed fields, such as manufacturer, model, horsepower, cost, mpg, capacity, etc.

 */

public class Vehicle {


    protected String manufacturer;
    protected String model;
    protected int horsepower;
    protected double cost;
    protected int capacity;
    protected int mpg;

    //Constructors parameter order should be just as seen above


    /**
     * TODO:
     * 1) Some fields should be protected
     * 2) Proper method prologues
     */

    /**
     * Default constructor
     *
     * @param manufacturer
     * @param model
     * @param cost
     * @param horsepower
     * @param capacity
     */
    public Vehicle(String manufacturer, String model, double cost, int horsepower, int capacity, int mpg) {
        setManufacturer(manufacturer);
        setModel(model);
        setCost(cost);
        setHorsepower(horsepower);
        setCapacity(capacity);
        setMpg(mpg);

    }

    /**
     * Gets the manufacturer of the vehicle
     *
     * @return
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * Set the manufacturer
     *
     * @param manufacturer
     */
    private void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Get the model of the vehicle
     *
     * @return String
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model of the vehicle
     *
     * @param model
     */
    private void setModel(String model) {
        this.model = model;
    }


    /**
     * Getter method for cost
     * @return double Cost of vehicle
     */
    public double getCost() {
        return this.cost;
    }

    /**
     * Sets the cost of the vehicle
     *
     * @param cost Cost of vehile
     */
    private void setCost(double cost) {
        this.cost = cost;
    }





    /**
     * Get the capacity of the vehicle
     *
     * @return int
     */
    public int getCapacity() {
        return this.capacity;
    }


    /**
     * Set the capacity of the vehicle
     *
     * @param capacity
     */
    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    /**
     * Get the horsepower of the vehicle
     *
     * @return int
     */
    public int getHorsepower() {
        return this.horsepower;
    }

    /**
     * Set the horsepower of the vehicle
     *
     * @param horsepower
     */
    private void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    /**
     * Get miles per gallon for vehicle
     * @return
     */
    public int getMpg() {
        return this.mpg;
    }

    /**
     * Setter method for Miles Per Gallon
     * @param mpg
     */
    private void setMpg(int mpg) {
        this.mpg = mpg;

    }

    /**
     * toString for the Vehicle class
     *
     * @return
     */
    public String toString() {
        String result = "";

        result += "Car manufacturer: " + getManufacturer() +
                "\nCar model: " + getModel() +
                "\nCar Capacity: " + getCapacity() +
                "\nCar Horsepower: " + getHorsepower();

        return result;

    }


    /**
     * Create SUVs
     */
    public static class SUV extends Vehicle {

        //Does the car have passenger air bags? I hope so.
        private boolean passengerAirBags;

        // Does the car have an electric back door?
        private boolean electricBackDoor;

        //How many monitors does the car have
        private int monitors;


        /**
         * Default constructor for the SUV subclass
         * @param manufacturer
         * @param model
         * @param horsepower
         * @param cost
         * @param capacity
         * @param mpg
         * @param passengerAirBags
         * @param electricBackDoor
         * @param monitors
         */
        SUV(String manufacturer, String model, int horsepower, double cost,
            int capacity, int mpg, boolean passengerAirBags,
            boolean electricBackDoor, int monitors) {
            super(manufacturer, model, cost, horsepower, capacity, mpg);
            setPassengerAirBags(passengerAirBags);
            setElectricBackDoor(electricBackDoor);
            setMonitors(monitors);
        }

        /**
         * Setter method for electric back door
         * @param electricBackDoor
         */
        public void setElectricBackDoor(boolean electricBackDoor) {
            this.electricBackDoor = electricBackDoor;
        }

        /**
         * Setter method for pasenge  air bags
         * @param passengerAirBags
         */
        public void setPassengerAirBags(boolean passengerAirBags) {
            this.passengerAirBags = passengerAirBags;
        }

        /**
         * Setter method for monitors in the vehicle
         * @param numberOfMonitors
         */
        public void setMonitors(int numberOfMonitors) {
            this.monitors = monitors;
        }
    }


    /**
     * Create supercars
     */
    public static class SuperCar extends Vehicle {

        private int numberOfTurbos;
        private String interiorType;

        /**
         * Default constructor for the SuperCar class
         * @param manufacturer
         * @param model
         * @param cost
         * @param horsepower
         * @param capacity
         * @param mpg
         * @param turbos
         * @param interiorType
         */
        public SuperCar(String manufacturer, String model, double cost,
                        int horsepower, int capacity, int mpg, int turbos, String interiorType) {
            super(manufacturer, model, cost, horsepower, capacity, mpg);
            setNumberOfTurbos(turbos);
            setInteriorType(interiorType);

        }


        /**
         * Getter method for the number of turbos
         * @return
         */
        public int getNumberOfTurbos() {
            return numberOfTurbos;
        }

        /**
         * Setter method for the number of turbos
         * @param numberOfTurbos
         */
        private void setNumberOfTurbos(int numberOfTurbos) {
            this.numberOfTurbos = numberOfTurbos;
        }

        /**
         * Getter method for the interior type
         * @return
         */
        public String getInteriorType() {
            return this.interiorType;
        }

        /**
         * Setter method for the interior type
         * @param interiorType
         */
        private void setInteriorType(String interiorType) {
            this.interiorType = interiorType;
        }

        /**
         * Display information about the supercar
         * @return
         */
        public String toString() {
            return super.toString() + "\nNumber of turbos: " + this.getNumberOfTurbos() + "\nType of Interior: " + this.getInteriorType();

        }
    }

    /**
     * Create a Sedan
     */
    public class Sedan extends Vehicle {


        /**
         * Default constructor for the Sedan class
         *
         * @param manufacturer
         * @param model
         * @param cost
         * @param horsepower
         * @param capacity
         * @param mpg
         */
        Sedan(String manufacturer, String model, double cost, int horsepower, int capacity, int mpg) {

            super(manufacturer, model, cost, horsepower, capacity, mpg);

        }
    }
}




