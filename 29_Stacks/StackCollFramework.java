import java.util.*;

public class StackCollFramework{
  //Push at the Bottom of the Stack
  public static void pushAtBottom(Stack<Integer> s, int data){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int top = s.pop();
    pushAtBottom(s,data);
    s.push(top);
  }
  //Reverse a String using a Stack
  public static String reverseString(String str){
    Stack<Character> s = new Stack<>();
    int idx = 0;
    while(idx < str.length()){
      s.push(str.charAt(idx));
      idx++;
    }
    StringBuilder result = new StringBuilder("");
    while(!s.isEmpty()){
      char curr = s.pop();
      result.append(curr);
    }

    return result.toString();
  }
  public static void main(String args[]){
    // Stack s = new Stack();
    String str = "HelloWorld";
    System.out.println(reverseString(str));
    // Stack<Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // pushAtBottom(s, 4);
    // while(!s.isEmpty()){
    //   System.out.println(s.pop());
    //   // System.out.println(s.peek());
    //   s.pop();
    // }
  }
}