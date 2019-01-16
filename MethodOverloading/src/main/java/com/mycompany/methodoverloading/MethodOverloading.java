package com.mycompany.methodoverloading;
import java.util.Scanner;
/**
 *
 * @author Arnel Imperial
 * 16/1/2019
 */
public class MethodOverloading {
    public static void main(String[] args) {
        String firstName, secondName;
        Scanner reader = new Scanner(System.in);
 
        System.out.print("Type in the first name: ");
        firstName = reader.nextLine();
 
        System.out.print("Type in the second name: ");
        secondName = reader.nextLine();            
 
        System.out.println("\n**********");
        greet();
        System.out.println("**********");
 
        greet(firstName);
        System.out.println("**********");
 
        greet(firstName, secondName);
        System.out.println("**********");
    }
    
    public static void greet(){
		System.out.println("Hi!");
	}
	
	public static void greet(String name){
		System.out.println("Hi, "+ name);
		
	}
	
	public static void greet(String name1, String name2){
		
		System.out.println("Hi, " + name1 + " and " + name2);
	}
   
    
}
