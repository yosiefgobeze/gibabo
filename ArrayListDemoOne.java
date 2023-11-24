import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoOne {
  // a demo for an ArrayList
  public static void main(String[] args){
    // create a heteregenous ArrayList
    ArrayList al = new ArrayList();
    al.add("Welcome");
    al.add(100);
    al.add(50.45);
    al.add('A');
    System.out.println(al);

    // replace the 'A' with 'Z'
    al.set(3, 'Z');
    Iterator it = al.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }

  }
}