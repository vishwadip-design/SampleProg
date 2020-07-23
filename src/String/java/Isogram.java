package String.java;

import java.util.Arrays;
import java.util.Scanner;

public class Isogram {

	static boolean Is_Isogram(String str) {
		
		int i=str.length();
		System.out.println("i:"+i);
		char arr[]=str.toCharArray();
	     Arrays.sort(arr);
	     System.out.println(Arrays.toString(arr));
		
		for (int j = 0; j < i-1; j++)
		{
			if(arr[j]==arr[j+1])
			{
				return false;
			}
			
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Isogram s1=new Isogram();

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String:");
      String st=sc.next();
            boolean b=s1.Is_Isogram(st);
            System.out.println(b);
	}

}
