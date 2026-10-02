package modeling.day1;

public class secondhighest {
    public static void main(String[] args) {
        int[] orderAmounts = {1200, 450, 3200, 900, 1800};
        int first = orderAmounts[0];
        int second = orderAmounts[1];
        int highestAmount;
        int secondhighestAmount;
        if(first>second){
            highestAmount = first;
            secondhighestAmount = second;
        }else{
            secondhighestAmount = first;
            highestAmount = second;
        }
        for (int i = 2; i < orderAmounts.length; i++) {
            if(orderAmounts[i]>highestAmount){
                first = highestAmount;
                highestAmount = orderAmounts[i];
            }else if(orderAmounts[i]>secondhighestAmount){
                secondhighestAmount = orderAmounts[i];
            }
        }
        System.out.println(highestAmount);
        System.out.println(secondhighestAmount);
    }
}


