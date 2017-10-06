package Speaker;

/**
 * Created by qmtruong92 on 6/20/17.
 */
public class Dog extends SpeakingDevices implements SpeakerInterface {

    @Override
    public void speak() {
        System.out.println("Barkedy bark bark bark");
    }

    @Override
    public void announce(String str) {
        System.out.println(str + 15);
    }

    public void bark() {
        System.out.println("Bark! Bark!");
    }
}
