/**
 * Programmer: Quan Truong
 * Date: 6/4/17
 * Class: CSC205
 * Professor: Mrs. Heil
 * Assignment: RandomPhone
 *
 * Description: Generates a random phone number from the RandomPhone
 * class.
 */
public class RandomPhoneMain {

    public static void main(String[] args) {

        //Generate a new random phone number
        RandomPhone myNewNumber = new
                RandomPhone(RandomPhone.genRandomPhoneNumber());

        System.out.println(myNewNumber.toString());

    }
}
