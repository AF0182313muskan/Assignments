package My_codingYAC;

public class Arrays_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[3];
		marks[0] = 97; //phy
		marks[1] = 98; // chm
		marks[2] = 95; // eng
		//System.out.println(marks[0]);
		//System.out.println(marks[1]);
		//System.out.println(marks[2]);
		//but if we have 100no of size so we 
		//cannot type syso for 100times
		//so we will be using for loop condition
		
		for ( int i=0; i<3; i++)
		{
		System.out.println(marks[i]);
		}
		
		

	}

}
