package jsjf;

import java.lang.reflect.Array;
import java.util.*;

import jsjf.exceptions.*;

/**
 * LinkedBinaryTree implements the BinaryTreeADT interface
 *
 * @author Java Foundations
 * @version 4.0
 */
public class LinkedBinaryTree<T> implements BinaryTreeADT<T>, Iterable<T> {
    protected BinaryTreeNode<T> root;
    protected int modCount;

    /**
     * Creates an empty binary tree.
     */
    public LinkedBinaryTree() {
        root = null;
    }

    /**
     * Creates a binary tree with the specified element as its root.
     *
     * @param element the element that will become the root of the binary tree
     */
    public LinkedBinaryTree(T element) {
        root = new BinaryTreeNode<T>(element);
    }

    /**
     * Creates a binary tree with the specified element as its root and the
     * given trees as its left child and right child
     *
     * @param element the element that will become the root of the binary tree
     * @param left    the left subtree of this tree
     * @param right   the right subtree of this tree
     */
    public LinkedBinaryTree(T element, LinkedBinaryTree<T> left,
                            LinkedBinaryTree<T> right) {
        root = new BinaryTreeNode<T>(element);
        root.setLeft(left.root);
        root.setRight(right.root);
    }

    public static int sizeNoCount(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            //Add 1 for root element
            return (sizeNoCount(root.getLeft()) + 1 + sizeNoCount(root.getRight()));
        }
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

    /**
     * Returns a reference to the element at the root
     *
     * @return a reference to the specified target
     * @throws EmptyCollectionException if the tree is empty
     */
    public T getRootElement() throws EmptyCollectionException {
        //Programming project

        return root.getElement();
    }

    /**
     * Returns a reference to the node at the root
     *
     * @return a reference to the specified node
     * @throws EmptyCollectionException if the tree is empty
     */
    protected BinaryTreeNode<T> getRootNode() throws EmptyCollectionException {
        // To be completed as a Programming Project

        return root;
    }

    /**
     * Returns the left subtree of the root of this tree.
     *
     * @return a link to the left subtree fo the tree
     */
    public LinkedBinaryTree<T> getLeft() {
        // To be completed as a Programming Project

        return this.getLeft();
    }

    /**
     * Returns the right subtree of the root of this tree.
     *
     * @return a link to the right subtree of the tree
     */
    public LinkedBinaryTree<T> getRight() {
        // To be completed as a Programming Project

        return this.getRight();
    }

    /**
     * Returns true if this binary tree is empty and false otherwise.
     *
     * @return true if this binary tree is empty, false otherwise
     */
    public boolean isEmpty() {
        return (root == null);
    }

    /**
     * Returns the integer size of this tree.
     *
     * @return the integer size of the tree
     */
    public int size() {

        return this.getHeight() * 2;

        //Assumes that there is a count
//        return modCount;
    }

    /**
     * Returns the height of this tree.
     *
     * @return the height of the tree
     */
    public int getHeight() {
        // To be completed as a Programming Project
        int leftHeight, rightHeight;
        //Root node does not have  aheight
        if (getRootNode() == null) {
            return -1;
        }

        leftHeight = height(getRootNode().getLeft());
        rightHeight = height(getRootNode().getRight());

        return Math.max(leftHeight, rightHeight) + 1;

    }

