package week1.day2.assignment2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,6,7,8};
		
		Arrays.sort(num);
	for (int i =num[0]; i <= num.length; i++) {
		if (num[i-1]!=i) {
			System.out.println("The missing number is "+ i);
			break;
			
		}
		else  {
			
			continue;
		}
		
	}
		
	}

}
