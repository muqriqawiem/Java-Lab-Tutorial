package WIX1002.FinalExam.src;

//U2000726
public class U2000726Diving {
    private String participantName;
    private String country;
    private String judges1,judges2,judges3,judges4,judges5,judges6,judges7;
    private double difficultyRating1,difficultyRating2,difficultyRating3;

    public U2000726Diving(String participantName, String country, String judges1, String judges2, String judges3, String judges4, String judges5, String judges6, String judges7, double difficultyRating1, double difficultyRating2, double difficultyRating3) {
        this.participantName = participantName;
        this.country = country;
        this.judges1 = judges1;
        this.judges2 = judges2;
        this.judges3 = judges3;
        this.judges4 = judges4;
        this.judges5 = judges5;
        this.judges6 = judges6;
        this.judges7 = judges7;
        this.difficultyRating1 = difficultyRating1;
        this.difficultyRating2 = difficultyRating2;
        this.difficultyRating3 = difficultyRating3;
    }

    public String getParticipantName() {
        return participantName;
    }

    public String getCountry() {
        return country;
    }
    
    public static void finalScore(){
        
    }
    
    @Override
    public String toString(){
        String out = null;
        return out;
    }
}
