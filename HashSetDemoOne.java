import java.util.HashSet;

public class HashSetDemoOne {
  public static void main(String[] args){
    // hashset default capacity is 16 and load factor is 0.75
    HashSet hSet = new HashSet(); // default 16 and load factor 0.75
    hSet.add("Me");
    hSet.add("Believe");
    hSet.add("In God");
    hSet.add(100);
    hSet.add(true);
    hSet.add(null);
    System.out.println("Insertion order not preserved: " + hSet);
    // find union, intersection
    HashSet<Integer> hashSet = new HashSet<>();
    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(3);
    hashSet.add(4);
    hashSet.add(5);
    System.out.println("Display all: " + hashSet);
    HashSet<Integer> hashSet2 = new HashSet<>();
    hashSet2.add(3);
    hashSet2.add(4);
    hashSet2.add(5);
   // hashSet.addAll(hashSet2);
    System.out.println("Display all: " + hashSet2);
    System.out.println("Combined: " + hashSet);
    // hashSet.removeAll(hashSet2);
    System.out.println("Only hashSet: " + hashSet);
    // intersection
    hashSet.retainAll(hashSet2);
    System.out.println("Intersection: " + hashSet);

  }
}
