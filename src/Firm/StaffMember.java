package Firm;

/**
 * Created by qmtruong92 on 6/19/17.
 */
abstract class StaffMember implements Payable {


    protected String name;
    protected String address;
    protected String phone;



    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    public String toString() {
        String result = "Name: " + name + "\n";

        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
    }


    //Abstract reserved method
    public abstract double pay();
}
