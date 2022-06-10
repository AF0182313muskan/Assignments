package My_codingYAC;

import java.util.Scanner;

//make a function to add 2 two numbers and return the sum
public class Function_add2no {
	public static int calculateSum(int a, int b) {
		int sum = a+b;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//function ko call krenge
		int sum = calculateSum(a,b);
		System.out.println("Sum of 2 number is : " + sum);
	}

}
