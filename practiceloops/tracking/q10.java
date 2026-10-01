package practiceloops.tracking;

public class q10 {
    public static void main(String[] args) {
        double[] amounts = {
            1200.50,
            450.00,
            3200.75,
            900.00,
            1800.00
        };
        
        double max = amounts[0];
        for(int i = 0; i<amounts.length;i++){
            if(amounts[i] > max){
                max = amounts[i];
            }
        }
        System.out.println(max);
    }
}
