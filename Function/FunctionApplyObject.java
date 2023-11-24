package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
  // I need to create an employee record, having name, work experience and salary. 
  // then I will give bonus to those with more than 5 years of experience.
  String name;
  double salary;
  int experience;

  Employee(String name, double salary, int experience){
    this.name = name;
    this.salary = salary;
    this.experience = experience;
  }
}
public class FunctionApplyObject {
  public static void main(String[] args){
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Tomas", 57000, 2));
    employees.add(new Employee("Henry", 65000, 7));
    employees.add(new Employee("Aklilu", 70000, 6));
    employees.add(new Employee("Senu", 84000, 8));
    employees.add(new Employee("Solomon", 58000, 3));
    // I have a list of employees and need to check if employee is eligible for a bonus
    Function<Employee, Double> employeeBonus = emp -> {
      if(emp.experience >= 5){
        emp.salary = emp.salary + 5000;
      }
      return emp.salary;
    }; 
    Predicate<Double> newSalary = s -> s >= 75000.0;
  System.out.println("Old salaries:");
  for(Employee emp: employees){
    System.out.println("Employee details: [" + emp.name + ", " + emp.salary + ", " + emp.experience + "]");
  }
  System.out.println("Updated salaries:");
  for(Employee empl: employees){
    empl.salary = employeeBonus.apply(empl);
    // there is a predicate call to check if the new salary is greater than or equal to 75000
    if(newSalary.test(empl.salary))
    System.out.println("Employee details: [" + empl.name + ", " + empl.salary + ", " + empl.experience + "]");
  }
}  
}
