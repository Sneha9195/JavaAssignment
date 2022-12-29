package week1.day2.assignment2;

import org.testng.annotations.IFactoryAnnotation;

public class PostiveOrNegativeNumber {
	public static void main(String[] args) {
		
		int number=35;
		if (number>0) {
			System.out.println(number+ " The number is positive number");
			
		}
		if(number<0) {
			System.out.println(number+ " The number is negative number");
		}
		else {
			if(number==0)
			System.out.println("The number is neither postive or Negative Number");
		}
		
	}

}
