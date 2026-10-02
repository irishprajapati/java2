package modeling.day1;

public class orderExistence {
    static boolean orderExists(int[] orderIds, int requestedId) {
        for(int i = 0; i<orderIds.length; i++){
            if(orderIds[i] == requestedId){ 
                return true;
            }
            }
        return false;
    }

    public static void main(String[] args) {
        int[] orderIds = {101, 205, 309, 412, 518};
        boolean result = orderExists(orderIds, 5118);
        System.out.println(result);
    }
    }

