package My_codingYAC;

import java.util.Scanner;

//in this we will take input as an element and this element will be given output
public class Multidimensional_2D_Arrayeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		//declare your array
		int[][] numbers = new int[rows][columns];
		//nested loops will be using 
		//for input 
		//outer loop will control rows
		for(int i=0; i<rows; i++ ) {
			//inner loop will control columns
			for(int j =0; j<columns; j++) {
				//input lenge sc.next se aur usko store karwa denge numbers[i] [j]
		numbers[i][j] = sc.nextInt();
		//i=rows j=cols
			}
		}
		//output
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
