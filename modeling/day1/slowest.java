package modeling.day1;

public class slowest {
    public static void main(String[] args) {
        int[] deliveryTimes = {45, 32, 67, 28, 51, 72};
        //initializing state
        int slowestDelivery = deliveryTimes[0];
        for(int i = 1; i<deliveryTimes.length; i++){
            if(deliveryTimes[i]>slowestDelivery){
                slowestDelivery = deliveryTimes[i];
            }
        }
        System.out.println(slowestDelivery);
    }
    
}
