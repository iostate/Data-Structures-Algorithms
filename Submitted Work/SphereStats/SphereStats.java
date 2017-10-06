/**
 * Programmer: Quan Truong
 * Date: 05/31/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: SphereStats
 * <p>
 * Description: Calculates the volume of a sphere, as well as the surface area of
 * a sphere.
 */
public class SphereStats {

    private double radius;

    public SphereStats(double radius) {
        this.radius = radius;
    }


    //Retrieve the radius of sphere object
    public String getRadius() {
        return "Radius of this object is " + this.radius;
    }

    //Set the radius of sphere object
    public void setRadius(double radius) {

        this.radius = radius;
    }

    //Calculate the volume of the sphere object
    public double doVolume() {

        double fourThirds = (4 / 3.0);
        return fourThirds * Math.PI * (this.radius * this.radius * this.radius);
    }

    //Calculate the surface area of the sphere object
    public double doSurfaceArea() {
        return 4.0 * Math.PI * (this.radius * this.radius);
    }

}
