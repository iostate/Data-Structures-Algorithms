import jsjf.LinkedBinaryTree;

import java.util.Iterator;

/**
 * Demonstrates the functionality of the toString method as well as the
 * getRootElement methods.
 */
public class LinkedBinaryTreeTest {

    public static void main(String[] args) {
        LinkedBinaryTree<Integer> orangeTree = new LinkedBinaryTree(2,
                new LinkedBinaryTree(3), new LinkedBinaryTree(4));

        orangeTree.getRoot().printTree(orangeTree.getRoot());

//
//        System.out.println("In Order: ");
//        createAndPrintInOrderIterator(orangeTree);
//        System.out.println("PreOrder: ");
//        createAndPrintPreOrderIterator(orangeTree);
//        System.out.println("Post Order:");
//        createAndPrintPostOrderIterator(orangeTree);
//        System.out.println("Level Order: ");
//        createAndPrintLevelOrderIterator(orangeTree);
//        System.out.println("Visits each level one at a time. Starts with root," +
//                "then moves to left node, and then right node.");
//
//        System.out.println(orangeTree.toString());



    }

    public static void createAndPrintInOrderIterator(LinkedBinaryTree<Integer> aTree) {
        Iterator inOrder = aTree.iteratorInOrder();

        while (inOrder.hasNext()) {
            System.out.println(inOrder.next());
        }
    }

    public static void createAndPrintPostOrderIterator(LinkedBinaryTree<Integer> aTree) {
        Iterator postOrder = aTree.iteratorPostOrder();

        while (postOrder.hasNext()) {
            System.out.println(postOrder.next());
        }
    }

    public static void createAndPrintPreOrderIterator(LinkedBinaryTree<Integer> aTree) {
        Iterator preOrder = aTree.iteratorPreOrder();

        while (preOrder.hasNext()) {
            System.out.println(preOrder.next());
        }
    }

    public static void createAndPrintLevelOrderIterator(LinkedBinaryTree<Integer> aTree) {
        Iterator inOrder = aTree.iteratorLevelOrder();

        while (inOrder.hasNext()) {
            System.out.println(inOrder.next());
        }
    }
}
