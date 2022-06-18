package WIA1002.DS.SoldierArrangement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SoldierArrangement {
    public static void main(String[] args) throws IOException {
        DoublyLinkedList<String> tmp = new DoublyLinkedList<String>();
        DoublyLinkedList<Character> Allies = new DoublyLinkedList<Character>();
        SortList<Character> Sort = new SortList<Character>();
        DoublyLinkedList<Character> CheckList = new DoublyLinkedList<Character>();
        FileWriter out = new FileWriter("Eren's Allies.txt", true);
        PrintWriter outFile = new PrintWriter(out);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("******* Eren's Allies ********\n");
            while (true) {
                System.out.println("\nDo you want to enter allies? (yes/no) ");
                String input = sc.nextLine();

                if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
                    System.out.println("\nName (name and surname): ");
                    String name = sc.nextLine();

                    System.out.println(
                            "Enter Character (height, weight, strength, agility, intelligence, coordination, leadership) : ");
                    String input1 = sc.nextLine();
                    int i = 0;
                    // to split the Character and store into listchar

                    for (String s : input1.split(" ")) {

                        i++;
                        tmp.add(i, s);

                    }

                    // listchar.iterateForward();
                    System.out.println("");
                    // remove the Character in listchar and assign to the string Character
                    String height = tmp.removeFirst();
                    String weight = tmp.removeFirst();
                    String strength = tmp.removeFirst();
                    String agility = tmp.removeFirst();
                    String intel = tmp.removeFirst();
                    String coor = tmp.removeFirst();
                    String lead = tmp.removeFirst();

                    outFile.print(
                            name + " " + height + " " + weight + " " + strength + " " + agility + " " + intel + " "
                                    + coor + " " + lead);
                    outFile.println();
                    outFile.close();
                    continue;
                } else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Incorrect input");
                }

            }
            // list.clear();

            System.out.println("");
            System.out.println("*********** Soldiers Available ************");
            try {

                // File myObj = new File("filename.txt");
                FileReader fr = new FileReader("Eren's Allies.txt");
                Scanner myReader = new Scanner(fr);
                while (myReader.hasNextLine()) {
                    String data = null;
                    data = myReader.nextLine();
                    int i = 0;
                    tmp.clear();
                    // System.out.println(data);

                    for (String s : data.split(" ")) {

                        tmp.add(i, s);
                        i++;

                    }
                    String name = tmp.removeFirst() + " " + tmp.removeFirst();

                    String height = tmp.removeFirst();
                    String weight = tmp.removeFirst();
                    String strength = tmp.removeFirst();
                    String agility = tmp.removeFirst();
                    String intel = tmp.removeFirst();
                    String coor = tmp.removeFirst();
                    String lead = tmp.removeFirst();
                    Character character = new Character(name, height, weight, strength, agility, intel, coor, lead);
                    Allies.addLast(character);

                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred. ");
                e.printStackTrace();

            }

            while (true) {

                CheckList.clear();
                Sort.clear();

                System.out.println("");
                System.out.print("Do you want to sort attribute? : ");
                String input1 = sc.nextLine();
                if (input1.equalsIgnoreCase("yes") || input1.equalsIgnoreCase("y")) {
                    System.out.println(
                            "Available attributes : height, weight, strength, agility, intelligence, coordination, leadership");
                    System.out.print("\nSorting attribute: ");
                    String attribute = sc.nextLine();
                    System.out.println("\nSorting from highest to lowest : \n");
                    switch (attribute) {
                        case "height":
                            for (int k = 0; k < Allies.size(); k++) {
                                int height = Integer.parseInt(Allies.show(k).getHeight());
                                Sort.addNode(height);
                            }
                            Sort.sortList();
                            // CList.display();
                            for (int i = 0; i < Allies.size(); i++) {
                                for (int j = 0; j < Allies.size(); j++) {
                                    if (Sort.show(i) == Integer.parseInt(Allies.show(j).getHeight())) {
                                        if (!CheckList.contains(Allies.show(j))) {
                                            System.out.println(Allies.show(j).getName() + " " + Sort.show(i));

                                            CheckList.addFirst(Allies.show(j));
                                        }

                                    }

                                }
                            }

                            break;
                        case "weight":
                            for (int k = 0; k < Allies.size(); k++) {
                                int height = Integer.parseInt(Allies.show(k).getWeight());
                                Sort.addNode(height);
                            }
                            Sort.sortList();
                            // CList.display();
                            for (int i = 0; i < Allies.size(); i++) {
                                for (int j = 0; j < Allies.size(); j++) {
                                    if (Sort.show(i) == Integer.parseInt(Allies.show(j).getWeight())) {
                                        // String printed = "";
                                        // System.out.println(list.show(j));
                                        if (!CheckList.contains(Allies.show(j))) {
                                            System.out.println(Allies.show(j).getName() + " " + Sort.show(i));

                                            CheckList.addFirst(Allies.show(j));
                                        }

                                    }

                                }
                            }

                            break;
                        case "strength":
                            for (int k = 0; k < Allies.size(); k++) {
                                int height = Integer.parseInt(Allies.show(k).getStrength());
                                Sort.addNode(height);
                            }
                            Sort.sortList();
                            // CList.display();
                            for (int i = 0; i < Allies.size(); i++) {
                                for (int j = 0; j < Allies.size(); j++) {
                                    if (Sort.show(i) == Integer.parseInt(Allies.show(j).getStrength())) {
                                        // String printed = "";
                                        // System.out.println(list.show(j));
                                        if (!CheckList.contains(Allies.show(j))) {
                                            System.out.println(Allies.show(j).getName() + " " + Sort.show(i));
                                            CheckList.addFirst(Allies.show(j));
                                        }

                                    }

                                }
                            }

                            break;
                        case "agility":
                            for (int k = 0; k < Allies.size(); k++) {
                                int height = Integer.parseInt(Allies.show(k).getAgility());
                                Sort.addNode(height);
                            }
                            Sort.sortList();
                            // CList.display();
                            for (int i = 0; i < Allies.size(); i++) {
                                for (int j = 0; j < Allies.size(); j++) {
                                    if (Sort.show(i) == Integer.parseInt(Allies.show(j).getAgility())) {
                                        // String printed = "";
                                        // System.out.println(list.show(j));
                                        if (!CheckList.contains(Allies.show(j))) {
                                            System.out.println(Allies.show(j).getName() + " " + Sort.show(i));

                                            CheckList.addFirst(Allies.show(j));
                                        }

                                    }

                                }
                            }

                            break;
                        case "intelligence":
                            for (int k = 0; k < Allies.size(); k++) {
                                int height = Integer.parseInt(Allies.show(k).getIntel());
                                Sort.addNode(height);
                            }
                            Sort.sortList();
                            // CList.display();
                            for (int i = 0; i < Allies.size(); i++) {
                                for (int j = 0; j < Allies.size(); j++) {
                                    if (Sort.show(i) == Integer.parseInt(Allies.show(j).getIntel())) {
                                        // String printed = "";
                                        // System.out.println(list.show(j));
                                        if (!CheckList.contains(Allies.show(j))) {
                                            System.out.println(Allies.show(j).getName() + " " + Sort.show(i));

                                            CheckList.addFirst(Allies.show(j));
                                        }

                                    }

                                }
                            }

                            break;
                        case "coordination":
                            for (int k = 0; k < Allies.size(); k++) {
                                int height = Integer.parseInt(Allies.show(k).getCoor());
                                Sort.addNode(height);
                            }
                            Sort.sortList();
                            // CList.display();
                            for (int i = 0; i < Allies.size(); i++) {
                                for (int j = 0; j < Allies.size(); j++) {
                                    if (Sort.show(i) == Integer.parseInt(Allies.show(j).getCoor())) {
                                        // String printed = "";
                                        // System.out.println(list.show(j));
                                        if (!CheckList.contains(Allies.show(j))) {
                                            System.out.println(Allies.show(j).getName() + " " + Sort.show(i));

                                            CheckList.addFirst(Allies.show(j));
                                        }

                                    }

                                }
                            }

                            break;
                        case "leadership":
                            for (int k = 0; k < Allies.size(); k++) {
                                int height = Integer.parseInt(Allies.show(k).getLead());
                                Sort.addNode(height);
                            }
                            Sort.sortList();
                            // CList.display();
                            for (int i = 0; i < Allies.size(); i++) {
                                for (int j = 0; j < Allies.size(); j++) {
                                    if (Sort.show(i) == Integer.parseInt(Allies.show(j).getLead())) {
                                        // String printed = "";
                                        // System.out.println(list.show(j));
                                        if (!CheckList.contains(Allies.show(j))) {
                                            System.out.println(Allies.show(j).getName() + " " + Sort.show(i));

                                            CheckList.addFirst(Allies.show(j));
                                        }

                                    }

                                }
                            }

                            break;
                        default:
                            System.out.print("Attribute not found.");

                    }

                    // System.out.println("");
                    continue;
                } else if (input1.equalsIgnoreCase("no") || input1.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Incorrect input");
                }
            }

            // System.out.print("Do you want to search for ability? : ");
            // String input1 = sc.nextLine();
            while (true) {
                CheckList.clear();
                System.out.println("");
                System.out.print("Do you want to search for ability? : ");
                String input1 = sc.nextLine();
                if (input1.equalsIgnoreCase("yes") || input1.equalsIgnoreCase("y")) {
                    System.out.println(
                            "Available ability : height, weight, strength, agility, intelligence, coordination, leadership");
                    System.out.print("\nFinding ability : ");
                    String ability = sc.nextLine();
                    System.out.print("Value : ");
                    String valueAbility = sc.nextLine();
                    System.out.println("");

                    switch (ability) {
                        case "height":
                            System.out.println("Soldier : ");
                            for (int i = 0; i < Allies.size(); i++) {
                                if (Allies.show(i).getHeight().equalsIgnoreCase(valueAbility)) {
                                    System.out.print(Allies.show(i).getName() + ", ");
                                    CheckList.addFirst(Allies.show(i));
                                }
                            }
                            if (CheckList.isEmpty()) {
                                System.out.println("No soldiers found :( ");
                            }
                            break;
                        case "weight":
                            System.out.println("Soldier : ");
                            for (int i = 0; i < Allies.size(); i++) {
                                if (Allies.show(i).getWeight().equalsIgnoreCase(valueAbility)) {
                                    System.out.print(Allies.show(i).getName() + ", ");
                                    CheckList.addFirst(Allies.show(i));
                                }
                            }
                            if (CheckList.isEmpty()) {
                                System.out.println("No soldiers found :( ");
                            }
                            break;
                        case "strength":
                            System.out.println("Soldier : ");
                            for (int i = 0; i < Allies.size(); i++) {
                                if (Allies.show(i).getStrength().equalsIgnoreCase(valueAbility)) {
                                    System.out.print(Allies.show(i).getName() + ", ");
                                    CheckList.addFirst(Allies.show(i));
                                }
                            }
                            if (CheckList.isEmpty()) {
                                System.out.println("No soldiers found :( ");
                            }
                            break;
                        case "agility":
                            System.out.println("soldier : ");
                            for (int i = 0; i < Allies.size(); i++) {
                                if (Allies.show(i).getAgility().equalsIgnoreCase(valueAbility)) {
                                    System.out.print(Allies.show(i).getName() + ", ");
                                    CheckList.addFirst(Allies.show(i));
                                }
                            }
                            if (CheckList.isEmpty()) {
                                System.out.println("No soldiers found :( ");
                            }
                            break;
                        case "intelligence":
                            System.out.println("soldier : ");
                            for (int i = 0; i < Allies.size(); i++) {
                                if (Allies.show(i).getIntel().equalsIgnoreCase(valueAbility)) {
                                    System.out.print(Allies.show(i).getName() + ", ");
                                    CheckList.addFirst(Allies.show(i));
                                }
                            }
                            if (CheckList.isEmpty()) {
                                System.out.println("No soldiers found :( ");
                            }
                            break;
                        case "coordination":
                            System.out.println("soldier : ");
                            for (int i = 0; i < Allies.size(); i++) {
                                if (Allies.show(i).getCoor().equalsIgnoreCase(valueAbility)) {
                                    System.out.print(Allies.show(i).getName() + ", ");
                                    CheckList.addFirst(Allies.show(i));
                                }
                            }
                            if (CheckList.isEmpty()) {
                                System.out.println("No soldiers found :( ");
                            }
                            break;
                        case "leadership":
                            System.out.println("soldier : ");
                            for (int i = 0; i < Allies.size(); i++) {
                                if (Allies.show(i).getLead().equalsIgnoreCase(valueAbility)) {
                                    System.out.print(Allies.show(i).getName() + ", ");
                                    CheckList.addFirst(Allies.show(i));
                                }
                            }
                            if (CheckList.isEmpty()) {
                                System.out.println("No soldiers found :( ");
                            }
                            break;
                        default:
                            System.out.print("Ability not found.");
                    }
                    System.out.println("");
                    continue;
                } else if (input1.equalsIgnoreCase("no") || input1.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Incorrect input. ");
                }
            }
        } catch (NumberFormatException e) {

            e.printStackTrace();
        }
    }
}
