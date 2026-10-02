package modeling.day1;

public class deliveryTimes {
    public static void main(String[] args) {
        int [] deliveryTimes = {45, 32, 67, 28, 51, 72};
        int fastestDeliveryCount = deliveryTimes[0]; //initial state
        //looping
        for(int i = 0; i<deliveryTimes.length; i++){
            //condition checker
            if(fastestDeliveryCount > deliveryTimes[i]){
                fastestDeliveryCount = deliveryTimes[i];
            }
        }
        System.out.println(fastestDeliveryCount);
    }
    
}
