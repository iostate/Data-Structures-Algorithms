/**
 * Programmer: Quan Truong
 * Date: 6/6/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: Sphere
 * <p>
 * Description: Allows for the creation of Sphere objects, the calculation of
 * the volume of said sphere, and the calculation of the surface area of said
 * sphere.
 */
public class Sphere {

    private double diameter;

    public Sphere(double diameter) {
        setDiameter(diameter);
    }


    //Retrieve the diameter of sphere object
    public String getDiameter() {
        return "Radius of this object is " + this.diameter;
    }

    //Set the diameter of sphere object
    public void setDiameter(double diameter) {

        this.diameter = diameter;
    }

    //Calculate the volume of the sphere object
    public double doVolume() {

        double fourThirds = (4 / 3.0);
        double radius = (diameter / 2.0);
        return fourThirds * Math.PI * (radius * radius * radius);
    }

    //Calculate the surface area of the sphere object
    public double doSurfaceArea() {
        return 4.0 * Math.PI * (this.diameter / 2.0) * (this.diameter / 2.0);
    }

    public String toString() {
        return "Sphere's diameter is: " + getDiameter();
    }
}
