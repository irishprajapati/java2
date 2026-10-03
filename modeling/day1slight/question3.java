package modeling.day1slight;

public class question3 {
    static void printDeliverySummary(int[] deliveryTimes){
        int Fastest = deliveryTimes[0]; //initial state why zero
        int slowest = deliveryTimes[1];
        for(int i =0; i< deliveryTimes.length; i++){
            if(deliveryTimes[i] < Fastest){
                //if the delivery time is less than fastest value in index 0 then put it
                Fastest = deliveryTimes[i];
            }else if(deliveryTimes[i]> slowest){
                slowest = deliveryTimes[i];
            }
        }
        System.out.println(Fastest);
        System.out.println(slowest);
    }
    public static void main(String[] args) {
        int[] deliveryTimes = {42, 67, 31, 89, 54, 73, 28};
        printDeliverySummary(deliveryTimes);
    }
    
}
