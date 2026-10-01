package practiceloops;

public class q1 {
    public static void main(String[] args) {
        String[] statuses = {
            "DELIVERED",
            "FAILED",
            "DELIVERED",
            "FAILED",
            "CANCELLED"
        };
        int failedCount = 0;
        for(int i = 0; i<statuses.length; i++){
            if(statuses[i].equals("FAILED")){
                failedCount ++;
            }
        }
        System.out.println(failedCount);
    }
    
}
