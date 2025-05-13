public class Part_i {
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data){
    //create new node
    Node newNode = new Node(data);
    if(head == null){
      head = tail = newNode;
      return;
    }
    //newNode next = head
    newNode.next = head;
    //head = newNode
    head = newNode;
  }

  public void addLast(int data){
    //create new node
    Node newNode = new Node(data);
    if(head == null){
      head = tail = newNode;
      return;
    }
    //newNode next = head
    tail.next = newNode;
    //head = newNode
    tail = newNode;
  }

  public void print(){
    if(head == null){
      System.out.println("LL is empty");
      return;
    }
    Node temp = head;
    while (temp!=null) {
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null ");
  }

  public static void main(String[] args) {
    Part_i ll = new Part_i();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addLast(3);
    ll.print();
    ll.addLast(4);
    ll.print();
    
  }
}