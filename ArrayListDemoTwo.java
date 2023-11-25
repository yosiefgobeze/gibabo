import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ArrayListDemoTwo {
  public static void main(String[] args){
    ArrayList al = new ArrayList();
    al.add("Hi");
    al.add("Hello");
    al.add("Welcome");
    al.add("Good by");
    System.out.println(al);

    al.remove(1);
    // the addAll method
    ArrayList al_duplicate = new ArrayList();
    al_duplicate.addAll(al);
    System.out.println(al_duplicate);
    al_duplicate.add("See you");
    al_duplicate.add("Tomorrow");
    System.out.println(al_duplicate);
    // converting an array to an ArrayList
    Integer[] ages = new Integer[]{34, 56, 78, 23, 17, 26, 46, 61};

    List<Integer> al_ages = Arrays.asList(ages);

    Collections.sort(al_ages);

    System.out.print(al_ages);
    
  }
}
