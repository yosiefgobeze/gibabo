public class NonAnonymousMethod {
  // a method with no name, no return type, and no access modifier is known as an Anonymous method
  public static void main(String[] args){
    //System.out.println("Your name: " + getName());
    getName();
  }
  private static String name = "Yosief";

  // below comment is an anonymous method of the getName() method.
  // ()->System.out.println("Your name: " + name);
  
  public static void getName(){
    //return name;
    System.out.println("Your name: " + name);
  }
   
}
