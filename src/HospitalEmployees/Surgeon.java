package HospitalEmployees;

/**
 * Created by qmtruong92 on 6/18/17.
 */
public class Surgeon extends HospitalEmployees {

    //Communication rating
    protected int communicationRating;

    //Areas of specialty
    protected String[] specialties;

    //Bed side manner rating from 1-10
    private int bedsideMannerRating;

    Surgeon(String name, int age, double salary,
            double hoursPerWeek, int yearsAsEmployee, String[] specialties) {
        super(name, age, salary, hoursPerWeek, yearsAsEmployee);

        //setPosition() is a protected method declared in parent class
        setTitle("Dr. ");
        setSpecialties(specialties);
    }

    public String[] getSpecialties() {
        return this.specialties;
    }

    private void setSpecialties(String[] specialties) {
        this.specialties = specialties;
    }

    public int getCommunicationRating() {
        return this.communicationRating;
    }

    private void setCommunicationRating(int communicationRating) {
        this.communicationRating = communicationRating;
    }

    protected String listSpecialties() {

        String[] drSpecialties = this.getSpecialties();


        String drName = this.getPosition() + " " + this.getName() + "'s ";

        String specialties = "Specialties: \n";


        int i = 1;
        for (String each : drSpecialties) {
            specialties += "\n";
            specialties += i++ + ")" + each;
        }

        return drName + specialties;


    }

    public String toString() {


        return super.toString() + "\n" +
                "Communication Rating: " + this.getCommunicationRating() + "\n" +
                "Bedside Manner Rating: " + this.getBedsideMannerRating() + "\n\n" +
                this.listSpecialties();
    }

}