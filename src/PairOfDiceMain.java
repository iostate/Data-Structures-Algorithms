/**
 * Created by qmtruong92 on 6/5/17.
 */
public class PairOfDiceMain {

    public static void main(String[] args) {

        PairOfDice a1 = new PairOfDice();

        Die az = new Die();

        az.setFaceValue(4);


        System.out.println(a1.toString());


        a1.right.setFaceValue(5);

        a1.left.setFaceValue(3);

        System.out.print("Current values are: ");
        System.out.println(a1.toString());

        a1.roll();

        System.out.print("New values are: ");
        System.out.println(a1);




    }
}
