package Titan;

import java.util.ArrayList;
import java.util.Random;

public class NormalTitan<T> {

    ArrayList<Integer> e = new ArrayList<>();

    public int Height() {
        Random r = new Random();
        int a = r.nextInt(35) + 1;
        if (a > 20) {
            return a;
        } else if (a > 10) {
            return a;
        } else {
            return a;
        }
    }

    public int WalkingLegs() {
        Random r = new Random();
        int a = r.nextInt(4) + 1;
        while (a != 1 && a != 3) {
            if (a == 4) {
                return 4;
            } else if (a == 2) {
                return 2;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public int Speed() {
        Random r = new Random();
        int a = r.nextInt(30) + 1;
        if (a > 20) {
            return a;
        } else if (a > 10) {
            return a;
        } else {
            return a;
        }
    }

    public String WalkingPattern() {
        String[] s = {"Not repeated pattern", "Repeated pattern", "Normal pattern"};
        Random r = new Random();
        int randomNumber = r.nextInt(s.length);
        if (randomNumber == 0) {
            return "Not repeated pattern";
        } else if (randomNumber == 1) {
            return "Repeated pattern";
        } else {
            return "Normal pattern";
        }
    }

    public String ClimbingSkill() {
        String[] s = {"Can climb", "Cannot climb"};
        Random r = new Random();
        int randomNumber = r.nextInt(s.length);
        if (randomNumber == 0) {
            return "Can climb";
        } else {
            return "Cannot climb";
        }
    }
}
