
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Programmer: Quan Truong
 * Date: 6/17/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: HospitalEmployees.HospitalEmployees
 * <p>
 * Description: Allows for the creation of various Hospital employee
 * positions.
 */

public class HospitalEmployees {

    private final Scanner kb = new Scanner(System.in);

    protected String position;
    protected String name;
    protected int age;
    protected double salary;
    protected double hoursPerWeek;
    protected int yearsAsEmployee;
    protected int bedsideMannerRating;
    protected String title;

    /**
     * Default constructor for Hospital Employees
     *
     * @param name
     * @param age
     * @param salary
     * @param hoursPerWeek
     * @param yearsAsEmployee
     */
    public HospitalEmployees(String name, int age, double salary,
                             double hoursPerWeek, int yearsAsEmployee) {
        setPosition(position);
        setName(name);
        setAge(age);
        setSalary(salary);
        setHoursPerWeek(hoursPerWeek);
        setYearsAsEmployee(yearsAsEmployee);

    }

    public String getPosition() {
        return this.position;
    }

    protected void setPosition(String position) {
        this.position = position;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return this.name;
    }


    private void setName(String name) {
        this.name = name;
    }

    //Get the age of an employee
    public int getAge() {
        return this.age;
    }

    //Set the age of an employee
    private void setAge(int age) {
        this.age = age;
    }


    //Get the salary of an employee
    public double getSalary() {
        return this.salary;
    }


    //Set the salary of an employee
    private void setSalary(double salary) {
        this.salary = salary;
    }


    //Default toString method
    public String toString() {

        DecimalFormat salaryFormatter = new
                DecimalFormat("###,###,###.00");


        return "Employee Details: \n\n" +
                "Name: " + this.getName() + "\n" +
                "Age: " + this.getAge() + "\n" +
                "Years Employed at Hospital: " + this.getYearsAsEmployee() + "\n" +
                "Salary: " + salaryFormatter.format(this.getSalary()) + "\n" +
                "Hours per Week: " + this.getHoursPerWeek() + "\n";
    }

    public double getHoursPerWeek() {
        return this.hoursPerWeek;
    }

    private void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getYearsAsEmployee() {
        return this.yearsAsEmployee;
    }

    private void setYearsAsEmployee(int yearsAsEmployee) {
        this.yearsAsEmployee = yearsAsEmployee;
    }

    public int getBedsideMannerRating() {
        return this.bedsideMannerRating;
    }

    protected void setBedsideMannerRating(int bedsideMannerRating) {

        while (bedsideMannerRating < 1 || bedsideMannerRating > 10) {

            System.out.print("Please enter a bedside manner between 1 and 10: ");
            bedsideMannerRating = kb.nextInt();
            setBedsideMannerRating(bedsideMannerRating);


        }
        this.bedsideMannerRating = bedsideMannerRating;
    }

    /**
     * Converts the boolean to a nicely formatted String array.
     *
     * @param array
     * @return
     */
    protected String[] convertBooleanToPresentableString(boolean[] array) {

        String[] resultArray = new String[array.length];

        int i = 0;

        for (boolean each : array) {

            String booleanConvertedToString = String.valueOf(each);


            char firstLetterCapitalized = Character.toUpperCase(
                    booleanConvertedToString.charAt(0));

            String trueOrFalseUpperCase = firstLetterCapitalized + booleanConvertedToString.substring(1, booleanConvertedToString.length());


            resultArray[i++] = trueOrFalseUpperCase;
        }


        return resultArray;
    }


}
