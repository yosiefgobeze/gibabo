import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemoOne {
  // using the predefined functional interface, Predicate -- use the abstract method test
  public static void main(String[] args){
    Predicate<Integer> checkNum = (a) -> {
      System.out.println("System is checking if minimum deposit is valid: ");
      if(a > 100)
      return true;
      else
      return false;
    };
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter minimum deposit amount: ");
    int amount = scan.nextInt();
    Boolean result = checkNum.test(amount);
    System.out.println("Amount you have deposited: " + amount );
    System.out.println("Is my input valid: " + result); 
    // System to check the password length is valid
    Predicate<Integer> passwordLength = a -> {
      System.out.println("System is checking the length of the password:");
      if(a  > 10)
      return true;
      else
      return false;
    };
      Scanner passScan = new Scanner(System.in);
      System.out.println("Minimum password lenght is eleven: ");
      String passwordEntered = passScan.nextLine();
      int passLength = passwordEntered.length();
      Boolean isValid = passwordLength.test(passLength);
      System.out.println("Your password is: " + passwordEntered);
      System.out.println("Password length valid: " + isValid);
      passScan.close();

  }
}
