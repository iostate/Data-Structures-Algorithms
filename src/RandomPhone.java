import java.text.DecimalFormat;
import java.util.Random;

/**
 * Programmer: Quan Truong
 * Date: 05/31/17
 * Class: CSC205
 * Professor: Victoria Heil
 * <p>
 * Description: A program that generates a random phone number, with a few
 * restrictions. The restrictions are: The first number cannot contain an 8 or
 * a 9, and the second number cannot be larger than 742.
 */


public class RandomPhone {

    public static final Random rand = new Random();
    private String phoneNumber;

    public RandomPhone(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public static String genRandomPhoneNumber() {

        //Calculate the first three digits of the phone number
        int firstSetOfNumbers = (rand.nextInt(7) + 1) * 100 +
                (rand.nextInt(8) * 10) + rand.nextInt(8);

        //Calculate the 3rd to 6th digit of the phone number, ensures that the
        //value is over 742
        int secondSetOfNumbers = rand.nextInt(743);

        //Calculate the last four numbers of the phone number
        int thirdSetOfNumbers = rand.nextInt(10000);

        //Format the any sets of integers that are length of 2
        DecimalFormat df3 = new DecimalFormat("000");

        //Format the last integers that are a length of 3
        DecimalFormat df4 = new DecimalFormat("0000");

        String phoneNumber = df3.format(firstSetOfNumbers) + "-" +
                df3.format(secondSetOfNumbers) + "-" +
                df4.format(thirdSetOfNumbers);

        return phoneNumber;

    }

    public String toString() {

        return this.phoneNumber;

    }
}
