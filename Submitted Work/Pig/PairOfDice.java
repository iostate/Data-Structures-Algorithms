/**
 * Created by qmtruong92 on 6/5/17.
 */
public class PairOfDice {

    public Die left, right;

    //Default constructopr
    public PairOfDice() {
        this.left = new Die();
        this.right = new Die();
    }
    public void roll() {

        this.left.setFaceValue(this.left.roll());

        this.right.setFaceValue(this.right.roll());
    }

    //getLeft
    public int getLeft() {

        return this.left.getFaceValue();
    }

    //getRight

    public int getRight() {
        return this.right.getFaceValue();
    }


    // Returns the sum of both die's face values
    public int sum() {

        return this.left.getFaceValue() + this.right.getFaceValue();
    }
    //Format the dice values
    public String toString() {
        return "Left dice is: " + this.left.getFaceValue() +
                " Right dice is: " + this.right.getFaceValue();
    }
}
