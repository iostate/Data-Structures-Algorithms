/**
 *
 *
 Programmer: Quan Truong
 Date: 6/19/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: Password.java

 Description: Allows for the creation of encryptable objects.
 */

package Secreto;

import java.util.Random;

public class Password implements Encryptable {

    private String message;
    private boolean encrypted;
    private int shift;
    private int shift2;
    private Random rand;


    //Default constructor
    public Password(String msg) {

        message = msg;
        encrypted = false;
        rand = new Random();

        shift = rand.nextInt(10);
        shift2 = rand.nextInt(14);

    }


    //Encrypts the message
    public void encrypt() {

        if (!encrypted) {
            String masked = "";
            for (int i = 0; i < message.length(); i++) {
                masked = masked + (char) (message.charAt(i) + (shift2 / shift));
            }

            message = masked;
            encrypted = true;
        }
    }


    //Decrypts the message
    public String decrypt() {
        if ( encrypted ) {
            String unmasked = "";
            for (int i = 0; i < message.length(); i++) {
                unmasked = unmasked + (char)(message.charAt(i) - (shift2 / shift));
            }
            message = unmasked;
            encrypted = false;
        }

        return message;
    }


    //Converts the message to a String
    public String toString() {
        return this.message;
    }
}