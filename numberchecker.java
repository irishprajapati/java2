public class numberchecker {
    public static void main(String[] args) {
        int number = 19;
        isEven(number);
    }
    static void isEven(int number){
        if(number % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    } 
}
