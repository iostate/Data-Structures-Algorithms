package HospitalEmployees;

/**
 * Created by qmtruong92 on 6/18/17.
 */
public class Doctor extends Surgeon {

    public Doctor(String name, int age, double salary,
                  double hoursPerWeek, int yearsAsEmployee, String[] doctorSpecialties) {
        super(name, age, salary, hoursPerWeek, yearsAsEmployee, doctorSpecialties);
        setPosition("Doctor");
        setTitle("Dr.");

    }

    public String toString() {
        return super.toString() + "\n" +
                "Communication Rating: " + this.getCommunicationRating() + "\n" +
                "Bedside Manner Rating: " + this.getBedsideMannerRating() + "\n\n" +
                this.listSpecialties();
    }
}