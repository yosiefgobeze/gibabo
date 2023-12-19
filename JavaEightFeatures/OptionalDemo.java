package JavaEightFeatures;
import java.util.Optional;

class Cat {

   private String name;
   private int age;
   
   public Cat(String name, int age){
    this.name = name;
    this.age = age;
   }

   public String getName(){
    return this.name;
   }

   public int getAge(){
    return this.age;
   }
}
public class OptionalDemo{
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findByName("Tom");

        /*
        if (optionalCat.isPresent()) {
            System.out.println(optionalCat.get().getAge());
        }else{
            System.out.println("It is a null value!");
        }
         */

        Cat myCat = optionalCat.orElse(new Cat("Unknown Cat", 4));
        System.out.println(myCat.getAge());    
    }

    public static Optional<Cat> findByName(String name){
        Cat cat = new Cat(name, 6);
        return Optional.ofNullable(cat);
    }
}