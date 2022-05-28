package WIX1002.TUTO.TUTORIAL8;

public class Q2 {


    public static void main(String[] args) {
        /*
        2. Write statements for each of the following
a. Define a class Digit.
b. Declare the instance variable that used to store a number.
c. Create a constructor that assign the parameter value to the number.
d. Create a digitMultiplication method that returns the multiplication of the
number. If the number is 1345, the method will return 60.
Example: 1x3x4x5 = 60
e. Create a method that used to display the digit multiplication of the number.
f. Create a tester class that displays the digit multiplication of 4567.
        
        
        
//Create a java class file with name ‘Digit’
public class Digit {
//instance variables
private int number;
//constructor
public Digit(int integerNumber){
number = integerNumber;
}
//method
public int digitMultiplication(){
int numberA = number;
int digitExtract = 1;
while(numberA > 0){
digitExtract *= (numberA%10); //answer = answer*(number%10)
numberA /= 10;
}
return digitExtract;
}
public void displayDigitMultiplication(){
System.out.println("The digit multiplication of " + number + " is " +
digitMultiplication());
}
}
//Create a java class file with name ‘TestingQuestion2’
public class TestingQuestion2 {
public static void main(String[] args) {
Digit objDigit = new Digit(1345);
objDigit.displayDigitMultiplication();
System.out.println(objDigit.digitMultiplication());
}
}

        */
    }
    
}
