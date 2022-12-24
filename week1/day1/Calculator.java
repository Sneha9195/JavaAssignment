package week1.day1;

public class Calculator {

	public void sub() {
		int a = 10;
		int b = 5;
		System.out.println(a-b);
		// TODO Auto-generated method stub

	}
	public int mul(int a,int b) {
		return a*b;
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Calculator cl = new Calculator();
		cl.sub();
		int result = cl.mul(5, 5);
		System.out.println(result);
	}
}
