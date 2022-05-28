package WIX1002.LAB.LAB9;

/*
public class Student extends PersonProfile {

    private String[] courseCode;
    private String[] courseName;
    private int[] Semester;
    private String[] session;
    private int[] mark;
    private String fileName;
    private String[] grade;

    public Student(String name, String gender, String dateOfBirth, String fileName) {
        super(name, gender, dateOfBirth);
        this.fileName = fileName;
        this.courseCode = new String[5];
        this.courseName = new String[5];
        this.Semester = new int[5];
        this.session = new String[5];
        this.mark = new int[5];
        this.grade = new String[5];
        getGrade();
    }

    public void getGrade() {
        try {
            FileInputStream myFile = new FileInputStream(fileName);
            Scanner scanner = new Scanner(myFile);
            int i = 0;
            while (scanner.hasNextLine()) {
                this.courseCode[i] = scanner.nextLine();
                this.courseName[i] = scanner.nextLine();
                this.Semester[i] = scanner.nextInt();
                this.session[i] = scanner.nextLine();
                this.mark[i] = scanner.nextInt();
                if (mark[i] >= 85) {
                    grade[i] = "A";
                } else if (mark[i] >= 75) {
                    grade[i] = "A-";
                } else if (mark[i] >= 70) {
                    grade[i] = "B+";
                } else if (mark[i] >= 65) {
                    grade[i] = "B";
                } else if (mark[i] >= 60) {
                    grade[i] = "B-";
                } else if (mark[i] >= 55) {
                    grade[i] = "C+";
                } else if (mark[i] >= 50) {
                    grade[i] = "C";
                } else if (mark[i] >= 45) {
                    grade[i] = "D";
                } else if (mark[i] >= 35) {
                    grade[i] = "E";
                } else {
                    grade[i] = "F";
                }
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < 5; i++) {
            s += "\nCourseCode: " + courseCode[i] + "\nCourse Name: " + courseName[i]
                    + "\nSemester: " + Integer.toString(Semester[i])
                    + "\nSession: " + session[i]
                    + "\nmark: " + Integer.toString(mark[i])
                    + "\nGrade: " + grade[i];
        }
        return super.toString() + s;
    }
}
*/
