package WIA1002.TUTO.TUTO_1;

public class Telephone {
    private String areaCode;
    private int number;
    public Telephone(String areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String makeFullnumber(){
        return areaCode + " - " + number;
    }
}
