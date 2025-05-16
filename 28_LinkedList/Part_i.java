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

  public void reverse(){
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

  //Find and Remove Nth Node from end
  public void deleteNthfromEnd(int n){
    //calculate size
    int sz = 0;
    Node temp = head;
    while(temp != null){
      temp = temp.next;
      sz++;
    }

    if(n == sz){
      head = head.next;//removeFrist
      return;
    }
    //sz - n
    int i= 1;
    int iToFind = sz - n;
    Node prev = head;
    while(i< iToFind){
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
    return;
  }
  //Find Mid slow fast approch
  public Node findMid(Node head){
    Node slow = head;
    Node fast = head;

    while(fast == null && fast.next != null){
      slow = slow.next;//+1
      fast = fast.next.next;//+2
    }
    return slow;//slow is my middle
  }
  //Check if LL is a Palindrome
  public boolean checkPalindrome(){
    if(head == null || head.next == null){
      return true;
    }
    //find mid
    Node midNode = findMid(head); 

    //reverse 2nd halp
    Node prev  = null;
    Node curr = midNode;
    Node next;
    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node right = prev;//right half head
    Node left = head;

    //check left half & right half
    while(right != null){
      if(left.data != right.data){
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }
    //Detecting cycle in LL
  public static boolean isCycle(){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        return true;
      }
    }
    return false;
  }

  //Remove a LooplCycle in a LL
  public static void removeCycle(){
    //detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
      if(fast == slow){
        cycle = true;
        break;
      }
    }
    if(cycle == false){
      return;
    }
    //find meeting point
    slow = head;
    Node prev = null;
    while(slow != fast){
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }
    //remove cycle -> last.next = null
    if(prev != null){
    prev.next = null;
    }
  }

  //Merge sort in LL
  private Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;

    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = slow.next.next;
    }
    return slow;//mid node
  }

  private Node merge(Node head1, Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while(head1 != null && head2 != null){
      if(head1.data <= head2.data){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      }else{
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }

    while(head1 != null){
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while(head2 != null){
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }

    return mergedLL.next;
  }

  public Node mergeSort(Node head){
    if(head == null || head.next == null){
      return head;
    }
    //find mid
    Node mid = getMid(head);
    //left & right MergeSort
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);
    //merge
    return merge(newLeft,newRight);
  }

  //ZigZag
  public void zigzag(){
    //find mid
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;
    //reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;  

    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;
    //merge 
    while(left != null && right != null){
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      left = nextL;
      right = nextR;
    }
  }

  public static void main(String[] args) {
    Part_i ll = new Part_i();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.print();
    ll.zigzag();
    ll.print();
  }
}