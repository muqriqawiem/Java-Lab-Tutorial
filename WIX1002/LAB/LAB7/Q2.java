package WIX1002.LAB.LAB7;

import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class Q2 {

    public static void main(String[] args) {

        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            try (Scanner in = new Scanner(stream)) {
                PrintWriter outputStream = new PrintWriter(new FileOutputStream("index.htm"));
                while (in.hasNextLine()) {
                    outputStream.println(in.nextLine());
                }
                outputStream.close();
            }
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }

    }

}