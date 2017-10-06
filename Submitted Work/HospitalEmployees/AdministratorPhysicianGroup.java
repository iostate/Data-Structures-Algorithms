
/**
 * Created by qmtruong92 on 6/18/17.
 */
public class AdministratorPhysicianGroup extends Administrator {

    private boolean abilityToManageMultiplePeople;
    private boolean abilityToWorkOver60HoursAWeek;
    private double howManyOver60HoursAWeek;



    public AdministratorPhysicianGroup(String name, int age, double salary,
                                       double hoursPerWeek, int yearsAsEmployee) {
        super(name, age, salary, hoursPerWeek, yearsAsEmployee);
        setPosition("Administrator");

    }

    public void setAbilityToWorkOver60HoursAWeek(boolean value) {

        if (this.getHoursPerWeek() > 60) {
            this.abilityToWorkOver60HoursAWeek = true;
        } else if (this.getHoursPerWeek() <= 60) {
            this.abilityToWorkOver60HoursAWeek = value;
        }

    }


    public void setAbilityToManageMultiplePeople(boolean value) {
        this.abilityToManageMultiplePeople = value;
    }

    public double getHoursWorkingOver60() {
        return this.hoursWorkingOver60;
    }

    public boolean getAbilityToManageMultiplePeople() {
        return this.abilityToManageMultiplePeople;
    }

    public boolean getAbleToWorkOver60HoursAWeek() {
        return this.abilityToWorkOver60HoursAWeek;
    }

    public void sethowManyOver60HoursAWeek(double value) {

        if (this.getHoursPerWeek() > 60) {
            double sixty = 60;

            double currentAmtOfHoursOver60 = this.getHoursPerWeek();

            hoursWorkingOver60 = currentAmtOfHoursOver60 - sixty;


            this.howManyOver60HoursAWeek = value;
        } else {
            this.howManyOver60HoursAWeek = value;
        }


    }

    public double getHowManyOver60HoursAWeek() {
        return this.howManyOver60HoursAWeek;
    }


}
