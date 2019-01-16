package com.mycompany.reversenumbers;
import java.util.*;

/**
 *
 * @author Arnel Gonzales Imperial
 */
public class ReverseNumbers {
    public static void main (String[] args){
		int num, j = 0, t, c;
		
		Scanner number = new Scanner(System.in);
		System.out.print("How many floating point numbers do you want to type: ");
		num = number.nextInt();
		
		
		float [] n = new float [num];
		int arrayLength = n.length;
		
		for(int x = 0; x < arrayLength; x++){
			System.out.print("Type in " + (x+1) + ". number: ");
			n[x] = number.nextFloat();
			
		
			 
			
			
			
			
		}
		
		
		System.out.println("Given numbers in reverse order:");
		//System.out.println(Arrays.toString(n) + "\n");
		// Arrays.stream(n).forEach(System.out::println);
		 

            //System.out.println( Arrays.toString( n ).replace("[", "").replace("]", ""));
		
		//for(float element : n){
			
			//System.out.println(element);
			
			
		//}
		
		for(int i = arrayLength -1; i >= 0; i--){
			
			System.out.println(n[i]);
		}
		
		
		
		
		
	
	
	}
    
}
