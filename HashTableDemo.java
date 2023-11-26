import java.util.Map;

import javax.swing.RowFilter.Entry;

import java.util.*;
import java.util.Iterator;

public class HashTableDemo{
  public static void main(String[] arguments){
    // default size of a hashtable is 11 and load factor is 0.75
    // incase you need to modify the default size
    // HashTable<Integer, String> ht = new HashTable<>(cutome size(Integer), custome load factor(float));
    Hashtable<Integer, String> ht = new Hashtable<>();
    ht.put(100, "Dave");
    ht.put(102, "Jossi");
    ht.put(104, "Haftish");
    ht.put(106, "Senu");
    ht.put(108, "Selala");
    ht.put(110, "Febu");
    // iterate
    Set s = ht.entrySet();
    Iterator it = s.iterator();
    while(it.hasNext()){
      Map.Entry entry = (Map.Entry) it.next();
      System.out.println(entry.getKey() + " " + entry.getValue ());
    }
  }
}