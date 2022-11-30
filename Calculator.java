package Sanjay;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calculator hey = new Calculator();
		hey.pratice();

	}
	public void pratice() {
		Scanner getInput = new Scanner(System.in);
		int strInput = getInput.nextInt();
		int strInput2 = getInput.nextInt();
		char sym = getInput.next().charAt(0);
			
			switch(sym){
			
			case '+' :
				System.out.println(strInput+strInput2);
				break;
			case '-' :
				System.out.println(strInput-strInput2);
				break;
				default:
					System.out.println("Error");
				
			}
}
}
