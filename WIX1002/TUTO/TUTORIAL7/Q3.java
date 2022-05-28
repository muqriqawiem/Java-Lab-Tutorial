package WIX1002.TUTO.TUTORIAL7;

public class Q3 {

    public static void main(String[] args) {
        /*
        String filename = "data.txt";
        String sentence = "Hello World!";
        byte[] bytesSentence = sentence.getBytes();
//Write output stream
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(filename));
            for (byte b : bytesSentence) {
                int B = b;
                String binaryElement = "23456789"; //Just initialize with 8 chacracters
                for (int i = 9; i >= 2; i--) { //follows binaryElement to avoid confusion with 1 and 0
                    int remainder = B % 2;
//System.out.print(remainder);
                    char I = (char) (i + '0'); //convert to char
                    char R = (char) (remainder + '0');
                    binaryElement = binaryElement.replace(I, R);
                    B = B / 2;
                }
                outputStream.println(binaryElement);
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with the output file");
        }
//Read output stream
        try {
            Scanner inputStream = new Scanner(new FileInputStream(filename));
            String tempString, readString = "";
            int decimalValue = 0;
            while (inputStream.hasNextInt()) {
                tempString = inputStream.next();
                for (int i = 7; i >= 0; i--) {
                    double tempValue = (Integer.parseInt(tempString.substring(i, i + 1))) * Math.pow(2,
                            7 - i);
                    decimalValue += tempValue;
                }
                readString += (char) (decimalValue);
                decimalValue = 0;
            }
            System.out.println(readString);
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");

        }
*/
    }

}
