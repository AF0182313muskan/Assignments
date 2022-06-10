package My_codingYAC;

import java.util.Scanner;

//Take an array as input from the user 
//search for a given number x and print the index
//(i) at which it occurs
public class Arrays_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int number[] = new int[size];
		
		//input
		for(int i=0; i<size; i++) {
			number[i] = sc.nextInt();
		}
		//search for x
		int x = sc.nextInt();
		//output
		for (int i=0; i<number.length; i++) 
			{ if(number[i] == x) {
				System.out.println("x found at index : " +i);
						
			}
		
	}

	}
}
