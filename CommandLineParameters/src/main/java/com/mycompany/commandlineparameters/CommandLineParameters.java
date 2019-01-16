package com.mycompany.commandlineparameters;

/**
 *
 * @author Arnel Gonzales Imperial
 * 16/1/2019
 */
public class CommandLineParameters {
    public static void main (String args[]){
        System.out.println("You gave " + args.length + " command line parameters.");
	System.out.println("Below are the given parameters:");
        for(int sample = 0; sample < args.length; sample++){
            System.out.println((sample + 1) + ". parameter: " + args[sample]);
        }
    }
}
