/**
 *
 Programmer: Quan Truong
 Date: 6/20/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: Hourly

 Description: ALlows for the creation of Hourly employees.

 */

package Firm;

public class Hourly extends Employee implements Payable {

    private int hoursWorked;

    public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;

    }

    public double pay() {

        double payment = payRate * hoursWorked;

        hoursWorked = 0;

        return payment;
    }

    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    public String toString() {
        String result = super.toString();

        result += "\nCurrent hours: " + hoursWorked;
//        this.count--;
        return result;
    }
}
