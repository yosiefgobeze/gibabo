import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MobileOrder{
  private String orderId;
  private String orderType;
  private double price;
  private String customerName;
  public MobileOrder(String orderId, String orderType, double price, String customerName){
    this.orderId = orderId;
    this.orderType = orderType;
    this.price = price;
    this.customerName = customerName;
  }
  public String getOrderId(){
    return this.orderId;
  }
  public String getOrderType(){
    return this.orderType;
  }
  public double getPrice(){
    return this.price;
  }
  public String getCustomerName(){
    return this.customerName;
  }
}
public class OperationStreamDemo {
  public static void main(String[] args) {
    // how to display all the current mobile orders
    List<MobileOrder> mobileOrderList = new ArrayList<>();
    mobileOrderList.add(new MobileOrder("001", "Small Latte", 5.57, "Yosief"));
    mobileOrderList.add(new MobileOrder("002", "Medium Apple shake", 6.50, "Abel"));
    mobileOrderList.add(new MobileOrder("003", "Small Frappuccino", 7.00, "Salh"));
    mobileOrderList.add(new MobileOrder("004", "Small Moka", 4.90, "Robel")); 
    mobileOrderList.add(new MobileOrder("005", "Large Vanilla Latte", 5.75, "Haftom"));
    /*for(MobileOrder order: mobileOrderList){
      System.out.println(order.getOrderId() + " " + order.getOrderType() + " " + order.getPrice() + " " + order.getCustomerName());
    }*/

    // System.out.println("After some filter ...............");
    // filter and display all orders below 5.0 price
    List<MobileOrder> belowFive = mobileOrderList.stream().filter(o -> (o.getPrice() < 6.00)).collect(Collectors.toList());
    // List<MobileOrder> all = mobileOrderList.stream().collect(Collectors.toList());
    for(MobileOrder order: belowFive){
       System.out.println("Order: " + order.getOrderId() + "\n" + order.getCustomerName() + "\n" + order.getOrderType() + "\n" + order.getPrice() + "\n" + "________________");
    }
  }
}
