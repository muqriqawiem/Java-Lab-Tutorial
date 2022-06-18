package WIA1002.DS.MarleyWordConverter;

import java.util.Scanner;
import java.util.Stack;

public class TestMarleyConverter extends CustomHashmap {
    static void reverse(char A[], int l, int h) {
        if (l < h) {
            char ch = A[l];
            A[l] = A[h];
            A[h] = ch;
            reverse(A, l + 1, h - 1);
        }
    }

    // Function to return the modified string
    static String reverseParentheses(String str, int len) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < len; i++) {

            // Push the index of the current
            // opening bracket
            if (str.charAt(i) == '(') {
                st.push(i);
            }

            // Reverse the substring starting
            // after the last encountered opening
            // bracket till the current character
            else if (str.charAt(i) == ')') {
                char[] A = str.toCharArray();
                reverse(A, st.peek() + 1, i);
                str = String.copyValueOf(A);
                st.pop();
            }
        }

        // To store the modified string
        String res = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ')' && str.charAt(i) != '(') {
                res += (str.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter Marley Sentence :\t");
            String marleysc = scan.next();// create scanner nextline

            String temp = "";// another bekas

            CustomHashmap<Character, Character> marley = new CustomHashmap<>();

            marley.put('a', 'j');
            marley.put('b', 'c');
            marley.put('c', 't');
            marley.put('d', 'a');
            marley.put('e', 'k');
            marley.put('f', 'z');
            marley.put('g', 'x');
            marley.put('h', 'i');
            marley.put('i', 'w');
            marley.put('j', 'x');
            marley.put('k', 'o');
            marley.put('l', 'n');
            marley.put('m', 'g');
            marley.put('n', 'b');
            marley.put('o', 'f');
            marley.put('p', 'h');
            marley.put('q', 'l');
            marley.put('r', 'd');
            marley.put('s', 'e');
            marley.put('t', 'y');
            marley.put('u', 'm');
            marley.put('v', 'v');
            marley.put('w', 'u');
            marley.put('x', 'p');
            marley.put('y', 'q');
            marley.put('z', 'r');
            marley.put('$', ' ');
            marley.put(',', ',');

            String jadi = reverseParentheses(marleysc, marleysc.length());
            ;

            for (int j = 0; j < jadi.length(); j++) {
                Character translated = marley.get(jadi.charAt(j));
                temp += translated;
            }
            System.out.println(temp);
        }
    }
}
