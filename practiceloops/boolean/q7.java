
package practiceloops.booleans;

public class q7 {
    public static void main(String[] args) {
        String[] statuses = {
            "DELIVERED",
            "DELIVERED",
            "FAILED",
            "DELIVERED"
        };
        boolean deliveryFailed = false;
        for(int i = 0; i<statuses.length; i++){
            if(statuses[i].equals("FAILED")){
                deliveryFailed = true;
            }
        }
        System.out.println(deliveryFailed);
    }
}
