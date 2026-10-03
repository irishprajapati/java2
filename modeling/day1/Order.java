package modeling.day1;

public class Order {
int id;
double amount;
String status;
Order(int id, double amount, String status){
    this.id = id; 
    this.amount = amount;
    this.status = status;
}

static double calculateTotalByStatus(Order[] orders, String requestedStatus){
    double totalAmount = 0;
    for(int i =0; i<orders.length; i++){
        if(orders[i].status.equals(requestedStatus)){
            totalAmount += orders[i].amount; 
        }
        
    }
    return totalAmount;
}
// static double calculateDeliveredTotal(Order[] orders) {
//     double deliveredOnlyAmount = 0;
//     for(int i = 0; i<orders.length; i++){
//         if(orders[i].status.equals("DELIVERED")){
//             deliveredOnlyAmount += orders[i].amount;
//         }
//     }
//     return deliveredOnlyAmount;
// }
public static void main(String[] args) {
    Order[] orders = {
        new Order(101, 1200, "DELIVERED"),
        new Order(102, 800, "FAILED"),
        new Order(103, 2500, "DELIVERED"),
        new Order(104, 450, "CANCELLED"),
        new Order(105, 1800, "DELIVERED")
    };
    double result1 = calculateTotalByStatus(orders, "FAILED");
    double result2 = calculateTotalByStatus(orders, "CANCELLED");
    double result3 = calculateTotalByStatus(orders, "DELIVERED");
    System.out.println("Failed amount: " + result1);
    System.out.println("Cancelled amount: " + result2);
    System.out.println("Delivered amount: " + result3);
}
}
