package practiceloops.tracking;

public class q12 {
    public static void main(String[] args) {
        String[] orderIds = {
            "ORD-101",
            "ORD-102",
            "ORD-103",
            "ORD-104"
        };
        
        String requestedOrder = "ORD-103";
        for(int i = 0; i<orderIds.length; i++){
            if(orderIds[i].equals(requestedOrder)){
                System.out.println(true);
            }
        }
    }
}
