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
            }
            else if (c.equals(cc))
            {
                System.out.println("Great choice Canada has many schools with varsity baseball teams.\nWould you like to see a list from your province?");
                String s = scan.nextLine();
                s = s.toUpperCase();
                String no = new String("NO");
                String yes = new String("YES");
                if (s.equals(yes) && n.equals(y))
                {
                    System.out.println("Some example are:\nUofG\nUniversity of Waterloo\nUofT\nLaurier\nBrock\nWestern\nQueens\nMcMaster");
                }
                else
                {
                    System.out.println("Sorry this program only has examples of Universities in Ontario");
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
