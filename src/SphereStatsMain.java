import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Programmer: Quan Truong
 * Date: 6/3/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: SphereStatsMain
 * <p>
 * Description: Formats the volume and surface area calculations of the SphereStats
 * object.
 */
public class SphereStatsMain {

    public static void main(String[] args) {
        double radius;
        boolean done = false;
        String isDone;

        Scanner kb = new Scanner(System.in);

        do {

            System.out.print("Please enter the radius of sphere: ");
            radius = kb.nextDouble();
            System.out.println();

            // Create the Sphere object with user given data
            SphereStats a1Sphere = new SphereStats(radius);

            //Format to .4 decimals
            DecimalFormat df4 = new DecimalFormat(".0000");

            //Print surface area calculation of the Sphere
            System.out.print("Surface area of sphere with radius of " + radius
                    + ": ");
            System.out.println(df4.format(a1Sphere.doSurfaceArea()));
            System.out.println();

            //Print the volume calculation for the sphere
            System.out.print("Volume of sphere with radius of " + radius + ": "
            );
            System.out.println(df4.format(a1Sphere.doVolume()));
            System.out.println();

            //Notify the user that there is a way to exit the program
            System.out.println("Do you want to exit? Y or N");
            isDone = kb.next();

            if (isDone.equalsIgnoreCase("y")) {
                done = true;
            }

        } while (done != true);

    }
}
