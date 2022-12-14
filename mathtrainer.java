package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class mathtrainer {
    public static void main(String[] args) {
        int rnd, rnd2, sum, erg, punkte;
        int highscore = 0;
        String erge = "";
        boolean gameOn = true;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(highscore));

        punkte = 0;

        while (gameOn) {
            rnd = (int) (Math.random() * 100) + 1;
            rnd2 = (int) (Math.random() * 100) + 1;


            int operation = (int) (Math.random() * 4) + 1;
            switch (operation) {
                case 1:
                    JOptionPane.showMessageDialog(null, rnd + "+" + rnd2);
                    System.out.println(rnd + "+" + rnd2);
                    erge = JOptionPane.showInputDialog(null, "Bitte gib das Ergebnis ein!");
                    erg = Integer.parseInt(erge);
                    sum = rnd + rnd2;
                    if (erg == sum) {
                        System.out.println("Richtig! das Ergebnis ist " + sum);
                        punkte +=1;
                        System.out.println("Punkte:" + punkte);
                    } else {
                        System.out.println("Leider falsch! Das richtige Ergebnis ist " + sum);
                        arr.add(punkte);
                        Collections.sort(arr,Collections.reverseOrder());
                        System.out.println("Highscore:"+arr);
                        punkte=0;
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, rnd + "-" + rnd2);
                    System.out.println(rnd + "-" + rnd2);
                    erge = JOptionPane.showInputDialog(null, "Bitte gib das Ergebnis ein!");
                    erg = Integer.parseInt(erge);
                    sum = rnd - rnd2;
                    if (erg == sum) {
                        System.out.println("Richtig! das Ergebnis ist " + sum);
                        punkte +=1;
                        System.out.println("Punkte:" + punkte);
                        System.out.println("Highscore:"+arr);
                    } else {
                        System.out.println("Leider falsch! Das richtige Ergebnis ist " + sum);
                        arr.add(punkte);
                        Collections.sort(arr,Collections.reverseOrder());
                        System.out.println("Highscore:"+arr);
                        punkte=0;
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, rnd + "*" + rnd2);
                    System.out.println(rnd + "*" + rnd2);
                    erge = JOptionPane.showInputDialog(null, "Bitte gib das Ergebnis ein!");
                    erg = Integer.parseInt(erge);
                    sum = rnd * rnd2;
                    if (erg == sum) {
                        System.out.println("Richtig! das Ergebnis ist " + sum);
                        punkte +=1;
                        System.out.println("Punkte:" + punkte);
                    } else {
                        System.out.println("Leider falsch! Das richtige Ergebnis ist " + sum);
                        arr.add(punkte);
                        Collections.sort(arr,Collections.reverseOrder());
                        System.out.println("Highscore:"+arr);
                        punkte=0;
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, rnd + "/" + rnd2 + " nur ganze Zahlen ohne rest!");
                    System.out.println(rnd + "/" + rnd2 + " nur ganze Zahlen ohne rest!");

                    erge = JOptionPane.showInputDialog(null, "Bitte gib das Ergebnis ein!");
                    erg = Integer.parseInt(erge);
                    sum = rnd / rnd2;
                    Math.round(sum);
                    if (erg == sum) {
                        System.out.println("Richtig! das Ergebnis ist " + sum);
                        punkte +=1;
                        System.out.println("Punkte:" + punkte);
                    } else {
                        System.out.println("Leider falsch! Das richtige Ergebnis ist " + sum);
                        arr.add(punkte);
                        Collections.sort(arr,Collections.reverseOrder());
                        System.out.println("Highscore:"+arr);
                        punkte=0;
                    }
                    break;
                default:
                    break;
            }

        }
    }



}