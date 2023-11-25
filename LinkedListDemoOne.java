import java.util.LinkedList;

public class LinkedListDemoOne {
  public static void main(String[] args) {
    // linkedlist demo
    LinkedList ld = new LinkedList();
    ld.add("Yosief");
    ld.add(90);
    ld.add(45.89);
    ld.add("Starbucks");
    ld.add(true);
    ld.add(null);
    System.out.println("All the elements: " + ld);
    // get value by index
    System.out.println("Value at index 2: " + ld.get(3));
    // replace a value at a specific position
    ld.set(5, "Latte");
    System.out.println("Values after replacement: " + ld);
    ld.add(3, "New value");
    System.out.println("Added value at specific index: " + ld);
    // removing a value by index
    ld.remove(5);
    System.out.println("After removing an element: " + ld);
  }
}
