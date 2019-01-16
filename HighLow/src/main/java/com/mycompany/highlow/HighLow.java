package com.mycompany.highlow;
import java.util.Scanner;

/**
 *
 * @author Arnel Imperial
 * 16/1/2019
 */
public class HighLow {
     public static void main(String[] args) {
       int number1, number2, number3, high, low;
        Scanner reader = new Scanner(System.in);
 
        System.out.print("Type in the first integer: ");
        number1 = reader.nextInt();
 
        System.out.print("Type in the second integer: ");
        number2 = reader.nextInt();
 
        System.out.print("Type in the third integer: ");
        number3 = reader.nextInt();
 
        high = high(number1, number2, number3);
        low = low(number1, number2, number3);
 
        System.out.print("Highest number was " + high);
        System.out.print(" and the lowest was" + low + "\n");
    }
    
    
    public static int high(int num1, int num2, int num3){
		int h = 0;
		if(num1 > num2 && num1 > num3){
			h = num1;
		}else if(num2 > num1 && num2 > num3){
			
			h = num2;
		}else if(num3 > num1 && num3 > num2){
			
			h = num3;
		}else{
			h = num1;
		}
		
		return h;
			
		
	}
	
	public static int low(int num4, int num5, int num6){
		int l = 0;
		if(num4 < num5 && num4 < num6){
			l = num4;
		}else if(num5 < num4 && num5 < num6){
			
			l = num5;
		}else if(num6 < num4 && num6 < num5){
			l = num6;
		}else{
			l = num4;
		}
		
		
		
		
		
	return l;	
	}
	
    
}
