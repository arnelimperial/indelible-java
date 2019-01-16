
package com.mycompany.average;
import java.util.Scanner;

/**
 *
 * @author Arnel Imperial
 * 16/1/2019
 */
public class Average {
    public static void main (String[] args){
		try(Scanner result = new Scanner(System.in)){
			System.out.println("Program calculates the average of inputted grades.");
			System.out.println("Finish with a negative integer." + "\n");
			Double grades;
			System.out.print("Input a grade (4-10): ");
			
		
			grades = result.nextDouble();
			
			Double tag =0.0000, sum =0.0000;
			
			if(grades >=4 && grades <=10){
				sum += grades;
				tag++;
				
			}else if(grades <=3 && grades >=0){
				
				System.out.println("Invalid grade!");
			}else if(grades >=11){
				
				System.out.println("Invalid grade!");
			}else{
				System.out.println("You did not input any grades.");
			}
			
			
			while(grades >=0){
				
				System.out.print("Input a grade (4-10): ");
				grades = result.nextDouble();
				
				if(grades >=4 && grades <=10){
					
					sum+= grades;
					tag++;
				}else if(grades <=3 && grades >=0){
					System.out.println("Invalid grade!");
				}else if(grades >= 11){
					
					System.out.println("Invalid grade!");
				}else if (grades <= -1){
					
					double average;
					average = sum/tag;
					if(average> 0){
						
					Integer x = tag.intValue();
					
					System.out.println(x + " grades inputted.");
					System.out.println("Average of the grades: " + average);
					}else{
						System.out.println("You did not input any grades.");
						
						
					}
					
				}
				
				
				
				
			}
			
			
			
			
			
		}catch(Exception e){
			System.out.println(e);
			
		}
		
		
		
	}
}
