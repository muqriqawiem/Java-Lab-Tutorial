package WIX1002.LAB.LAB7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        try {
            String text;
            int countCharacters = 0, countWords = 0, countLines = 0, counting = 0;
//Read txt. file
            Scanner inputStream = new Scanner(new FileInputStream("data.txt"));
            while (inputStream.hasNextLine()) {
                text = inputStream.nextLine();
                System.out.println("The text from file: " + text);
                countLines++;
                countCharacters += text.length();//countCharacters = countCharacters + length
//Count word
                String[] splitText = text.split(" ");
                countWords = splitText.length;
            }
            inputStream.close();
            System.out.println("Total lines: " + countLines);
            System.out.println("Total characters: " + countCharacters);
            System.out.println("Total words: " + countWords);
        } catch (FileNotFoundException error) {
            System.out.println("File not found");
        } //catch (IOException error) {
           // System.out.println("IO Error: " + error.getMessage());
        }

    }
