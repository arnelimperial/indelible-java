package com.mycompany.initarays;

/**
 *
 * @author Arnel Gonzales Imperial
 * 16/1/2019
 */
public class InitArays {
     public static void main(String[] args) {
       
         int [] numberArray= {4,7,8,2,8,3,7,1};
		
		String [] nameArray;
		nameArray = new String [4];
		nameArray [0] = "May";
		nameArray [1] = "Peggy";
		nameArray [2] = "Tina";
		nameArray [3] = "Sue";
		
		
		int matrix [] [] = {
			
			{2},
			{4,6},
			{8,10,12},
			{14, 16},
			{18}
			
		};
		 
		System.out.print("Number in array: ");

 
        System.out.print("Numbers in array: ");
        for(int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");    
        }
     
        System.out.print("\n\nNames in array: ");
         for (String nameArray1 : nameArray) {
             System.out.print(nameArray1 + " ");
         }
 
        System.out.println("\n\nMatrix elements: ");
         for (int[] matrix1 : matrix) {
             for (int j = 0; j < matrix1.length; j++) {
                 System.out.print(matrix1[j] + " ");
             }
             System.out.println("\t");
         }
    }    
    
}
