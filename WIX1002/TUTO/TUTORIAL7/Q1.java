package WIX1002.TUTO.TUTORIAL7;

public class Q1 {

    public static void main(String[] args) {
        /*
a. Store ten random integers within 0 to 1000 to a text file name integer.txt.
        
try {
String filename = "integer.txt";
final int maxRandom = 1000, totalNumber = 10;
//Create PrintWriter object
PrintWriter outputStream = new PrintWriter(new FileOutputStream(filename));
//Create Random object
Random generateRandom = new Random();
for (int i = 0; i < totalNumber; i++) {
outputStream.println(generateRandom.nextInt(maxRandom + 1));
}
outputStream.close(); //deallocates any value in it or any resources associated with it
} catch (IOException error) {
System.out.println("Problem with file output");
}
        
b. Read from the text file generated in a. Display all the integer and the largest
integer.
        
int maxInteger = 0, inputInteger;
try{
String filename = "integer.txt";
Scanner inputStream = new Scanner(new FileInputStream(filename));
while(inputStream.hasNextInt()){
inputInteger = inputStream.nextInt();
System.out.println(inputInteger);
if(inputInteger > maxInteger){
maxInteger = inputInteger;
}
}
System.out.println("The largest integer is " + maxInteger);
inputStream.close();//deallocates any value in it or any resources associated with it
}catch(FileNotFoundException errorRead){
System.out.println("File not found!");
}
        
c. Store ten random integers within 0 to 1000 to a binary file name integer.dat.
        
final int maxRandom = 1000, totalInteger = 10;
int randomInteger;
String filename = "integer.dat";
try {
ObjectOutputStream outputStream = new ObjectOutputStream(new
FileOutputStream(filename));
Random generateRandom = new Random();
for (int i = 0; i < totalInteger; i++) {
randomInteger = generateRandom.nextInt(maxRandom + 1);
outputStream.writeInt(randomInteger);
}
outputStream.close();
} catch (IOException e) {
System.out.println("Error with file output");
}
        
d. Read from the binary file generated in a c. Display the all the integer and the
average.
        
String filename = "integer.dat";
int randomInteger, countInteger = 0, sumInteger = 0;
try {
ObjectInputStream inputStream = new ObjectInputStream(new
FileInputStream(filename));
System.out.println("The random integer in the integer.dat file are: ");
try {
while (true) {
randomInteger = inputStream.readInt();
countInteger++;
sumInteger += randomInteger;
System.out.println(randomInteger);
}
} catch (EOFException e) {}
double average = sumInteger / countInteger;
System.out.printf("The average integer is: %.2f\n",average);
inputStream.close();
} catch (FileNotFoundException e) {
System.out.println("File not found!");
} catch (IOException e) {
System.out.println("Problem with input file!");
}
*/
    }

}
