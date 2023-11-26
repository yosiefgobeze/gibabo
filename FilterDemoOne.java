import java.util.*;
import java.util.stream;
public class FilterDemoOne{
  public static void main(String[] me){
    // steps to use stream api
    // 1. create a collection
    // 2. add the collection to stream class using stream() method
    // 3. apply the operation filter or any other one
    // 4. terminate the operation using termination methods
    List<Integer> ages = Arrays.asList(23, 22, 40, 38, 18, 15, 28, 31);
    List<Integer> evenAges = new ArrayList<>();
    evenAges = ages.stream().filter(n -> (n%2 == 0)).collect(Collectors.toList());
    for(int age: evenAges){
    System.out.println(age);
    }

  }
}