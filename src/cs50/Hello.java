/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs50;

import javax.swing.JOptionPane;

/**
 *
 * @author Truth
 */
public class Hello
{
  void Hello(int termOrJoption)
    {
        if (termOrJoption == 1)
        {
            System.out.println("hello, world");   
        }
        if (termOrJoption == 2)
        {
            JOptionPane.showMessageDialog(null, "hello, world");
        }
    }  
}
