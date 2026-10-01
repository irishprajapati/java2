package practiceloops.booleans;

public class q8 {
    public static void main(String[] args) {
    String[] usernames = {
        "erish",
        "ram",
        "sita",
        "hari"
    };
    String requestedUsername = "sita";
    for(int i = 0; i<usernames.length; i++){
        if(usernames[i].equals(requestedUsername)){
            System.out.println("Exists");
        }

    }
    }
    
}
