package practiceloops;

public class q2 {
    public static void main(String[] args) {
        String[] userStatuses = {
            "ACTIVE",
            "INACTIVE",
            "ACTIVE",
            "ACTIVE",
            "BLOCKED",
            "INACTIVE"
        };
        int ActiveUsers = 0;
        for(int i =0; i<userStatuses.length; i++){
            if(userStatuses[i].equals("ACTIVE")){
                ActiveUsers++;
            }
        }
        System.out.println("Number of Active Users are: " + ActiveUsers);
    }
}
