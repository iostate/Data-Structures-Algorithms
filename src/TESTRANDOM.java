import java.util.Random;

/**
 * Created by qmtruong92 on 6/12/17.
 */
public class TESTRANDOM {

    static final Pig user = new Pig("User");
    static final Pig computer = new Pig(true);

    public static void main(String[] args) {

        for (int i = 0; i <= 90; i++) {
            chooseRandom();
        }



    }

    public static void chooseRandom() {

        Pig[] array = new Pig[2];
        array[0] = user;
        array[1] = computer;

        Random rand = new Random();

        int random = rand.nextInt(2);

        Pig currentUser = array[random];

        System.out.println(currentUser.getName());
    }
}