    /**
     * Returns the height of the specified node.
     *
     * @param node the node from which to calculate the height
     * @return the height of the tree
     */
    private int height(BinaryTreeNode<T> node) {
        // To be completed as a Programming Project
        int leftHeight, rightHeight;

        if (node == null) {
            return -1;
        }

        leftHeight = height(node.getLeft());
        rightHeight = height(node.getRight());

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    /**
     * Returns true if this tree contains an element that matches the
     * specified target element and false otherwise.
     *
     * @param targetElement the element being sought in this tree
     * @return true if the element in is this tree, false otherwise
     */
    public boolean contains(T targetElement) {
        // To be completed as a Programming Project
        boolean targetFound = false;
        if (find(targetElement) != null)
            targetFound = true;

        return targetFound;
    }

    /**
     * Returns a reference to the specified target element if it is
     * found in this binary tree.  Throws a ElementNotFoundException if
     * the specified target element is not found in the binary tree.
     *
     * @param targetElement the element being sought in this tree
     * @return a reference to the specified target
     * @throws ElementNotFoundException if the element is not in the tree
     */
    public T find(T targetElement) throws ElementNotFoundException {
        BinaryTreeNode<T> current = findNode(targetElement, root);

        if (current == null)
            throw new ElementNotFoundException("LinkedBinaryTree");

        return (current.getElement());
    }

    /**
     * Returns a reference to the specified target element if it is
     * found in this binary tree.
     *
     * @param targetElement the element being sought in this tree
     * @param next          the element to begin searching from
     */
    private BinaryTreeNode<T> findNode(T targetElement,
                                       BinaryTreeNode<T> next) {
        if (next == null)
            return null;

        if (next.getElement().equals(targetElement))
            return next;

        BinaryTreeNode<T> temp = findNode(targetElement, next.getLeft());

        if (temp == null)
            temp = findNode(targetElement, next.getRight());

        return temp;
    }

    /**
     * Returns a string representation of this binary tree showing
     * the nodes in an inorder fashion.
     *
     * @return a string representation of this binary tree
     */
    public String toString() {

        String result = "\t\t" + String.valueOf(this.getRootNode().getElement());
        result += "\n\t" + String.valueOf(this.getRootNode().getLeft().getElement());
        result += "\t\t" + String.valueOf(this.getRootNode().getRight().
                getElement() + "\n");
        return result;
//        return modCount + " " + root;
    }


    /**
     * Returns an iterator over the elements in this tree using the
     * iteratorInOrder method
     *
     * @return an in order iterator over this binary tree
     */
    public Iterator<T> iterator() {
        return iteratorInOrder();
    }

    /**
     * Performs an inorder traversal on this binary tree by calling an
     * overloaded, recursive inorder method that starts with
     * the root.
     *
     * @return an in order iterator over this binary tree
     */
    public Iterator<T> iteratorInOrder() {
        ArrayUnorderedList<T> list = new ArrayUnorderedList<T>();
        inOrder(root, list);

        return new TreeIterator(list.iterator());
    }

    /**
     * Performs a recursive inorder traversal.
     *
     * @param node the node to be used as the root for this traversal
     * @param list the temporary list for use in this traversal
     */
    protected void inOrder(BinaryTreeNode<T> node,
                           ArrayUnorderedList<T> list) {
        if (node != null) {
            inOrder(node.getLeft(), list);
            list.addToRear(node.getElement());
            inOrder(node.getRight(), list);
        }
    }

    /**
     * Performs an preorder traversal on this binary tree by calling
     * an overloaded, recursive preorder method that starts with
     * the root.
     *
     * @return a pre order iterator over this tree
     */


    public Iterator<T> iteratorPreOrder() {
        // To be completed as a Programming Project
        ArrayUnorderedList<T> list = new ArrayUnorderedList<T>();
        preOrder(root, list);

        //Placeholder test
        return new TreeIterator(list.iterator());


    }

    /**
     * Performs a recursive preorder traversal.
     *
     * @param node the node to be used as the root for this traversal
     * @param list the temporary list for use in this traversal
     */
    protected void preOrder(BinaryTreeNode<T> node,
                            ArrayUnorderedList<T> list) {
        // To be completed as a Programming Project

        if (node != null) {
            list.addToRear(node.element);
            preOrder(node.left, list);
            preOrder(node.right, list);
        }
    }


    /**
     * Performs an postorder traversal on this binary tree by calling
     * an overloaded, recursive postorder method that starts
     * with the root.
     *
     * @return a post order iterator over this tree
     */
    public Iterator<T> iteratorPostOrder() {
        // To be completed as a Programming Project

            ArrayUnorderedList<T> list = new ArrayUnorderedList<T>();
            postOrder(root, list);

            return new TreeIterator(list.iterator());


    }

    /**
     * Performs a recursive postorder traversal.
     *
     * @param node     the node to be used as the root for this traversal
     * @param list the temporary list for use in this traversal
     */

    protected void postOrder(BinaryTreeNode<T> node,
                             ArrayUnorderedList<T> list) {
        // To be completed as a Programming Project

        if (node != null) {
            postOrder(node.getLeft(), list);
            postOrder(node.getRight(), list);
            list.addToRear(node.getElement());
        }
    }


    /**
     * Performs a levelorder traversal on this binary tree, using a
     * list.
     *
     * @return a levelorder iterator over this binary tree
     */
    public Iterator<T> iteratorLevelOrder() {
        ArrayUnorderedList<BinaryTreeNode<T>> nodes =
                new ArrayUnorderedList<BinaryTreeNode<T>>();
        ArrayUnorderedList<T> list = new ArrayUnorderedList<T>();
        BinaryTreeNode<T> current;

        nodes.addToRear(root);

        while (!nodes.isEmpty()) {
            current = nodes.removeFirst();

            if (current != null) {
                list.addToRear(current.getElement());
                if (current.getLeft() != null)
                    nodes.addToRear(current.getLeft());
                if (current.getRight() != null)
                    nodes.addToRear(current.getRight());
            } else
                list.addToRear(null);
        }

        return new TreeIterator(list.iterator());
    }


    /**
     * Inner class to represent an iterator over the elements of this tree
     */
    private class TreeIterator implements Iterator<T> {
        private int expectedModCount;
        private Iterator<T> iter;

        /**
         * Sets up this iterator using the specified iterator.
         *
         * @param iter the list iterator created by a tree traversal
         */
        public TreeIterator(Iterator<T> iter) {
            this.iter = iter;
            expectedModCount = modCount;
        }

        /**
         * Returns true if this iterator has at least one more element
         * to deliver in the iteration.
         *
         * @return true if this iterator has at least one more element to deliver
         * in the iteration
         * @throws ConcurrentModificationException if the collection has changed
         *                                         while the iterator is in use
         */
        public boolean hasNext() throws ConcurrentModificationException {
            if (!(modCount == expectedModCount))
                throw new ConcurrentModificationException();

            return (iter.hasNext());
        }

        /**
         * Returns the next element in the iteration. If there are no
         * more elements in this iteration, a NoSuchElementException is
         * thrown.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iterator is empty
         */
        public T next() throws NoSuchElementException {
            if (hasNext())
                return (iter.next());
            else
                throw new NoSuchElementException();
        }

        /**
         * The remove operation is not supported.
         *
         * @throws UnsupportedOperationException if the remove operation is called
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

