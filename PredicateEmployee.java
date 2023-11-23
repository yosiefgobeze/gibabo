import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * create an Employee class, where we can make employee object
 * name, salary, experience
 */
class Employee{
  String firstName;
  double salary;
  int experience;
  Employee(String firstName, double salary, int experience){
    this.firstName = firstName;
    this.salary = salary;
    this.experience = experience;
  }
}
public class PredicateEmployee {
  // system to display employees with 100k salary and experice less than 2 years
  public static void main(String[] args){
    Predicate<Employee> employee = e -> (e.salary > 100000 && e.experience <= 3);
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee("Dave", 90000, 1));
    employeeList.add(new Employee("Minas", 110000, 4));
    employeeList.add(new Employee("Noah", 120000, 3));
    employeeList.add(new Employee("Haftish", 230000, 12));
    employeeList.add(new Employee("Senu", 87000, 3));
    employeeList.add(new Employee("Febu", 104000, 1));
    for(Employee emp: employeeList){
      if(employee.test(emp)){
        System.out.println("Employee details: [FirstName: " + emp.firstName + " Salary: " + emp.salary + " Experience: " + emp.experience + " ]");
      }
    }
  }
}

