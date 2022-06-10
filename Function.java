package My_codingYAC;

import java.util.Scanner;

//print a given name in a function 
public class Function {
    public static void printMyName(String name) {
    	System.out.println(name);
    	return;
    }// function ko declare kiya 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		printMyName(name); //function ko call kiya
		

	}

}
