import Queues.jsjf.*; // pulls in QueueADT.java, LinkedQueue.java


/**
 * Codes demonstrates the use of Java locally-implemented queues
 * to encrypt and decrypt messages.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class Codes2 {
   /**
    * Encode and decode a message using a key of values stored in
    * a queue.
    */
   public static void main(String[] args) {
      int[] key = {5, 12, -3, 8, -9, 4, 10};
      Integer keyValue;
      String encoded = "", decoded = "";
      String message = "All programmers are playwrights and all " +
              "computers are lousy actors.";
      //Queue<Integer> encodingQueue = new LinkedList<Integer>();
      //Queue<Integer> decodingQueue = new LinkedList<Integer>();
      QueueADT<Integer> encodingQueue = new LinkedQueue<Integer>();
      QueueADT<Integer> decodingQueue = new LinkedQueue<Integer>();

      // load key queues 
      for (int scan = 0; scan < key.length; scan++) {
         //encodingQueue.add(key[scan]);
         //decodingQueue.add(key[scan]);
         encodingQueue.enqueue(key[scan]);
         decodingQueue.enqueue(key[scan]);
      }

      // encode message 
      for (int scan = 0; scan < message.length(); scan++) {
         //keyValue = encodingQueue.remove();
         keyValue = encodingQueue.dequeue();
         encoded += (char) (message.charAt(scan) + keyValue);
         //encodingQueue.add(keyValue);
         encodingQueue.enqueue(keyValue);
      }

      System.out.println("Encoded Message:\n" + encoded + "\n");

      // decode message 
      for (int scan = 0; scan < encoded.length(); scan++) {
         //keyValue = decodingQueue.remove();
         keyValue = decodingQueue.dequeue();
         decoded += (char) (encoded.charAt(scan) - keyValue);
         //decodingQueue.add(keyValue);
         decodingQueue.enqueue(keyValue);
      }

      System.out.println("Decoded Message:\n" + decoded);
   }
}
