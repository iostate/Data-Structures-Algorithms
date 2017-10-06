package Lists;

/**
 * Created by qmtruong92 on 7/14/17.
 */
public class ProgramOfStudyMain {

    public static void main(String[] args) {

        ProgramOfStudy qua2119099 = new ProgramOfStudy();
        //Create two new courses
        Course csc205 = new Course("CSC", 205, "Data Structures" + "and Algorithms", "A");
        Course ece103 = new Course("ECE", 103, "Engineering Analysis", "A");
        //Add the courses to my program of study
        qua2119099.addCourse(csc205);
        qua2119099.addCourse(ece103);
        System.out.println(qua2119099.toString());

    }

}
