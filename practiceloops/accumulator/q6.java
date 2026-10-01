package practiceloops.accumulator;

public class q6 {
    public static void main(String[] args) {
        int[] quantities = {
            2,
            5,
            1,
            3,
            4
        };
        int TotalQuantity = 0;
        for(int i = 0; i<quantities.length; i++){
            TotalQuantity += quantities[i];

        }
        System.out.println(TotalQuantity);
    }
    
}
