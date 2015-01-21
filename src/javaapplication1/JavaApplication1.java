/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author sa24295
 */import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

Scanner key=new Scanner(System.in);
System.out.println("Enter your username");
String user=key.nextLine();
System.out.println("Enter your password");
String pass=key.nextLine();
System.out.println("Hello "+ user +", Welcome to CSC200 class! and Your password is "+ pass);
}
} // TODO code application logic here
   
    

