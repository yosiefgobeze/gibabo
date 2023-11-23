package Function;

import java.util.function.Function;

public class FunctionApplyMultiply {
  public static void main(String[] args){
    // Function is a predefined fuctional interface in java, which has one abstract method called apply
    // the apply method takes one argument, and returns a value, 
    Function<Integer, Integer> findSquare = n -> { return n * n; };
    int num = 5;
    int solution = findSquare.apply(num);
    System.out.println("square of the number: " + num + " is = " + solution);
    // how to find the length of a given string or word
    Function<String, Integer> findLength = word -> { return word.length(); };
    String word = "Bondadoso";
    try {
     int wordLength = findLength.apply(null);
     System.out.println("The word: " + word + " has " + wordLength + " characters.");
    } catch (Exception e) {
      System.out.println("An error has occured." + e);
    }
  }
}
