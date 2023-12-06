import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapStreamDemoOne {
  public static void main(String[] args){
    // how to use the map operation in a stream
    List<Integer> prices = Arrays.asList(230, 200, 400, 180, 367);
    for (Integer price : prices) {
      System.out.println(price);
    }
    System.out.println("------------------");
    List<Integer> discountedPrice = new ArrayList<>();
    // let's consider there is a new discount on ever item and the discount is $20
    discountedPrice = prices.stream().map(p -> (p - 20)).collect(Collectors.toList());
    for (Integer newPrice : discountedPrice) {
      System.out.println(newPrice);
    }

  }
}
