package week1.day2.assignment2;

import java.util.Arrays;

public class SecondSmallestNumber {
	public static void main(String[] args) {
		int[] secondSmall = {23,45,67,32,89,22,};
		int length = secondSmall.length;
		Arrays.sort(secondSmall);
		System.out.println("The length of the array is "+ length);
        
        		System.out.println(secondSmall[1] + " is the second smallest number");
				
			}
			
		
	}


