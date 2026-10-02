package modeling.day1;

public class accumulator {
    public static void main(String[] args) {
        double[] orderAmounts = {
            1200.50,
            800.00,
            2500.75,
            450.00
        };
        double totalOrderValue = 0;// as the double is required
        //looping through every data in the array 
        for(int i = 0; i<orderAmounts.length; i++){
            totalOrderValue += orderAmounts[i];
        }
        System.out.println("Total amount: " + totalOrderValue);
        
    }
    
}
