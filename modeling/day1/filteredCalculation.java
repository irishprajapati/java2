package modeling.day1;

public class filteredCalculation {
    static double calculateDeliveredTotal(
    double[] orderAmounts,
    String[] statuses
){
    double deliveredTotalAmounts = 0;
    for(int i =0; i<orderAmounts.length; i++){
        if(statuses[i].equals("DELIVERED")){
            deliveredTotalAmounts += orderAmounts[i];
        }
        
    }
    return deliveredTotalAmounts;
}
public static void main(String[] args) {
    double[] orderAmounts = {
        1200,
        800,
        2500,
        450,
        1800
    };
    
    String[] statuses = {
        "DELIVERED",
        "FAILED",
        "DELIVERED",
        "CANCELLED",
        "DELIVERED"
    };
    double result = calculateDeliveredTotal(orderAmounts, statuses);
    System.out.println("Value of Delivered Items is: "+ result);
}
    
}
