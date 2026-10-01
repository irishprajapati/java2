package practiceloops.accumulator;

public class q4 {
    public static void main(String[] args) {
        double[] orderAmounts = {
            1200.50,
            800.00,
            2500.75,
            450.00
        };
        double TotalValue = 0;
        for(int i=0; i<orderAmounts.length; i++){
            TotalValue += orderAmounts[i];
            System.out.println(TotalValue);
        }
}
}