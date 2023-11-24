import java.util.function.Supplier;
import java.util.*;
public class SupplierGet{
  public static void main(String[] args){
    // the get is an abstract method with in the predefined functional interface Supplier
    Supplier<Date> today = () -> new Date();
    Date todayIs = today.get();
    System.out.println(todayIs);
  }
}