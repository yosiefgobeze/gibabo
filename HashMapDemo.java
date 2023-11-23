import java.util.*;
public class HashMapDemo{
  public static void main(String[] args){
    // declaring and implementing a hashmap
    HashMap<Integer, String> employeeRecord = new HashMap<>();
    employeeRecord.put(1000, "Yosief");
    employeeRecord.put(1001, "Minas");
    employeeRecord.put(1002, "Noah");
    employeeRecord.put(1003, "Yaniet");
    employeeRecord.put(1004, "Natan");
    employeeRecord.put(1005, "Waka");
    System.out.println(employeeRecord);
    // using an enhanced for loop to read key value pair from a hashmap
    for(Map.Entry<Integer, String> m:employeeRecord.entrySet()){
      System.out.println(m.getKey() + " " + m.getValue());
  
    }
  }
}