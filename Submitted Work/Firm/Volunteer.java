package Firm;

/**
 * Created by qmtruong92 on 6/19/17.
 */
public class Volunteer extends StaffMember implements Payable {


    public Volunteer(String eName, String eAddress, String ePhone ) {
        super (eName, eAddress, ePhone);
    }

    public double pay() {
        return 0.0;
    }
}
