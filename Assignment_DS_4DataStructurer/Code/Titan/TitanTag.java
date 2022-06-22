package Titan;

public class TitanTag {
    int number;
    int risk;

    public TitanTag(int number, int risk) {
        this.number = number;
        this.risk = risk;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    @Override
    public String toString() {
        return "Titan " + number; // To change body of generated methods, choose Tools | Templates.
    }
}
