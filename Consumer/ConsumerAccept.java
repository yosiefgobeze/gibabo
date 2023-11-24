import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// you have student object with grades, print those having A grade only.
// First you need to create an object and add it to an ArrayList.
class Student{
  String name;
  int age;
  double score;
  String grade;

  Student(String name, int age, double score, String grade){
    this.name = name;
    this.age = age;
    this.score = score;
    this.grade = grade;
  }
}
public class ConsumerAccept {
  public static void main(String[] args){
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Alex", 23, 78.90, "A"));
    studentList.add(new Student("Tomas", 24, 80, "A"));
    studentList.add(new Student("Henry", 22, 65, "B"));
    studentList.add(new Student("Elias", 21, 60, "C"));
    studentList.add(new Student("Napolean", 25, 72, "B"));

   Consumer<Student> studentDetails = std-> System.out.println(std.name + " " + std.age + " " + std.score + " " + std.grade);

    Predicate<Student> studentGradeCheck = s -> 
      s.grade.equals("A");

    for(Student std: studentList){
      boolean result = studentGradeCheck.test(std);
      if(result)
      //System.out.println(std.name + " " + std.age + " " + std.score + " " + std.grade);
      studentDetails.accept(std);
    }
  }
}
