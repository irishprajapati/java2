package practiceloops.tracking.set1;


public class q2 {
    int[] amounts = {
        1200,
        450,
        3200,
        900,
        1800
    };
    public static int findHighest(int[] numbers){
        int highestNumber = numbers[0];
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>highestNumber){
                highestNumber = numbers[i];
            }
        }
        return highestNumber;
    }
    
    public static void main(String[] args) {
        int result = findHighest(new q2().amounts);
        System.out.println(result);
    
    }
}
