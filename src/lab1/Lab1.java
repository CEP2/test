/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * Start to Lab 1
 * Initially rolling out tesst run in Netbeans IDE
 */

import java.util.Scanner;

public class Lab1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        String name;
        int age; 
        
        System.out.println("Hello World! \nI have returned1");
        System.out.println("Please, tell me your name!\n");
        System.out.print("Name: ");        
        name = in.nextLine();
        
        
        System.out.println("Awesome, now, what is your age?");
        System.out.print("Age: ");
        age = in.nextInt();
        
        System.out.println("Welcome" + name + "welcome to COMP 350!");
        
       
       
       
    }
    
}
