package My_codingYAC;
//print the pattern (0_-1) triangle
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
public class Printthe_0_1_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			for(int j=1; j<=i; j++) {
				int sum = i+j;
				if(sum % 2 == 0) {
					System.out.print("1 "); //even
				}else {
					System.out.print("0 "); //odd
				}
					
			}
			System.out.println();
		}

	}

}
