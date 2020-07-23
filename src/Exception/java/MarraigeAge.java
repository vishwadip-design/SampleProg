package Exception.java;

import java.util.Scanner;

public class MarraigeAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Age value:");
		int n=sc.nextInt();
		
		if(n<=18) {
			throw new TooYoungException("You are too young.apply after 18+");
		}else if (n>60) {
			throw new TooOldException2("You are too old.please try another option");
			
		}else {
			System.out.println("please try another value");
		}

	}

}
