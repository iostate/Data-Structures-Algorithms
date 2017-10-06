import jsjf.LinkedBinaryTree;

/**
 * Demonstrates the functionality of the toString method as well as the
 * getRootElement methods.
 */
public class LinkedBinaryTreeTest {

    public static void main(String[] args) {
        LinkedBinaryTree<Integer> orangeTree = new LinkedBinaryTree(2,
                new LinkedBinaryTree(3), new LinkedBinaryTree(4));
        System.out.println("Root element: " + orangeTree.getRootElement());
        System.out.println("Orange Tree ToString method: ");
        System.out.println(orangeTree.toString());

        System.out.println("Find the element 3 inside the orange tree" + "\n" +
                        "If it is found, print the element: \n" +
                orangeTree.find(3));

        System.out.println("Does orange tree contain the number 3? " +
                orangeTree.contains(3));
    }
}
