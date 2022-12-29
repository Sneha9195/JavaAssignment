package week1.day2.assignment2;

import java.util.Iterator;

public class Intersection {
public static void main(String[] args) {
	int arri[] = {11,12,13,14,15,16,17};
	int arrj[] = {10,18,12,19,20,17,14};
	int length1 = arri.length;
	int length2 = arrj.length;
	System.out.println("The length of the array i is " +length1);
	System.out.println("The lenth of the array J is "+length2);
	System.out.println("intersection of two array is: ");
	for (int i = 0; i < arrj.length; i++) {
	for (int j = 0; j < arrj.length; j++) {
		
	if (arri[i]==arrj[j]) {
		System.out.println(arrj[j]);
			
		}
		
	}
}
 
}}
