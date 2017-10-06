/**
 *
 Programmer: Quan Truong
 Date: 6/20/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: Executive

 Description: Allow for the creation of Executive Employees in a Firm.

 */

package Firm;

public class Executive extends Employee implements Payable {


    private double bonus;

    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate ) {
        super(eName, eAddress, ePhone, socSecNumber, rate );

        bonus = 0;

    }

    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    public double pay() {
        double payment = super.pay() + bonus;

        bonus = 0;

        return payment;
    }
}
