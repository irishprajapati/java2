package modeling.day1;

public class totalvalue {
    static double calculateTotal(double[] orderAmounts){
        double totalAmounts = 0;
        for(int i =0; i<orderAmounts.length; i++){
            totalAmounts += orderAmounts[i];
        }
        return totalAmounts;

    }
    public static void main(String[] args) {
        double[] orderAmounts = {
            1200.50,
            800.00,
            2500.75,
            450.00
        };
        double value = calculateTotal(orderAmounts);
        System.out.println(value);
        
    }
    
}
