package modeling.day1;

public class limitquestion {
    static boolean hasExceededLimit(int[] deliveryTimes, int limit) {
        for(int i = 0; i<deliveryTimes.length;i++){
            if(deliveryTimes[i]>limit){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] deliveryTimes = {45, 32, 67, 28, 51, 72};
        boolean result = hasExceededLimit(deliveryTimes, 80);
        System.out.println(result);
        
    }
    
}
