/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs50;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Truth
 */
public class Mario
{
    void Mario (int termOrJoption)
    {
        int hight= 0;
    
        if (termOrJoption == 1)
        {
            do 
            {
                System.out.println("How high would you like the pyramid to be?");
            
                Scanner scanner = new Scanner(System.in);
                
                hight = scanner.nextInt();
            }
            while (hight < 0||hight > 23);
            
            for (int rowNumber =2; rowNumber<hight+2; rowNumber++)
            {
                for (int space =hight;space>=rowNumber; space--)
                {
                    System.out.print(" ");
                }
                
                for (int hashNumber=1; hashNumber<=rowNumber; hashNumber++)
                {
                    System.out.print("*");
                }
                System.out.println();
                }
            }
        if (termOrJoption == 2)
        {
            do 
            {   
                String hightEntered= JOptionPane.showInputDialog("How high would you like the pyramid to be?");
            
                hight=Integer.parseInt(hightEntered);
            }
            while (hight < 0||hight > 23);
            
            for (int rowNumber =2; rowNumber<hight+2; rowNumber++)
            {
                for (int space =hight;space>=rowNumber; space--)
                {
                    JOptionPane.showMessageDialog(null, " ");
                    // System.out.print(" ");
                }
                for (int hashNumber=1; hashNumber<=rowNumber; hashNumber++)
                {
                    JOptionPane.showMessageDialog(null, "*");
                    //  System.out.print("*");
                }
                System.out.println();
            }
        }
    } 
}
