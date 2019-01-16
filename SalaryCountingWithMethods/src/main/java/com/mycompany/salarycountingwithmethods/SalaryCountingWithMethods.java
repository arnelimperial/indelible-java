package com.mycompany.salarycountingwithmethods;
import java.util.Scanner;

/**
 *
 * @author Arnel Imperial
 * 16/1/2019
 */
public class SalaryCountingWithMethods {
    public static void main (String [] args) {
        double hours, salaryPerHour, taxPercent, taxlessSalary, taxPart;
 
        hours =  askHours();
        salaryPerHour = askSalaryPerHour();
        taxPercent = askTaxPercent();
        
        taxlessSalary = countTaxlessSalary(hours, salaryPerHour);
 
        taxPart = taxlessSalary * taxPercent /100;
 
        System.out.println("\nSalary before taxes: " + taxlessSalary);
        System.out.println("Tax part of the salary: " + taxPart);
        System.out.println("Salary after taxes: " + (taxlessSalary-taxPart));        
    }
    
    
    static Scanner reader = new Scanner(System.in);
	
	public static double askHours(){
		double hour;
		System.out.print("Type in the number of work hours: ");
		
		hour = reader.nextDouble();
		return hour;
	}
	
	public static double askSalaryPerHour(){
		double wage;
		System.out.print("Type in salary per hour: ");
		wage = reader.nextDouble();
		return wage;
		
		
	}
	
	public static double askTaxPercent(){
		
		double tax;
		System.out.print("Type in tax percent: ");
		tax = reader.nextDouble();
		return tax;
		
		
		
	}
	
	public static double countTaxlessSalary(double param1, double param2){
		
		
		return param1 * param2;
		
	}
	
}
