/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.invalidvariables;

/**
 *
 * @author 9page
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
