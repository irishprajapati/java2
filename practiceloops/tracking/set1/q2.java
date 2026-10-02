package practiceloops.tracking.set1;


public class q2 {
    public static int findHighest(int[] numbers){
        int[] amounts = {
            1200,
            450,
            3200,
            900,
            1800
        };
        int highestAmount = amounts[0];

        for(int i = 0; i<amounts.length;i++){
            if(amounts[i]>highestAmount){
                highestAmount = amounts[i];
            }
        }
    }
    
    public static void main(String[] args) {
    
    }
    
}
