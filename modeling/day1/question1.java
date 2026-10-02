package modeling.day1;

public class question1 {
    public static void main(String[] args) {
        int[] deliveryTimes = {45, 32, 67, 28, 51};
        int count = 0; //state 
        for(int i = 0; i<deliveryTimes.length;i++){ //looping
            if(deliveryTimes[i]>40){ //checking the condition
                //updating the state
                count++;
            }
            }
            System.out.println(count);
        }
        }
