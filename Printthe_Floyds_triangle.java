package My_codingYAC;
//print the pattern floyd's triangle
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

public class Printthe_Floyds_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		int number =1;
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			for(int j=1; j<=i; j++) {
				System.out.print(number+" "); //+space""
			number++; //number = number + 1
		
		}
			System.out.println();
		
	}

}
}
