package My_codingYAC;

import java.util.Scanner;

public class Array_takeinputfrom_user {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we have declared only size 
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int number[] = new int[size];
		//now we will put elements inside the array 
		
		
		//input
		for(int i=0; i<size; i++) {
			number[i] = sc.nextInt();
		}
		
		
		//output
		for(int i=0; i<size; i++) {
			System.out.println(number[i]);
		}
		

	}

}
