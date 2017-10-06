package Speaker;

/**
 * Created by qmtruong92 on 6/20/17.
 */
public class SpeakingDevices implements SpeakerInterface {

    @Override
    public void speak() {
        System.out.println("I am speaking");
    }

    @Override
    public void announce(String str) {

        System.out.println("I am announcing");
    }
}
