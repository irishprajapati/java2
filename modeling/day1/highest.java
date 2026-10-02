package modeling.day1;

public class highest {
    public static void main(String[] args) {
        //tracking as to find the highest value in the array
        int[] orderAmounts = {1200, 450, 3200, 900, 1800};
        //initial state should be like this 
        int highestValue = orderAmounts[0];
        //looping through every element in the array 
        for(int i =0; i<orderAmounts.length;i++){
            //codition to comparison with the each value
            // skip if the next value is less than current one but replace is the present value < next value
            if(highestValue < orderAmounts[i]){
                highestValue = orderAmounts[i]; // set the value if the present value > next one here
            }
        }
        System.out.println("Highest value is: " + highestValue);
    }
    
}
