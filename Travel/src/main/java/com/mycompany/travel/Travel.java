package com.mycompany.travel;
import java.util.Scanner;

/**
 *
 * @author Arnel Imperial
 */
public class Travel {
     public static void main(String args[]) {
        double speed, distance, time;
 
        distance = askDistance();
        speed = askSpeed();
        time = countTime(distance, speed);
 
        System.out.println("Time needed to complete the trip is " + time + " hours.");
    }
     
     static Scanner journey = new Scanner (System.in);
	
	public static double askDistance(){
		double dis;
		System.out.print("Type in the length of the trip (km): ");
		dis = journey.nextDouble();
		return dis;
		
		
	}
	
	public static double askSpeed(){
		double speed1;
		System.out.print("Type in your average speed (km/h): ");
		speed1 = journey.nextDouble();
		return speed1;
		
		
		
	}
	
	public static double countTime(double param1, double param2){
		
		return param1/param2;
	}
 
    
}
