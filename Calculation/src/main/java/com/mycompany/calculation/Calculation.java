package com.mycompany.calculation;
import java.util.Scanner;
/**
 *
 * @author Arnel Imperial
 * 16/1/2019
 */
public class Calculation {
    public static void main (String [] args){
		try(Scanner calculate = new Scanner(System.in)){
			int result, operator;
		
			String q1 = "Type in the first number: ";
			String q2 = "Type in the second number: ";
			
		
			System.out.println("Choose from the following calculations:" + "\n");
			System.out.println("1: subtraction");
			System.out.println("2: addition");
			System.out.println("3: multiplication");
			System.out.println("4: division");
			System.out.println("5: remainder" + "\n");
	
			System.out.print("Make your choice: " + "\n");
			operator = calculate.nextInt();
			
			switch(operator){
				case 1:
				    System.out.print(q1);
					int num1 = calculate.nextInt();
					System.out.print(q2);
					int num2 = calculate.nextInt();
					result = num1 - num2;
					System.out.println("\n" + num1 + "-" + num2 + "=" + result);
					break;
				
				case 2:
					System.out.print(q1);
					int num3 = calculate.nextInt();
					System.out.print(q2);
					int num4 = calculate.nextInt();
					result = num3 + num4;
					System.out.println("\n" + num3 + "+" + num4 + "=" + result);
					break;
				
				case 3:
					System.out.print(q1);
					int num5 = calculate.nextInt();
					System.out.print(q2);
					int num6 = calculate.nextInt();
					result = num5 * num6;
					System.out.println("\n" + num5 + "*" + num6 + "=" + result);
					break;
				
				case 4:
					System.out.print(q1);
					int num7, num8;
				    num7 = calculate.nextInt();
				    System.out.print(q2);
					num8 = calculate.nextInt();
					Double quotient;
				
					
				    Double number11 = Double.valueOf(num7);
					Double number12 = Double.valueOf(num8);
				
					quotient = number11/number12;
				
					System.out.println("\n" + num7 + " / " + num8 + "=" + quotient);
					break;
				
				case 5:
					System.out.print(q1);
					int num9 = calculate.nextInt();
					System.out.print(q2);
					int num10 = calculate.nextInt();
					int modulo;
					modulo = num9 % num10;
					System.out.println("\n" +num9 + "%" + num10 + "=" + modulo);
					break;
				default:
					System.out.println("\n" + "Invalid choice.");
					break;
					
				
		
				
			}
			
	
			
		}catch(Exception e){
			System.out.println(e);
			
		}

		
	}
    
}
