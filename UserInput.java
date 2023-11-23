import java.util.*;
public class UserInput{
  public static void main(String[] args){
    System.out.println("user input a number, check if positive or negative");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    if(input < 0){
      System.out.println("Input number: " + input + " is negative");
    }else if (input == 0){
      System.out.println("Input number is zero.");
    } else{
      System.out.println("Input number: " + input + " is positive");
    }
  }
}
