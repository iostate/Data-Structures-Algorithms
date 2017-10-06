package HospitalEmployees;

/**
 * Programmer: Quan Truong
 * Date: 6/17/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: HospitalEmployeesMain
 * <p>
 * Description: Creates and prints information about various employees at a hospital.
 */
public class HospitalEmployeesMain {


    public static void main(String[] args) {


        //Dr. Kimmel's specialties as a surgeon
        String[] drKimmelSpecialties =
                {"Telling Funny Jokes While During Heart Surgery",
                        "Butchering Public Persona With That God Awful Beard",
                        "Heart Surgery"};
        Doctor drKimmel = new Doctor("Jimmy Kimmel",
                45, 4000000.32, 120, 18, drKimmelSpecialties);
        drKimmel.setBedsideMannerRating(1);
        //Print Dr. Kimmel's information
        System.out.println("Dr. Kimmel: ");
        System.out.println(drKimmel.toString());


        //Nurse Karen
        Nurse nurseKaren = new Nurse("Karen Wrinkleytoe", 24, 65000, 60, 2, 8);
        nurseKaren.setBedsideMannerRating(9);
        nurseKaren.setCaringRating(8);
        nurseKaren.setResponsibilityRating(4);

        //Print Mrs. Wrinkleytoe's information
        System.out.println("Nurse Karen: ");
        System.out.println(nurseKaren.toString());


        //Administrator Pickle Breath
        Administrator pickleBreath = new Administrator("Pickle Breath", 72000, 90000, 74, 40000);
        pickleBreath.setBossyRating(14);
        pickleBreath.setLikable(false);
        pickleBreath.setEfficient(true);
        System.out.println("Mr. Breath: ");
        System.out.println(pickleBreath.toString());


        //Administrator of the Physician Group
        AdministratorPhysicianGroup mrsTwinkle = new AdministratorPhysicianGroup("Kelly Twinkle", 52, 76000, 65, 24);
        mrsTwinkle.setAbilityToWorkOver60HoursAWeek(true);
        mrsTwinkle.setAbilityToManageMultiplePeople(true);
        //Set the amount of hours Mrs. Twinkle can work over 60 hours
        mrsTwinkle.sethowManyOver60HoursAWeek(14);
        System.out.println("Mrs. " + mrsTwinkle.getName() + " is already working" +
                "this many hours over 60: " + mrsTwinkle.getHoursWorkingOver60()
                + "So can she work over 60 hours a week? " + mrsTwinkle.hoursWorkingOver60);
        System.out.println();


        //Set default salaries
        HospitalEmployees[] employees = new HospitalEmployees[4];
        employees[0] = drKimmel;
        employees[1] = nurseKaren;
        employees[2] = pickleBreath;
        employees[3] = mrsTwinkle;

        for (HospitalEmployees each : employees) {

            String title = each.getTitle();
            if (each.getPosition().equalsIgnoreCase("Administrator")) {
                each.setSalary(72000);
            } else if (each.getPosition().equalsIgnoreCase("Doctor")) {
                each.setSalary(4000000);
            } else if (each.getPosition().equalsIgnoreCase("Nurse")) {
                each.setSalary(90000);
            }


        }

        printSalaries(employees);


        //What is this? Apparently it is casting an Object type to the
        // polymorphic array
        ((Surgeon)employees[0]).setTitle("Dr.");


    }

    public static void printSalaries(HospitalEmployees[] employees) {

        for (HospitalEmployees each : employees) {
            System.out.println(each.getName() + "'s Salary: ");
            System.out.println(each.getSalary() + "\n");

        }
    }
}
