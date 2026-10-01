package loops;
//why it is saying the incorrect package even when the loops is the folder name

public class imp {
    // for loops i have to understand these 3 things
    // initialize which means where do i start int i = 0;
    //what is the condition which means how long do i continue i<numbers.length()
    // how do i move forward which means increment on the basis of condition written
    public static void main(String[] args) {
        
    
    String[] statuses = {
        "DELIVERED",
        "FAILED",
        "DELIVERED",
        "CANCELLED",
        "FAILED",
        "DELIVERED"
    };
    
    int failedCount = 0;
    for(int i = 0; i<statuses.length; i++){
        if(statuses[i].equals("FAILED")){
            failedCount++;
            //System.out.println(failedCount);
        }
    }
    System.out.println(failedCount);
}
}
