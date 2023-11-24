@FunctionalInterface
interface AddPrice{
  public void sum(int a, int b);
}
public class LambdaExpressionDemoOne {
  public static void main(String[] args){
    AddPrice addPrice = (a, b) -> {
      System.out.println("Values passed: ");
      System.out.println("Total price: " + (a + b));
    };
    addPrice.sum(4, 8);
  }
}
