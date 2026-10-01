package nextone;

public class ex3 {
    public static void main(String[] args) {
        int marks = 73;
        if(marks >=80 & marks<100){
            System.out.println(" Grade A");
        }else if(marks>=60 & marks<=79){
            System.out.println("Grade B");
        }else if(marks >=40 & marks <=59){
            System.out.println("Grade C");
        }else if(marks<40){
            System.out.println("Fail");
        }
    }
}
