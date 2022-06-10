package My_codingYAC;
//print the pattern inverted half pyramid with no.
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1 
public class Printthe_Invertedhalfpyramid_withnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//outer loop
		for(int i=1; i<=5; i++)
		{
			//inner loop
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
