/**
 *
 Programmer: Quan Truong
 Date: 6/19/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: SecretoMain.java

 Description: Creates a secret object, encrypts and decrypts it, and prints
 both versions to the screen.

 */

package Secreto;

public class PasswordMain {

    public static void main(String[] args) {


        Password simple = new Password("Simple");

        simple.encrypt();

        System.out.print("Simple encrypted: ");
        System.out.println(simple.toString());

        simple.decrypt();

        System.out.println("Simple decrypted: ");
        System.out.println(simple.toString());

        Secret simply = new Secret("Simply");

        simply.encrypt();

        System.out.print("Simply encrypted: ");
        System.out.println(simply.toString());

        simply.decrypt();

        System.out.print("Simply decrypted: ");
        System.out.println(simply.toString());
    }
}
