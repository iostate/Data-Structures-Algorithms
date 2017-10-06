package Speaker;

/**
 * Created by qmtruong92 on 6/20/17.
 */
public class MegaPhoneMain {

    public static void main(String[] args) {

        SpeakingDevices yes;

        MegaPhone no = new MegaPhone();
        Dog tito = new Dog();
        Alien mrBorgusBorg = new Alien();

        no.speak();
        no.announce("Hello");
        tito.speak();
        tito.announce("Bork bork");
        tito.bark();


        for (int i = 0; i < 10000000; i++)
            tito.bark();


    }

    public static void sayIt(SpeakingDevices current) {
        current.speak();
    }
}
