import java.text.DecimalFormat;

/**
 *
 Programmer: Quan Truong
 Date: 6/6/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: SphereMainCore

 Description: Creates several Sphere objects and performs surface area and
 volume calculations on them.

 NOTE: Setter methods are tested through the implicit toString method calls
 on line 25, 35, and 45

 */
public class SphereMain {

    public static void main(String[] args) {

        //Formats an output to 3 decimal places
        DecimalFormat df4 = new DecimalFormat(".000");


        Sphere a1 = new Sphere(5.52);
        Sphere b1 = new Sphere(523.96);
        Sphere c1 = new Sphere(6782.9182);

        //Calculations for a1 sphere
        System.out.println(a1);
        System.out.print("a1's surface area is :");
        System.out.println(df4.format(a1.doSurfaceArea()));
        System.out.print("a1's volume is: ");
        System.out.println(df4.format(a1.doVolume()));
        System.out.println();

        //Calculations for b1 sphere
        System.out.println(b1);
        System.out.print("b1's surface area is :");
        System.out.println(df4.format(b1.doSurfaceArea()));
        System.out.print("b1's volume is: ");
        System.out.println(df4.format(b1.doVolume()));
        System.out.println();

        //Calculations for c1 sphere
        System.out.println(c1);
        System.out.print("c1's surface area is: ");
        System.out.println(df4.format(c1.doSurfaceArea()));
        System.out.print("c1's volume is: ");
        System.out.println(df4.format(c1.doVolume()));
        System.out.println();
    }
}
