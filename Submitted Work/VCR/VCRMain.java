/**
 *
 Programmer: Quan Truong
 Date: 6/20/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: VCRMain

 Description: Performs VCR functions on the Lion King VHS.

 */

package VCR;

public class VCRMain {

    public static void main(String[] args) {

        VCR lionKing = new VCR();

        lionKing.play();
        lionKing.pause();
        lionKing.stop();
        lionKing.reverse();
        lionKing.fastForward();
    }
}
