package WIA1002.TUTO.TUTO_1;

public class MainTelephone {


    public static void main(String[] args) {
        Telephone [] phoneArray = new Telephone [5];
        int number = 7967300;
        
        for(int i = 0;i <  5;i++){
            phoneArray[i] = new Telephone("03",number++);
        }
        
        for(int i = 0;i <  5;i++){
            System.out.println(phoneArray[i].makeFullnumber());
        }
        
        
    }
    
}
