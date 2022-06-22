package SoldierArrangement;

public class Characters {

    String name, height, weight, strength, agility, intel, coor, lead;

    public Characters(String a, String b, String c, String d, String e, String f, String g, String h) {
        name = a;
        height = b;
        weight = c;
        strength = d;
        agility = e;
        intel = f;
        coor = g;
        lead = h;
        System.out.println(toString());
    }

    public void remove(String a, String b, String c, String d, String e, String f, String g, String h) {
        name = null;
        height = null;
        weight = null;
        strength = null;
        agility = null;
        intel = null;
        coor = null;
        lead = null;
    }

    @Override
    public String toString() {
        return "" + "\nname\t= " + name + "\nheight\t= " + height + "cm" + "\nweight\t= " + weight + "kg"
                + "\nstrength\t= " + strength + "\nagility\t= " + agility + "\nintelligence = " + intel
                + "\ncoordination = " + coor + "\nleadership   = " + lead;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getStrength() {
        return strength;
    }

    public String getAgility() {
        return agility;
    }

    public String getIntel() {
        return intel;
    }

    public String getCoor() {
        return coor;
    }

    public String getLead() {
        return lead;
    }
}
