/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs50;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author Truth
 */
public class Gready
{
    void Gready()
    {   
        System.out.println("how much");
        
        Scanner change = new Scanner(System.in);
        
        double changeConverted = change.nextDouble()*100;
        
        double quater =  changeConverted/25;
        System.out.println("Quarters "+ (int)quater);
        
        double quartertRemainder = changeConverted%25;
        double dime = quartertRemainder/10;
        System.out.println("Dime "+ (int)dime);
        
        double dimeRemainder = quartertRemainder%10;
        double nickel = (dimeRemainder);
        System.out.println("Nickel "+(int)nickel/5);
        
        double penny = nickel%5;
        System.out.println("Penny "+ (int)penny );
        
        if ((penny/5)<0)
        
        
        
        
    } 
}
