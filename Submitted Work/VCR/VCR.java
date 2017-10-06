/**
 *
 Programmer: Quan Truong
 Date: 6/20/17
 Class: CSC205
 Professor: Mrs. Heil
 Assignment: VCR

 Description: Implements the VCR Interface.

 */

package VCR;

public class VCR implements VCR_Interface {

    @Override
    public void play() {
        System.out.println("I am playing!");
    }

    @Override
    public void stop() {
        System.out.println("I am stopped!");

    }

    @Override
    public void reverse() {
        System.out.println("I am reversing!");
    }

    @Override
    public void fastForward() {
        System.out.println("I am fast-forwarding!");

    }

    @Override
    public void pause() {
        System.out.println("I am paused!");

    }
}
