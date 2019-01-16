/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.salarycalculation;
import java.util.Scanner;

/*
 *
 * @author Arnel Imperial
 */
public class SalaryCalculation {
     public static void main(String[] args) {
      
        String a = "Type in the amount of work hours: ";
        String b = "Type in the salary per hour: ";
        String c = "Type in the tax percent: ";
        String d = "Salary before taxes: ";
        String e = "Amount of tax: ";
        String f = "Salary after taxes: ";
      
        Scanner entry = new Scanner(System.in);
        System.out.print(a);
        double workingHours = entry.nextDouble();
        System.out.print(b);
        double salaryperHour = entry.nextDouble();
        System.out.print(c);
        double taxpercentage= entry.nextDouble();
        
        double salaryb4tax = workingHours * salaryperHour;
        System.out.println(d + salaryb4tax);
       
        double tax = workingHours * salaryperHour * (taxpercentage/100);
        System.out.println(e + tax);
         
        double wage = salaryb4tax - tax;
        System.out.println(f + wage);
                
    }
    
}
