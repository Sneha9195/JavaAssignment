package week1.day1.assignment1;

import org.apache.commons.math3.analysis.function.Divide;

public class Calculator {
     public void addTwoNumbers() {
    	 int a = 10;
    	 int b = 20;
    	 System.out.println(a+b);
	
}
   public int addThreeNumbers(int a, int b, int c) {
      return (a+b+c);
   }
   public void mul() {
	int a = 10;
	int b = 20;
	System.out.println(a*b);

}
   public double mulNext(int a, double b) {
	   return (a*b);
	   
}
   public void sub() {
	int a = 20;
	int b = 10;
	System.out.println(a-b);

}
   public double subNext(double a, double b) {
	   return (a-b);
	   
}
   public void divide() {
	 int a = 20;
	 int b = 5;
	 System.out.println(a/b);
	
} 
   public double divideNext(double a, int b) {
	   return (a/b);
	

}
public static void main(String[] args) {
	Calculator cl= new Calculator();
	cl.addTwoNumbers();
	cl.mul();
	cl.sub();
	cl.divide();
	int result = cl.addThreeNumbers(10, 20, 30);
	System.out.println(result);
	double resultone = cl.mulNext(10, 2000.562);
	System.out.println(resultone);
	double resulttwo = cl.subNext(3000.256, 2000.562);
	System.out.println(resulttwo);
	double resultdivide = cl.divideNext(1000.256, 20);
	System.out.println(resultdivide);
	
}
}
