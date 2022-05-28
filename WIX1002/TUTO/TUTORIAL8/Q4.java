package WIX1002.TUTO.TUTORIAL8;

public class Q4 {


    public static void main(String[] args) {
        /*
        4. Create a class Payment that accept different type of payment methods such as
cash payment, cheque payment and credit card payment. For cash payment, the
class accepts the amount in cash; for cheque payment, the class accepts the
amount and the cheque number; for credit card payment, the class accepts the
amount, card holder name, cardType, expiration date and validation code. Use
the same method name for the payment.
        
        
        
//Create a java class file with name ‘Payment’
public class Payment {
//instance varables
private double amount;
private String chequeNumber, holderName, cardType, expirationDate;
private int code;
//Cash
public void paid(double amountPaid){
amount = amountPaid;
System.out.println("Total cash paid is " + amount);
}
//Cheque
public void paid(double amountPaid, String chequeNum){
amount = amountPaid;
chequeNumber = chequeNum;
System.out.println("Total paid by cheque is " + amount);
System.out.println("The cheque number is " + chequeNumber);
}
//CC
public void paid(double amountPaid, String holderName, String cardType, String
expirationDate, int code){
amount = amountPaid;
this.holderName = holderName;
this.cardType = cardType;
this.expirationDate = expirationDate;
this.code = code;
System.out.println("Total paid by credit card is " + amount);
System.out.println("The holder name is " + holderName);
}
}
//Create a java class file with name ‘TestingQuestion4’
public class TestingQuestion4 {
public static void main(String[] args) {
Payment objPayment = new Payment();
objPayment.paid(45.00, "S100");
}
}
        */
    }
    
}
