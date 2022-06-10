package My_codingYAC;

import java.util.Scanner;

public class Printtableofn_inputbytheuser_for_loop {
//n=2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for( int i =1; i<11; i++) {
			System.out.println(i*n);
		}
	}

}
