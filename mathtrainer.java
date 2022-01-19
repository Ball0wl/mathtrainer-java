package com.company;

import javax.swing.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class mathtrainer {
        public static void main(String[] args) {
            int rnd, rnd2, sum, erg;
            String erge="";


            rnd=(int)(Math.random()*100)+1;
            rnd2=(int)(Math.random()*100)+1;

            int operation=(int)(Math.random()*4)+1;
            switch(operation){
                case 1:
                    JOptionPane.showMessageDialog(null,rnd+"+"+rnd2);
                    System.out.println(rnd+"+"+rnd2);
                    erge = JOptionPane.showInputDialog(null,"Bitte gib das Ergebnis ein!");
                    erg = Integer.parseInt(erge);
                    sum = rnd+rnd2;
                    if(erg==sum){
                        System.out.println("Richtig! das Ergebnis ist "+sum);
                    }else{
                        System.out.println("Leider falsch! Das richtige Ergebnis ist "+sum);

                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,rnd+"-"+rnd2);
                    System.out.println(rnd+"-"+rnd2);
                    erge = JOptionPane.showInputDialog(null,"Bitte gib das Ergebnis ein!");
                    erg = Integer.parseInt(erge);
                    sum = rnd-rnd2;
                    if(erg==sum){
                        System.out.println("Richtig! das Ergebnis ist "+sum);
                    }else{
                        System.out.println("Leider falsch! Das richtige Ergebnis ist "+sum);

                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,rnd+"*"+rnd2);
                    System.out.println(rnd+"*"+rnd2);
                    erge = JOptionPane.showInputDialog(null,"Bitte gib das Ergebnis ein!");
                    erg = Integer.parseInt(erge);
                    sum=rnd*rnd2;
                    if(erg==sum){
                        System.out.println("Richtig! das Ergebnis ist "+sum);
                    }else{
                        System.out.println("Leider falsch! Das richtige Ergebnis ist "+sum);
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,rnd+"/"+rnd2+" nur ganze Zahlen ohne rest!");
                    System.out.println(rnd+"/"+rnd2+" nur ganze Zahlen ohne rest!");

                    erge = JOptionPane.showInputDialog(null,"Bitte gib das Ergebnis ein!");
                    erg = Integer.parseInt(erge);
                    sum=rnd/rnd2;
                    Math.round(sum);
                    if(erg==sum){
                        System.out.println("Richtig! das Ergebnis ist "+sum);
                    }else{
                        System.out.println("Leider falsch! Das richtige Ergebnis ist "+sum);
                    }
                    break;
                default:
                    break;

            }

        }




    }
