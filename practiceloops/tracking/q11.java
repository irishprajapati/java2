package practiceloops.tracking;

public class q11 {
    public static void main(String[] args) {
        int[] numbers = {
            45,
            12,
            89,
            7,
            34
        };
        int lowestNumbers = numbers[0];
        for(int i =0; i<numbers.length; i++){
            if(numbers[i]<lowestNumbers){
                lowestNumbers = numbers[i];
            }
        }
        System.out.println(lowestNumbers);
    }
    
}
