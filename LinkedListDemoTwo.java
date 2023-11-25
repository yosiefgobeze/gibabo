import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemoTwo {
  public static void main(String[] args){
    //specific methods of the linkedlist
    LinkedList ld = new LinkedList();
    ld.add("Hi");
    ld.add(56);
    ld.add(true);
    ld.add("Alameda");
    ld.add("Oakland");
    ld.add(60.90);
    System.out.println("All elements: " + ld);
    // adding element at first position
    ld.addFirst("I am first");
    ld.addLast("I am last");
    System.out.println("Added at first and last: " + ld);
    ld.removeFirst();
    System.out.println("Removed first element: " + ld);
  }
}
