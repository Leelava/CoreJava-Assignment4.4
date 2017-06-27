package Session4Assignment4;

import java.util.Scanner;
//Program to print the 
public class AliquotNumberMain {

	public static void main(String[] args) {
		AliquotNumber a1 = new AliquotNumber();
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number");
		int num = input.nextInt();
		int sum=a1.aliquotnum(num);
		System.out.println("Aliquot sum of " +num+ " is " +sum);
		a1.perfectnum();
		

	}

}
