package WIX1002.LAB.LAB3;

import java.util.Scanner;

/**
 *
 * @author Muqri Qawiem
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /*
        Write a program that stimulates a simple calculator. It reads two integers and a 
        character. If the character is a +, the sum is printed; if it is a -, the difference is 
        printed; if is a *, the multiplication is printed; if it is a /, the quotient is printed; and if 
        it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)
        */
        
        int num01,num02,answer;
        String letter;
        
        Scanner number01 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num01 = number01.nextInt();
        
        Scanner number02 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        num02 = number02.nextInt();
        
        Scanner character = new Scanner(System.in);
        System.out.print("Enter the operand: ");
        letter = character.next();
        
        if("+".equals(letter)){
            answer = num01 + num02;
            System.out.println(num01 + " " + letter + " " + num02 + " = " + answer);
        }else if("-".equals(letter)){
            answer = num01 - num02;
            System.out.println(num01 + " " + letter + " " + num02 + " = " + answer);
        }else if("*".equals(letter)){
            answer = num01 * num02;
            System.out.println(num01 + " " + letter + " " + num02 + " = " + answer);
        }else if("/".equals(letter)){
            answer = num01 / num02;
            System.out.println(num01 + " " + letter + " " + num02 + " = " + answer);
        }else if("%".equals(letter)){
            answer = num01 / num02;
            System.out.println(num01 + " " + letter + " " + num02 + " = " + answer);
        }
        
      
        
        
    }
    
}
