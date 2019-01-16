package com.mycompany.workhourcalculator;
import java.util.*;
import java.text.DecimalFormat;


/**
 *
 * @author Arnel G. Imperial
 * 16/1/2019
 */
public class WorkHourCalculator {
    public static void main(String [] args){
		int input;
		float hour = 0, sum = 0;
	
		float average;
		
		Scanner num = new Scanner(System.in);
		System.out.print("Amount of days: ");
		input = num.nextInt();
		
		float [] time = new float [input];
		
		for(int i = 0; i < time.length; i++){
			System.out.print("Type in work hours of day " + (i + 1) + ": ");
			
			time[i] = num.nextFloat();
			
			sum += time[i];
			}
			
		System.out.println(" ");
		System.out.print("Total of work hours: " + sum);
		System.out.println(" ");
		average = sum/input;
		System.out.print("average work day length: " + (String.format(Locale.US, "%.1f", average)));
		System.out.println(" ");
		
		System.out.print("Inputted work hours: " + Arrays.toString(time).replace("[", " ").replace("]", " ").replace(",", " "));
			
	
	}
		
    
}
