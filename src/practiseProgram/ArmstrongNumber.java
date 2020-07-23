package practiseProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter Number:");
		int num=371,numb;
		int value=num;
		int n=0;
		while(value>0)
		{
			numb=value%10;
			n=numb*numb*numb+n;
			value=value/10;
		}
		if(num==n)
		{
			System.out.println("number is Armstrong");
		}else
			System.out.println("Number is not armstrong");
	}

}
