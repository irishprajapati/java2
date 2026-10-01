package practiceloops;

public class q3 {
    public static void main(String[] args) {
        String[] orderStatuses = {
            "PLACED",
            "CANCELLED",
            "DELIVERED",
            "CANCELLED",
            "PROCESSING"
        };
        int CancelledOrders = 0;
        for(int i = 0; i<orderStatuses.length; i++){
            if(orderStatuses[i].equals("CANCELLED")){
                CancelledOrders++;
            }
        }
        System.out.println(CancelledOrders);
    }
}
