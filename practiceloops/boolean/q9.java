package practiceloops.booleans;

public class q9 {
    public static void main(String[] args) {
        String[] statuses = {
            "PLACED",
            "PROCESSING",
            "DELIVERED",
            "DELIVERED"
        };
        boolean CanceledOrder = false;
        for(int i = 0; i<statuses.length; i++){
            if(statuses[i].equals("CANCELLED")){
                CanceledOrder = true;
            }
        }
        System.out.println(CanceledOrder);

    }
    
}
