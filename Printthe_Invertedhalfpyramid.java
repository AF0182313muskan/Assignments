package My_codingYAC;
//print the inverted half pyramid
//****
//***
//**
//*
public class Printthe_Invertedhalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		//outer loop
		for (int i=n; i>=1; i-- ) {
			//inner loop
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();

		}
		
	}

}
