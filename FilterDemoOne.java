import java.util.*;
import java.util.stream.Collectors;

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
    System.out.println("Filtered and collected.....");
    for(int age: evenAges){
    System.out.println(age);
    }
    System.out.println("Filtered and displayed.....");
    // if yo need to print the filtered values
    ages.stream().filter(a -> (a%2==0)).forEach(a -> System.out.println(a));

  }
}