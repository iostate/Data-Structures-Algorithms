package BinaryTree;

public class BinaryTreeExample {

  Node parent = new Node(0, "Dillon");

  class Node {

    int key;
    String name;
    Node leftChild;
    Node rightChild;

    Node(int key, String name) {
      this.key = key;
      this.name = name;
    }

    @Override
    public String toString() {
      return name + " has a key " + key;
    }
  }
}
