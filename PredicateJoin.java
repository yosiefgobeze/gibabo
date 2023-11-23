import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PredicateJoin {
  //how to join multiple predicate statements
  public static void main(String[] args){
    Predicate<Integer> evenNum = num -> (num % 2 == 0);
    Predicate<Integer> checkValue = num -> (num > 20);
    int[] studentAges = {46, 12, 16, 25, 34, 40, 27, 19, 28, 36, 42};
    List<Integer> studentAgeList = new ArrayList<>();
    // joining predicates
    for(int age: studentAges){
        if(evenNum.test(age) && checkValue.test(age)){
          studentAgeList.add(age);
        }
    }
    Collections.sort(studentAgeList);
    System.out.println("List of students with age above 20 and is even: \n" + studentAgeList);
  }
}
