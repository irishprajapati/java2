package modeling.day1;

public class morethan60 {
    public static void main(String[] args) {
        int[] deliveryTimes = {45, 32, 67, 28, 51, 72};
        boolean morethan60mins = false;
        for(int i = 0; i<deliveryTimes.length;i++){
            if(deliveryTimes[i]>60){
                morethan60mins = true;
                break;
            }
        }
        System.out.println(morethan60mins);
    }

    
}
