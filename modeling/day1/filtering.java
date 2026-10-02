package modeling.day1;

public class filtering {
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
        double deliveredAmounts = 0; // initial state
        //looping through every element in the array 
        for(int i = 0; i<orderAmounts.length; i++){
            //condition checker
            if(statuses[i].equals("DELIVERED")){
                deliveredAmounts += orderAmounts[i];
            }
        }   
        System.out.println("Total amount of delivered items: " + deliveredAmounts);
    }
    
}
