package My_codingYAC;
//print the half pyramid from numbers
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
public class Printthehalfpyramidfrom_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
