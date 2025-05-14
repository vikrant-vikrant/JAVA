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
  public static int size;

  public void addFirst(int data){
    //create new node
    Node newNode = new Node(data);
    size++;
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
    size++;
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
  //Add in the Middle of LL
  public void add(int idx, int data){
    if(idx == 0){
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i=0;

    while(i < idx-1){
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }
  //Remove in a LL
  public int removeFrist(){
    if(size == 0){
      System.out.println("LL is empty");
      return Integer.MAX_VALUE;
    }else if(size == 1){
      int val = head.data;
      head = tail = null;
      return val;
    }
    int val= head.data;
    head = head.next;
    return val;
  }
  public int removeLast(){
    if(size == 0){
      System.out.print("LL id empty");
      return Integer.MIN_VALUE;

    }else if(size  == 1){
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    //prev : i = size - 2
    Node prev = head;
    for(int i=0;i<size-2;i++){
      prev = prev.next;
    }

    int val = tail.data;//tail data
    prev.next = null;
    tail = prev;
    size--;
    return val;    
  }
  //itaerative search
  public int itrSearch(int key){
    Node temp = head;
    int i = 0;

    while(temp != null){
      if(temp.data == key){
        return i;
      }
      temp = temp.next;
      i++;
    }

    return -1;
  }

  public int helper(Node head, int key){
    if(head == null){
      return -1;
    }
    if(head.data == key){
      return 0;
    }
    int idx = helper(head.next, key);
    if(idx == -1){
      return -1;
    }
    return idx+1;
  }
  public int recSearch(int key){
    return helper(head,key);
  }

  public int reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
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
    ll.add(2,9);
    ll.removeFrist();
    ll.print();

    ll.removeLast();
    ll.print();
    System.out.println(ll.size);
    System.out.println(ll.recSearch(3));
    System.out.println(ll.recSearch(9));
    ll.reverse();
    ll.print();
    
  }
}