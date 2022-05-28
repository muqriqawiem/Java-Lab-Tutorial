package WIX1002.LAB.LAB7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        try {
            String textOriginal;
            Scanner inputStream = new Scanner(new FileInputStream("data.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("reverse.txt"));
            while (inputStream.hasNextLine()) {
                textOriginal = inputStream.nextLine();
                for (int i = textOriginal.length() - 1; i >= 0; i--) {
                    outputStream.print(textOriginal.charAt(i));
                }
                outputStream.println();
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException error) {
            System.out.println("File not found");
        } catch (IOException error) {
            System.out.println("IO Error:" + error.getMessage());
        }
    }

}
