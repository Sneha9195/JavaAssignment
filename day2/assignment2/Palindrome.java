package week1.day2.assignment2;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Palindrome {
	public static void main(String[] args) {
		int num = 34343;
		int n=num;
		int temp1=0;
		for (num=34343; num!=0; num=num/10) {
			int temp=num%10;
			temp1=(temp1*10)+temp;
			
		}
		if (temp1==n) {
			System.out.println(" The number is palindrome");
			
		}
		else {
			System.out.println("The number is not palindrome");
		}
	}
}
		