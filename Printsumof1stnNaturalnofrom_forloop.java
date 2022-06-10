package My_codingYAC;

import java.util.Scanner;

public class Printsumof1stnNaturalnofrom_forloop {
//n=4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum =0;
		for(int i=0; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}

