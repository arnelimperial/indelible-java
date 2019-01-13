
package com.mycompany.invalidvariables;

/**
 *
 * @author Arnel Gonzales Imperial
 */
public class InvalidVariables {
    public static void main(String [] args){
        int number = 2;
        number = (int)number;
        String truth = "true";
        String character = "A";
        String string = "This is a character string";
        System.out.println("Integer: " + number);
        System.out.println("Truth: " + truth);
        System.out.println("Character: " + character);
        System.out.println("Character string: " + string);
    }
    
}
