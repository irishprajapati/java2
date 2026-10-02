package practiceloops.tracking.set1;

public class q1 {
    public static void main(String[] args) {
        int[] deliveryTimes = {
            45,
            32,
            67,
            28,
            51
        };
        int fastDelivered = deliveryTimes[0];
        for(int i = 0; i<deliveryTimes.length; i++){
            if(deliveryTimes[i]<fastDelivered){
                fastDelivered = deliveryTimes[i];
            }
        }
        System.out.println(fastDelivered);
    }
    
}
