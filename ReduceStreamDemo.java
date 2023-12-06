import java.util.Arrays;
import java.util.List;

public class ReduceStreamDemo {
  public static void main(String[] args) {
    List<String> sequenceOrder = Arrays.asList("Orange", "Apple", "Banana", "Avocado", "Grape");
    // using the reduce stream api we can collect all the elements of the list
    sequenceOrder.stream().sorted().reduce((fruit, fruits) -> {
      (fruit + ", " + fruits)
    }
  }
}
