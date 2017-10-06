
/**
 *
 *
 Programmer: Quan Truong
 Date: 6/17/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: HospitalEmployeesMain

 Description: Creates and prints information about various employees at a hospital.
 */
public class HospitalEmployeesMain {

    public static void main(String[] args) {


        //Dr. Kimmel's specialties as a surgeon
        String[] drKimmelSpecialties =
                {"Telling Funny Jokes While During Heart Surgery",
                "Butchering Public Persona With That God Awful Beard",
                "Heart Surgery"};

        /*
        //Dr. Kimmel, head heart surgeon
        Surgeon drKimmel =
                new Surgeon(
                "Jimmy Kimmel", 45, 4000000.32, 120, 18, drKimmelSpecialties);


        //Set Dr Kimmel's bedside manner rating
        drKimmel.setBedsideMannerRating(1);
        //Print Dr. Kimmel's employee information
        System.out.println(drKimmel.toString());

        */

        Doctor drKimmel = new Doctor("Jimmy Kimmel",
                45, 4000000.32, 120, 18, drKimmelSpecialties);

        drKimmel.setBedsideMannerRating(1);

        System.out.println(drKimmel.toString());


        //Nurse Karen
        Nurse nurseKaren = new Nurse("Karen Wrinkleytoe", 24, 65000, 60, 2, 8);
        nurseKaren.setBedsideMannerRating(9);
        nurseKaren.setCaringRating(8);
        nurseKaren.setResponsibilityRating(4);

        System.out.println("Nurse Karen: ");

        System.out.println(nurseKaren.toString());


        //Administrator Pickle Breath
        Administrator adminPickleBreath = new Administrator("Pickle Breath", 72000, 90000, 74, 40000);
        adminPickleBreath.setBossyRating(14);
        adminPickleBreath.setLikable(false);
        adminPickleBreath.setEfficient(true);

        System.out.println(adminPickleBreath.toString());



        //Administrator of the Physician Group
        AdministratorPhysicianGroup mrsTwinkle = new AdministratorPhysicianGroup("Kelly Twinkle", 52, 76000, 65, 24);
        mrsTwinkle.setAbilityToWorkOver60HoursAWeek(true);
        mrsTwinkle.setAbilityToManageMultiplePeople(true);

        //Set the amount of hours Mrs. Twinkle can work over 60 hours

        mrsTwinkle.sethowManyOver60HoursAWeek(14);
        //If she is already working over 60, prints the amount of hrs she is
        // already working over 60

        System.out.println("Mrs. " + mrsTwinkle.getName() + " is already working" +
                "this many hours over 60: " + mrsTwinkle.getHoursWorkingOver60()
        + "So can she work over 60 hours a week? " + mrsTwinkle.hoursWorkingOver60);
    }
}
