package Function;

import java.util.function.Function;

// what if you need to join two calls togethre
// use andThen or compose
public class FunctionJoinApply {
  public static void main(String[] args){
    Function<Integer, Integer> multiply = n -> n * 2;
    Function<Integer, Integer> squared = n -> n * n;
    // first will use the multiply with the value 2 and then will use the output as input for second function
    System.out.println(multiply.andThen(squared).apply(2));
    // first will use the second function and will use the output as input for the first function
    System.out.println(multiply.compose(squared).apply(2));
  }
  
}
