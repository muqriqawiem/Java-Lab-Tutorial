package WIA1002.DS.TitanBaru;

import java.util.Random;

public class NewMain {
    public static void main(String[] args) {
        DoublyLinkedList<TitanTag> CheckList = new DoublyLinkedList<TitanTag>();
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
            CheckList.addLast(ti);
        }
        System.out.print("\nSequence to be killed : ");
        // while(!CheckList.isEmpty())
        // System.out.println(CheckList.removeFirst().toString());
        while (!q.isEmpty()) {
            Integer r = q.poll();
            for (int i = 0; i < CheckList.size(); i++) {
                // Integer r =q.poll();
                if (r.equals(CheckList.show(i).getRisk())) {
                    System.out.print(CheckList.remove(i));
                    if (!CheckList.isEmpty())
                        System.out.print(" --> ");
                    else
                        System.out.println("");
                    // continue;
                }
            }
        }

        // while(!q.isEmpty())
        // System.out.println(q.poll());
    }
}
