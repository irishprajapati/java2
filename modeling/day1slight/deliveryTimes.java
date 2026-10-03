package modeling.day1slight;

public class deliveryTimes {
    static int countDelayedDeliveries(int[] deliveryTimes){
        int lateDelivery = 0;
        for(int i = 0; i<deliveryTimes.length;i++){
            if(deliveryTimes[i]>=50){
                //total number of late delivery 
                lateDelivery++;
            }
        }
        return lateDelivery;
    }
    public static void main(String[] args) {
        int[] deliveryTimes = {35, 52, 61, 44, 78, 29, 91, 47};
        int totalLateDelivery = countDelayedDeliveries(deliveryTimes);
        System.out.println(totalLateDelivery);

        
    }
    
}
