/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyouownadventure1;

import java.util.Scanner;
 /*
 * @author brabb5577
 */
public class ChooseYouOwnAdventure1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to choose your baseball path!");
        System.out.println("What province are you from?");
        String n = scan.nextLine();
        n = n.toUpperCase();
        String y = new String("ONTARIO");
        String yy = new String("QUEBEC");
        String yyy = new String("BRITISH COLOMBIA");
        String yyyy = new String("BC");
        String yyyyy = new String("B.C.");
        if (n.equals(y)|| n.equals(yy) || n.equals(yyy) || n.equals(yyyy)|| n.equals(yyyyy))
        {
            System.out.println("Where do you plan to go to post secondary (Country):");
            String c = scan.nextLine();
            c = c.toUpperCase();
            String q = new String("USA");
            String qq = new String("UNITED STATES OF AMERICA"); 
            String cc = new String("CANADA");
            if (c.equals(q) || c.equals(qq))
            {
                System.out.println("What level of school would you like to go to (D1,D2,D3)");
                String a = scan.nextLine();
                a = a.toUpperCase();
                if (a.equals("D1"))
                {
                    System.out.println("Great choice D1 is an excelent way to make it to the show");
                }
                else if (a.equals("D2"))
                {
                    System.out.println("Good choice when you play D2 you can still move up to D1 and is an excellnt place to play baseball.");
                }
                else
                {
                    System.out.println("D3 is good baseball.");
                }
               
            }
            else if (c.equals(cc))
            {
                System.out.println("Great choice Canada has many schools with varsity baseball teams.\nWould you like to see a list from your province of " + n + "?");
                String s = scan.nextLine();
                s = s.toUpperCase();
                String no = new String("NO");
                String yes = new String("YES");
                if (s.equals(yes) && n.equals(y))
                {
                    System.out.println("Some example are:\nUofG\nUniversity of Waterloo\nUofT\nLaurier\nBrock\nWestern\nQueens\nMcMaster");
                }
                else if (n.equals(yes) && q.equals(yy))
                {
                    System.out.println("Some examples of Universities with baseball teams are: \nMcGill\nUniversity of Montreal");
                }
                else if (n.equals(yes) && (q.equals(yyy) || q.equals(yyyy)))
                {
                 System.out.println("Some examples of Universities with baseball teams are: \nSimon Fraser\nUBC");   
                }
                else
                {
                    System.out.println("Ok, thank you for using this program!");
                }
            }
            else
                {
                    System.out.println("Sorry this is only for Canada and USA");
                }
        }
        else
        {
            System.out.println("Sorry this program is only for those in Ontario,BC,or Quebec");
        }
    }
    
}
