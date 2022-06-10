package My_codingYAC;

import java.util.Scanner;

public class Function_Factorialofno_ {
	public static void printFactorial(int n) {
	//for loop
		if(n<0) {
			System.out.println("Invalid number");
			return;
		}
	int factorial =1;
	for (int i=n; i>=1; i--) {
		factorial = factorial * i;
	}
	System.out.println(factorial);
	return;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //no le liya input
		
		printFactorial(n); //function ko call kiya

	}

}
