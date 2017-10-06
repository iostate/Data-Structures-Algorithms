package Speaker;

/**
 * Created by qmtruong92 on 6/20/17.
 */
public class Alien implements SpeakerInterface {


    @Override
    public void speak() {
        System.out.println("Borg borg-smorgasborg");
    }

    @Override
    public void announce(String str) {

        str += "borg-borg borg";

        System.out.println(str);

    }
}
