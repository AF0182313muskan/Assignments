package My_codingYAC;

import java.util.Scanner;

public class Function_multiply2no {
	public static int calculateProduct(int a , int b) {
		int multiply = a*b;
		return multiply;
		//or we can directly write as return a*b; instead of using int variable 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//function ko call krenge
		int multiply = calculateProduct(a,b);
		System.out.println("product of 2 numbers is : " + multiply);

	}

}
