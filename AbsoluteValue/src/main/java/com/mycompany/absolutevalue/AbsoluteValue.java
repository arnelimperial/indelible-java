package com.mycompany.absolutevalue;
import java.util.Scanner;

/**
 *
 * @author Arnel Imperial
 * 16/1/2019
 */
public class AbsoluteValue {
    
    public static void main(String[] args) {
        Scanner absoluteVal = new Scanner (System.in);
        String numEntry = "Type in a floating point number: ";
        System.out.print(numEntry);
        double data = absoluteVal.nextDouble();
        double data1 = data;
        double data2 = -data;
                
        String evaluate = "The absolute value of the given number is ";
        
       
  
        double absoluteResult = data > data2 ? data1 : data2;
        System.out.println(evaluate + absoluteResult);
    
       
    }
    
}
