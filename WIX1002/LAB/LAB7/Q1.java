package WIX1002.LAB.LAB7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        String[] courseCode = {"WIX1002", "WIX1003", "WIX1001", "WIA1001"};
        String[] courseName = {"Programming I", "Data Structure", "Operating System", "ComputingMathematics I"};
        //Store in binary file
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            for (int i = 0; i < 4; i++) {
                outputStream.writeUTF(courseCode[i]); //use writeUTF when you want to write string to binary file 
                outputStream.writeUTF(courseName[i]);
            }
            outputStream.close();
        } catch (IOException error) {
            System.out.println("Error with file output ");
        }
        //Display the course name from coursename.dat according to course code entered by user
        boolean statusSearch = false;
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Please enter a course code:");
            String codeUser = userInput.nextLine();
            try {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("coursename.dat"));
                try {
                    while (true) {
                        if (codeUser.equals(inputStream.readUTF())) {
                            System.out.println("Course code: " + codeUser);
                            System.out.println("Course name: " + inputStream.readUTF());
                            statusSearch = true;
                            break;
                        } else {
                            inputStream.readUTF();
                        }
                    }
                } catch (EOFException error) {
                    inputStream.close();
                }
            } catch (FileNotFoundException error) {
                System.out.println("File not found");
            } catch (IOException error) {
                System.out.println("Error with file input ");
            }
        }
        if (statusSearch == false) {
            System.out.println("Course code not found!");
        }

    }

}
