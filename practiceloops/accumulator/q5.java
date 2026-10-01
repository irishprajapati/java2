package practiceloops.accumulator;

public class q5 {
    public static void main(String[] args) {
        double[] amounts = {
            1200,
            800,
            500,
            2200,
            700
        };
        
        String[] statuses = {
            "DELIVERED",
            "FAILED",
            "DELIVERED",
            "CANCELLED",
            "DELIVERED"
        };
        double TotalDeliveredAmounts = 0;
        int DeliveredCounts = 0;
        for(int i = 0; i<statuses.length; i++){
            if(statuses[i].equals("DELIVERED")){
                TotalDeliveredAmounts += amounts[i];
            }
        }
        System.out.println(TotalDeliveredAmounts);
        System.out.println(DeliveredCounts);
    }
}
