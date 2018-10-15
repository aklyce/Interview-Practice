public class IntLinkedList {
  private Node head;

  public IntLinkedList(int item) {
    head = new Node();
    head.value = item;
    head.link = null;
  }

  public boolean insertItem(int item) {
    Node n = new Node();
    n.value = item;
    n.link =
  }

  private class Node {
    private int value;
    private Node link;

    private Node(int item, Node n, Node prev) {
      thi.value = item;
      this.link = prev
    }
  }


}
