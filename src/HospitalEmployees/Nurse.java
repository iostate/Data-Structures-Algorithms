package HospitalEmployees;

/**
 * Created by qmtruong92 on 6/18/17.
 */
public class Nurse extends HospitalEmployees {

    private int caringRating;
    private int empathyRating;
    private int responsibilityRating;


    /**
     * Default constructor for Nurse employee
     *
     * @param name
     * @param age
     * @param salary
     * @param hoursPerWeek
     * @param yearsAsEmployee
     * @param bedsideMannerRating
     */
    Nurse(String name, int age, double salary,
          double hoursPerWeek, int yearsAsEmployee, int bedsideMannerRating) {
        super(name, age, salary, hoursPerWeek, yearsAsEmployee);
        setPosition("Nurse");
        setBedsideMannerRating(bedsideMannerRating);
    }


    /**
     * Setter method for Nurse's bedside manner rating
     *
     * @param bedsideMannerRating
     */
    public void setBedsideMannerRating(int bedsideMannerRating) {
        if (bedsideMannerRating < 1 || bedsideMannerRating > 10) {
            System.out.println("Please enter a rating between 1-10");
        } else {
            this.bedsideMannerRating = bedsideMannerRating;
        }
    }

    public int getCaringRating() {
        return this.caringRating;
    }

    public void setCaringRating(int caringRating) {
        this.caringRating = caringRating;
    }

    public int getEmpathyRating() {
        return empathyRating;
    }

    public void setEmpathyRating(int empathyRating) {
        this.empathyRating = empathyRating;
    }

    public int getResponsibilityRating() {
        return responsibilityRating;
    }

    public void setResponsibilityRating(int responsibilityRating) {
        this.responsibilityRating = responsibilityRating;
    }

    public String toString() {

        return super.toString() + "\nNurse Specific Details: \n\n" +
                "Bedside Manner Rating: " + this.getBedsideMannerRating()
                + "\nCaring Rating: " + this.getCaringRating() +
                "\nResponsibility Rating: " + this.getResponsibilityRating();
    }
}