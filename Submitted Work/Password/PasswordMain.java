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


package PasswordSubmission;

import PasswordSubmission.*;
import PasswordSubmission.Password;
import PasswordSubmission.Secret;

public class PasswordMain {

    public static void main(String[] args) {


        // Encrypt and Decrypt using Encryption Object Variable
        PasswordSubmission.Encryption var = new Secret();
        //encrypt and print
        var.encrypt();
        System.out.println("Encrypting using Encryption Object Variable: ");
        System.out.println(var.toString());
        //decrypt and print
        var.decrypt();
        System.out.println("Decrypting using Decryption Object Variable: ");
        System.out.println(var.toString());
        System.out.println();



        // Encrypt and Decrypt using Password Object Variable
        var = new Password("Hello");
        //encrypt and print
        var.encrypt();
        System.out.println("Encrypting using Password Object Variable: ");
        System.out.println(var.toString());
        //decrypt and print
        var.decrypt();
        System.out.println("Decrypting using Password Object Variable: ");
        System.out.println(var.toString());
    }
}



