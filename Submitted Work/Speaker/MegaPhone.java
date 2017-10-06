package Speaker;

/**
 * Created by qmtruong92 on 6/20/17.
 */
public class MegaPhone extends SpeakingDevices implements SpeakerInterface {


    @Override
    public void speak(){
        System.out.println("Speaking in a different way");
    }

    @Override
    public void announce(String str) {
        System.out.println("Speaking in a loud way!");

    }
}
