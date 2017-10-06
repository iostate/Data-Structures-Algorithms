
/**
 * Created by qmtruong92 on 6/18/17.
 */
public class Administrator extends HospitalEmployees {
    private int bossyRating;
    private boolean efficient;
    private boolean likable;
    protected double hoursWorkingOver60;

    public Administrator(String name, int age, double salary,
                         double hoursPerWeek, int yearsAsEmployee) {
        super(name, age, salary, hoursPerWeek, yearsAsEmployee);
        setPosition("Administrator");
    }

    public int getBossyRating() {
        return bossyRating;
    }

    public void setBossyRating(int bossyRating) {
        this.bossyRating = bossyRating;
    }

    public boolean getLikable() {
        return this.likable;
    }

    public void setLikable(boolean likable) {
        this.likable = likable;
    }

    public boolean getEfficient() {
        return this.efficient;
    }

    public void setEfficient(boolean efficient) {
        this.efficient = efficient;
    }

    public String toString() {

        boolean[] adminDetailsArray = {this.getLikable(), this.getEfficient()};
        String[] nicelyFormattedBooleans = convertBooleanToPresentableString(adminDetailsArray);


        return super.toString() + "\n\nAdministrator Specific Details: \n\n" +
                "Bossy Rating: " + this.getBossyRating() + "\nIs this a likable Administrator? " +
                nicelyFormattedBooleans[0] +
                "\nIs this an efficient Administrator? " + nicelyFormattedBooleans[1];
    }

}
