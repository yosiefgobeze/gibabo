import java.util.PriorityQueue;

public class PriorityQueueDemo {
  public static void main(String[] args){
    // PriorityQueue will allow duplicate value, keep insertion order, but no hetregenous data
    PriorityQueue priorityQueue = new PriorityQueue();
    // element and peek will return value from the head, incase of failure, peek will return null
    // but element will return exception.
    System.out.println(priorityQueue.peek()); // null
    //System.out.println(priorityQueue.element()); // will raise an exception
    // add and offer are used to insert data at the tail of the priorityqueue, but add will return
    // an exception if the insertion fails but offer returns false incase of failure.
    priorityQueue.add(100);
    priorityQueue.add(200);
    priorityQueue.add(300);
    priorityQueue.add(400);
    priorityQueue.add(500);

    // remove and poll will return the value from head and then remove the element
    // but if failed remove will return exception and poll will return null.
    
  }
}
