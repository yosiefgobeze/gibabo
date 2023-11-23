import java.util.function.Predicate;

public class PredicateFirstName {
  // system to check if first name is more than two characters long
  public static void main(String[] args){
    Predicate<String> firstName = name -> {
      System.out.println("System checking first name length!");
      if(name.length() > 5)
      return true;
      else
      return false;
    };
    String firstNameList[] = {"Davi", "Haftish", "Minu", "Selala"};
    for(String name: firstNameList){
      System.out.println("First name valid: " + firstName.test(name) + " and your name is: " + name);
    }
  }
}
