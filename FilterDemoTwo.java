import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class FilterDemoTwo {
  public static void main(String[] args){
    // collect only those which are not null
    List<String> names = Arrays.asList("Tomas", null, "Henry", "Alex", null);
    List<String> validNames = names.stream().filter(n -> (n!=null)).collect(Collectors.toList());
    for(String validName: validNames){
      System.out.println(validName);
    }
  }
}
