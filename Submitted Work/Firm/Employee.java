/**
 *
 Programmer: Quan Truong
 Date: 6/20/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: Employee

 Description: Allows for the creation of Employees in a Firm.

 */

package Firm;

public class Employee extends StaffMember implements Payable {

    protected String socialSecurityNumber;
    protected double payRate;



    public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate) {

        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    public String toString() {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    public double pay() {

        return payRate;
    }
}
