/**
 * Programmer: Quan Truong
 * Date: 6/19/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: Password.java
 * <p>
 * Description: Creates a Password object, and then assigns it to a Secret
 * object, which is a parent class of Password. The polymorphic variable is
 * then encrypted and decrypted, and printed when either is performed on the
 * variable.
 */


package Password;

public class PasswordMain {

    public static void main(String[] args) {


        Encryption var = new Secret();

        //encrypt and print
        var.encrypt();
        System.out.println(var.toString());
        //decrypt and print
        var.decrypt();
        System.out.println(var.toString());



        var = new Password("Hello");
        //encrypt and print
        var.encrypt();
        System.out.println(var.toString());
        //decrypt and print
        var.decrypt();
        System.out.println(var.toString());

    }
}



