import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemoOne {

  public static void main(String[] args) {
  HashMap hm = new HashMap();
  
  hm.put(100, "Dave");
  hm.put(105, "Noah");
  hm.put(110, null);
  hm.put(115, "Dave");
  hm.put(120, "Natan");
  hm.put(125, "Natalie");
  Set<Integer> s = hm.entrySet();
  Iterator it = s.iterator();
  while (it.hasNext()) {
    Map.Entry entry = (Entry)it.next();
    System.out.println(entry.getKey() + " " + entry.getValue());
  }

  }
}
