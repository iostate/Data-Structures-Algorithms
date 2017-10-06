/**
  * Secret.java                Java Foundations
  *
  * Represents a secret message that can be encrypted
  * and decrypted.
  */

package Secreto;

import java.util.Random;
  
public class Secret implements Encryption {
  
   private String message;
   private boolean encrypted;
   private int shift;
   private Random generator;
  
  /**
    * Constructor: Stores the original message and establishes
    * a value for the (randomly created) encryption shift.
    * @param msg String representing the original message
    */
   public Secret( String msg ) {
      message = msg;
      encrypted = false;
      generator = new Random();
      shift = generator.nextInt(10) + 5;
   } // constructor

/**
  * Encrypts this secret using a Caesar cipher. Has no effect
  * if this secret is already encrypted.
  */
   public void encrypt() {
      if( ! encrypted ) {
         String masked = "";
         for ( int i=0; i<message.length(); i++ ) {
            masked = masked + (char)(message.charAt(i) + shift );
         } // for
         message = masked;
         encrypted = true;
      } // if
   } // method 
  
  /** 
    * Decrypts and returns this secret. Has no effect if this
    * secret is not currently encrypted.
    * @ return decrypted String
    */
   public String decrypt() {
      if ( encrypted ) {
         String unmasked = "";
         for ( int i=0; i<message.length(); i++ ) {
            unmasked = unmasked + (char)(message.charAt(i) - shift);
         } // for
         message = unmasked;
         encrypted = false;
      } // if
      return message;
   } // method
  
  /**
    * Returns true if this secret is currently encrypted.
    * @return true if encrypted; otherwise false
    */
   public boolean isEncrypted() {
      return encrypted;
   } // method
  
  /** 
    * Returns this secret (may be encryped).
    * @return message -- may or may not be encrypted
    */
   public String toString() {
      return message;
   } // method
  
} // class