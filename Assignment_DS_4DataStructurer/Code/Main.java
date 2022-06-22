import SoldierArrangement.Characters;
import SoldierArrangement.DoublyLinkedList;
//import SoldierArrangement.Node;
import SoldierArrangement.SortList;
import Titan.NormalTitan;
//import Titan.PriorityQueue;
import Titan.Titan;
import Titan.TitanTag;
import ScoutingMissionInsideWall.ScoutingClass;
import BestPathToKillTitan.BestPathToKillTitan;
import MarleyWordConverter.CustomHashmap;
//import WallOfMaria.WeakestWallOfMaria;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
//import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        DoublyLinkedList<String> tmp = new DoublyLinkedList<String>();
        DoublyLinkedList<Characters> Allies = new DoublyLinkedList<>();
        SortList<Characters> Sort = new SortList<>();
        DoublyLinkedList<Characters> CheckList = new DoublyLinkedList<>();
        System.out.println();
        System.out.println("\033[3m- - - - - - - TOPIC D : WORLD OF TITAN - - - - - - -\033[0m");
        System.out.println("\n\n\033[3mWelcome\033[0m");
        System.out.println("\n\n\033[3mEntering the first part in...\033[0m");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3..");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2..");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1..");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        FileWriter out = new FileWriter("Eren's Allies.txt", true);
        PrintWriter outFile = new PrintWriter(out);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(
                    "\033[3m~ ~ ~ ~ ~ ~ ~ PART 1 : Eren's Allies, Soldier Arrangement & Grouping ~ ~ ~ ~ ~ ~ ~\033[0m\n");
            while (true) {
                System.out.println("\nDo you want to enter Eren's allies? [ yes / no ] ");
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
            System.out.println("\n\033[3m- - - - - - - - List Of Soldiers Available - - - - - - -\033[0m");
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
                    Characters character = new Characters(name, height, weight, strength, agility, intel, coor, lead);
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
                System.out.print("Do you want to sort attribute ? : ");
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
                System.out.print("Do you want to search for ability ? : ");
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

            System.out.println("\n\n~ ~ ~ ~ ~ ~ ~ END OF PART 1 ~ ~ ~ ~ ~ ~ ~");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n");

            System.out.println("\033[3mMoving to part 2.\033[0m\n\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Press [ Enter ] key to continue.");
            sc.nextLine();
            System.out.print("[ Enter ] key pressed. \n");
            System.out.println("\nMoving to the next part in...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(
                    "\n\n\033[3m- - - - - - - PART 2 : Titans Evaluation & Killing Priority - - - - - - -\033[0m");
            System.out.println("\n");

            DoublyLinkedList<TitanTag> CheckList2 = new DoublyLinkedList<>();
            NormalTitan a = new NormalTitan();
            Random t = new Random();
            int num = t.nextInt(10) + 1;
            System.out.println("Number of Titans: " + num);
            System.out.println();
            System.out.println("Generating " + num + " Titans ....");
            int risk = 0;
            java.util.PriorityQueue<Integer> q = new java.util.PriorityQueue<>();
            for (int d = 1; d <= num; d++) {
                Titan s = new Titan();
                String[] o = { "Normal Titan", "Abnormal Titan", "Nine Titan" };
                Random r = new Random();
                int randomNumber = r.nextInt(o.length);
                // to find normal Titan's risk with specific characteristic
                if (randomNumber == 0) {
                    if (a.Height() > 20) {// 3
                        if (a.WalkingLegs() == 4) {// 3
                            if (a.Speed() > 20) {// 3
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 15;// 3+3+3+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 13;// 3+3+3+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 14;// 3+3+3+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 12;// 3+3+3+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 3+3+3+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 3+3+3+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else if (a.Speed() > 10) {// 2
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 14;// 3+3+2+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 12;// 3+3+2+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 3+3+2+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 3+3+2+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 3+3+2+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 3+3+2+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else {// 1
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 3+3+1+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 3+3+1+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 3+3+1+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 3+3+1+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 3+3+1+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 3+3+1+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            }
                        } else if (a.WalkingLegs() == 2) {// 2
                            if (a.Speed() > 20) {// 3
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 14;// 3+2+3+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 12;// 3+2+3+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 3+2+3+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 3+2+3+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 3+2+3+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 3+2+3+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else if (a.Speed() > 10) {// 2
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 3+2+2+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 3+2+2+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 3+2+2+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 3+2+2+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 3+2+2+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 3+2+2+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else {// 1
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 3+2+1+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 3+2+1+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 3+2+1+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 3+2+1+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 3+2+1+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 3+2+1+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            }
                        } else {// 1
                            if (a.Speed() > 20) {// 3
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 3+1+3+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 3+1+3+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 3+1+3+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 3+1+3+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 3+1+3+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 3+1+3+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else if (a.Speed() > 10) {// 2
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 3+1+2+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 3+1+2+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 3+1+2+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 3+1+2+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 3+1+2+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 3+1+2+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else {// 1
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 3+1+1+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 3+1+1+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 3+1+1+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 3+1+1+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 3+1+1+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 3+1+1+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            }
                        }

                    } else if (a.Height() > 10) {// 2
                        if (a.WalkingLegs() == 4) {// 3
                            if (a.Speed() > 20) {// 3
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 14;// 2+3+3+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 12;// 2+3+3+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 2+3+3+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 2+3+3+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 2+3+3+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 2+3+3+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else if (a.Speed() > 10) {// 2
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 2+3+2+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 2+3+2+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 2+3+2+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 2+3+2+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 2+3+2+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 2+3+2+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else {// 1
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 2+3+1+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 2+3+1+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 2+3+1+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 2+3+1+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 2+3+1+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 2+3+1+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            }
                        } else if (a.WalkingLegs() == 2) {// 2
                            if (a.Speed() > 20) {// 3
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 2+2+3+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 2+2+3+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 2+2+3+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 2+2+3+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 2+2+3+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 2+2+3+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else if (a.Speed() > 10) {// 2
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 2+2+2+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 2+2+2+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 2+2+2+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 2+2+2+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 2+2+2+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 2+2+2+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else {// 1
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 2+2+1+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 2+2+1+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 2+2+1+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 2+2+1+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 2+2+1+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 2+2+1+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            }
                        } else {// 1
                            if (a.Speed() > 20) {// 3
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 2+1+3+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 2+1+3+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 2+1+3+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 2+1+3+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 2+1+3+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 2+1+3+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else if (a.Speed() > 10) {// 2
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 2+1+2+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 2+1+2+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 2+1+2+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 2+1+2+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 2+1+2+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 2+1+2+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else {// 1
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 2+1+1+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 2+1+1+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 2+1+1+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 2+1+1+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 8;// 2+1+1+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 6;// 2+1+1+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            }
                        }
                    } else {// 1
                        if (a.WalkingLegs() == 4) {// 3
                            if (a.Speed() > 20) {// 3
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 13;// 1+3+3+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 11;// 1+3+3+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 1+3+3+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 1+3+3+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 1+3+3+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 1+3+3+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else if (a.Speed() > 10) {// 2
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 1+3+2+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 1+3+2+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 1+3+2+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 1+3+2+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 1+3+2+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 1+3+2+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else {// 1
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 1+3+1+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 1+3+1+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 1+3+1+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 1+3+1+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 1+3+1+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 1+3+1+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            }
                        } else if (a.WalkingLegs() == 2) {// 2
                            if (a.Speed() > 20) {// 3
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 12;// 1+2+3+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 10;// 1+2+3+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 1+2+3+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 1+2+3+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 1+2+3+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 1+2+3+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else if (a.Speed() > 10) {// 2
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 1+2+2+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 1+2+2+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 1+2+2+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 1+2+2+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 1+2+2+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 1+2+2+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else {// 1
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 1+2+1+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 1+2+1+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 1+2+1+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 1+2+1+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 8;// 1+2+1+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 6;// 1+2+1+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            }
                        } else {// 1
                            if (a.Speed() > 20) {// 3
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 11;// 1+1+3+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 9;// 1+1+3+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 1+1+3+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 1+1+3+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 1+1+3+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 1+1+3+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else if (a.Speed() > 10) {// 2
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 10;// 1+1+2+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 8;// 1+1+2+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 1+1+2+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 1+1+2+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 8;// 1+1+2+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 6;// 1+1+2+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            } else {// 1
                                if ("Not repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 3
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 9;// 1+1+1+3+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 7;// 1+1+1+3+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else if ("Repeated pattern".equalsIgnoreCase(a.WalkingPattern())) {// 2
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 8;// 1+1+1+2+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 6;// 1+1+1+2+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                } else {// 1
                                    if ("Can climb".equalsIgnoreCase(a.ClimbingSkill())) {
                                        risk = 7;// 1+1+1+1+3
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    } else {
                                        risk = 5;// 1+1+1+1+1
                                        q.offer(risk);
                                        System.out.println("Titan " + d + ": Normal Titan (" + a.Height() + "m, "
                                                + a.WalkingLegs() + " legs, " + a.Speed() + "ms, " + a.WalkingPattern()
                                                + ", " + a.ClimbingSkill() + ") Risk " + risk);
                                    }
                                }
                            }
                        }
                    }

                } else if (randomNumber == 1) {
                    System.out.println("Titan " + d + ": Abnormal Titan Risk 15");
                    risk = 15;
                    q.offer(s.AbnormalTitan());
                } else {
                    Random k = new Random();
                    int i = k.nextInt(7);
                    s.NineTitan();
                    q.offer(s.NineTitan());
                    switch (i) {
                        case 0:
                            System.out.println("Titan " + d + ": Nine Titan (Beast Titan) Risk 19");
                            break;
                        case 1:
                            System.out.println("Titan " + d + ": Nine Titan (Jaw Titan) Risk 19");
                            break;
                        case 2:
                            System.out.println("Titan " + d + ": Nine Titan (Collosal Titan) Risk 19");
                            break;
                        case 3:
                            System.out.println("Titan " + d + ": Nine Titan (Armoured Titan) Risk 19");
                            break;
                        case 4:
                            System.out.println("Titan " + d + ": Nine Titan (War Hammer Titan) Risk 19");
                            break;
                        case 5:
                            System.out.println("Titan " + d + ": Nine Titan (Cart Titan) Risk 19");
                            break;
                        case 6:
                            System.out.println("Titan " + d + ": Nine Titan (Female Titan) Risk 19");
                            break;
                    }
                    risk = 19;
                }
                TitanTag ti = new TitanTag(d, risk);
                CheckList2.addLast(ti);
            }
            System.out.print("\nSequence to be killed : ");
            // while(!CheckList.isEmpty())
            // System.out.println(CheckList.removeFirst().toString());
            while (!q.isEmpty()) {
                Integer r = q.poll();
                for (int i = 0; i < CheckList2.size(); i++) {
                    // Integer r =q.poll();
                    if (r.equals(CheckList2.show(i).getRisk())) {
                        System.out.print(CheckList2.remove(i));
                        if (!CheckList2.isEmpty()) {
                            System.out.print(" --> ");
                        } else {
                            System.out.println("");
                        }
                        // continue;
                    }
                }
            }

            // while(!q.isEmpty())
            // System.out.println(q.poll());
            System.out.println("\n\n~ ~ ~ ~ ~ ~ ~ End Of Part 2 ~ ~ ~ ~ ~ ~ ~\n");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n");

            System.out.println("\033[3mMoving to part 3.\033[0m\n\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Press [ Enter ] key to continue.");
            sc.nextLine();
            System.out.print("[ Enter ] key pressed. \n");
            System.out.println("\nMoving to the next part in...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out
                    .println("\n\n\033[3m- - - - - - - PART 3 : Scouting Mission Inside The Wall - - - - - - -\033[0m");
            System.out.println("\n");

            System.out.print("Enter starting point : ");

            int startingPoint = sc.nextInt();

            ScoutingClass scoutClass = new ScoutingClass();

            int[][] paradisMap = {
                    { 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0 },
                    { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                    { 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                    { 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0 },
                    { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
                    { 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1 },
                    { 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0 },
                    { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                    { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                    { 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0 }
            };

            scoutClass.hamiltonianCycle(paradisMap, startingPoint);

            System.out.println("\n\n~ ~ ~ ~ ~ ~ ~ End Of Part 3 ~ ~ ~ ~ ~ ~ ~\n");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n");

            System.out.println("\033[3mMoving to part 4.\033[0m\n\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Press [ Enter ] key to continue.");
            sc.nextLine();
            System.out.print("[ Enter ] key pressed. \n");
            System.out.println("\nMoving to the next part in...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n\n\033[3m- - - - - - - PART 4 : Best Path To Kill Titan - - - - - - -\033[0m");
            System.out.println("\n");

            System.out.print("Enter location of Titan: ");
            int dest = sc.nextInt();

            int n = 16;

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }

            BestPathToKillTitan bestPath = new BestPathToKillTitan();

            bestPath.addEdge(adj, 0, 1);
            bestPath.addEdge(adj, 0, 5);
            bestPath.addEdge(adj, 0, 7);
            bestPath.addEdge(adj, 1, 2);
            bestPath.addEdge(adj, 1, 4);
            bestPath.addEdge(adj, 1, 6);
            bestPath.addEdge(adj, 2, 3);
            bestPath.addEdge(adj, 2, 11);
            bestPath.addEdge(adj, 2, 13);
            bestPath.addEdge(adj, 3, 10);
            bestPath.addEdge(adj, 4, 6);
            bestPath.addEdge(adj, 4, 10);
            bestPath.addEdge(adj, 5, 6);
            bestPath.addEdge(adj, 5, 7);
            bestPath.addEdge(adj, 5, 12);
            bestPath.addEdge(adj, 6, 8);
            bestPath.addEdge(adj, 6, 15);
            bestPath.addEdge(adj, 7, 9);
            bestPath.addEdge(adj, 8, 10);
            bestPath.addEdge(adj, 9, 12);
            bestPath.addEdge(adj, 9, 15);
            bestPath.addEdge(adj, 10, 14);
            bestPath.addEdge(adj, 11, 13);
            bestPath.addEdge(adj, 13, 14);
            bestPath.addEdge(adj, 14, 15);

            int src = 0;

            bestPath.print_paths(adj, n, src, dest);

            System.out.println("\n\n~ ~ ~ ~ ~ ~ ~ End Of Part 4 ~ ~ ~ ~ ~ ~ ~\n");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n");

            System.out.println("\033[3mMoving to part 5.\033[0m\n\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Press [ Enter ] key to continue.");
            sc.nextLine();
            System.out.print("[ Enter ] key pressed. \n");
            System.out.println("\nMoving to the next part in...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n\n\033[3m- - - - - - - PART 5 : Marley Word Converter - - - - - - -\033[0m");
            System.out.println("\n");

            System.out.print("Enter Marley sentence: \t");
            String marleysc = sc.next();

            String temp = " ";

            CustomHashmap<Character, Character> marley = new CustomHashmap<>();

            marley.put('a', 'j');
            marley.put('b', 'c');
            marley.put('c', 't');
            marley.put('d', 'a');
            marley.put('e', 'k');
            marley.put('f', 'z');
            marley.put('g', 's');
            marley.put('h', 'i');
            marley.put('i', 'w');
            marley.put('j', 'x');
            marley.put('k', 'o');
            marley.put('l', 'n');
            marley.put('m', 'g');
            marley.put('n', 'b');
            marley.put('o', 'f');
            marley.put('p', 'h');
            marley.put('q', 'l');
            marley.put('r', 'd');
            marley.put('s', 'e');
            marley.put('t', 'y');
            marley.put('u', 'm');
            marley.put('v', 'v');
            marley.put('w', 'u');
            marley.put('x', 'p');
            marley.put('y', 'q');
            marley.put('z', 'r');
            marley.put('$', ' ');
            marley.put(',', ',');
            marley.put('^', '^');
            marley.put(')', ')');
            marley.put('(', '(');
            for (int j = 0; j < marleysc.length(); j++) {
                char translated = marley.get(marleysc.charAt(j));
                temp += translated;
            }
            String jadi = marley.Caps(temp, temp.length());
            String out1 = marley.reverseParentheses(jadi, jadi.length());
            System.out.println();
            System.out.println(out1);

            System.out.println("\n\n~ ~ ~ ~ ~ ~ ~ End Of Part 5 ~ ~ ~ ~ ~ ~ ~\n");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n");

            System.out.println("\033[3mMoving to part 6.\033[0m\n\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Press [ Enter ] key to continue.");
            sc.nextLine();
            System.out.print("[ Enter ] key pressed. \n");
            System.out.println("\nMoving to the next part in...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2..");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1..");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\n\n\033[3m- - - - - - - PART 6 : Protecting Wall Of Maria - - - - - - -\033[0m");
            System.out.println("\n");

            System.out.println("\nWall of Maria has already been generated. ");
            System.out.println("\nScanning weakest part of Wall of Maria....\n");
            List<List<Integer>> layer = new ArrayList<>();
            List<Integer> brick1 = new ArrayList<>();
            List<Integer> brick2 = new ArrayList<>();
            List<Integer> brick3 = new ArrayList<>();
            List<Integer> brick4 = new ArrayList<>();
            ArrayList<Integer> arr = new ArrayList<>();
            brick1.add(3);
            brick1.add(6);
            brick1.add(9);
            layer.add(brick1);
            brick2.add(2);
            brick2.add(5);
            brick2.add(8);
            brick2.add(9);
            layer.add(brick2);
            brick3.add(1);
            brick3.add(4);
            brick3.add(10);
            layer.add(brick3);
            brick4.add(5);
            brick4.add(7);
            brick4.add(9);
            layer.add(brick4);
            arr = ConvertToOneList(layer);
            int test = mostFrequentArrayList(arr, arr.size());
            System.out.println("Weakest part of Wall of Maria is at position " + test + "\n");
            System.out.println("\n\n~ ~ ~ ~ ~ ~ ~ End Of Part 6 ~ ~ ~ ~ ~ ~ ~\n");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n");

            System.out.println("You have reached the end of the game.");
            System.out.println("Thank you for playing. :) \n\n");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Integer> ConvertToOneList(List<List<Integer>> data) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (!data.isEmpty()) {
            List<Integer> layer = new ArrayList<>();
            layer = data.get(0);
            data.remove(0);
            while (!layer.isEmpty()) {
                arr.add(layer.get(0));
                layer.remove(0);
            }
        }
        return arr;
    }

    public static int mostFrequentArrayList(ArrayList<Integer> arr, int n) {
        // Sort the array
        Collections.sort(arr);
        // find the max frequency using linear traversal
        Integer max_count = 1;
        Integer res = arr.get(0);
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (Objects.equals(arr.get(i), arr.get(i - 1))) {
                curr_count++;
            } else {
                curr_count = 1;
            }

            if (curr_count > max_count) {
                max_count = curr_count;
                res = arr.get(i - 1);
            }
        }
        return res;
    }
}
