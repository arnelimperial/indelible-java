package com.mycompany.handlingmatrices;
import java.util.*;
/**
 *
 * @author Arnel Gonzales Imperial
 */
public class HandlingMatrices {
    public static void main(String[] args) {
        int rows, columns;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();

        int matrix [][];

        matrix = askInfo(rows, columns);
        printMatrix(matrix);
        countSum(matrix);
    }
    
    
    
	public static int[][] askInfo(int rows, int columns){
		
		Scanner number = new Scanner(System.in);
		int [] [] matrix = new int [rows] [columns];
		
		for(int x = 0; x< matrix.length; x++){
			for(int y= 0; y< matrix[0].length; y++){
				System.out.print("Type in the element " + (y+1) + " of the row " + (x+1) + ": ");
				matrix[x][y] = number.nextInt();
				
			}
			
		}
		return matrix;
		
	}
	
	public static int [] [] printMatrix(int [] [] matrix){
		System.out.print("\nMatrix:");
		
		for(int [] row : matrix){
			System.out.print("\t");
			System.out.print("\n");
			for(int sample : row){
				System.out.print(sample + " " + " " + " ");
				
				
			}
			
			
		}
		return matrix;
		
		
	}
	
	public static int [][] countSum(int [][] matrices){
		int sum = 0;
        for (int[] matrice : matrices) {
            for (int j = 0; j< matrices[0].length; j++) {
                sum += matrice[j];
            }
        }
		
		System.out.println("\n");
		System.out.print("Sum of the elements of the matrix: " + sum);
		return matrices;
		
	}
	

    
}
