package practiceloops.tracking.set1;

public class q4 {

    class Order {
        int id;
        double amount;
        String status;

        Order(int id, double amount, String status) {
            this.id = id;
            this.amount = amount;
            this.status = status;
        }
    }

    public static void main(String[] args) {
        Order order1 = new Order(101, 1200, "DELIVERED");
        Order order2 = new Order(102, 800, "FAILED");
        Order order3 = new Order(103, 2500, "DELIVERED");

        Order[] orders = {
            order1,
            order2,
            order3
        };
        for(int i = 0; i<orders.length; i++){
            if(orders[i].equals("DELIVERED")){
                amount += orders[i];
            }
            System.out.println(amount);
        }
    }
}