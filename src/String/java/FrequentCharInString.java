package String.java;

import java.util.Scanner;

public class FrequentCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.next();
		
		char ch[]=str.toCharArray();
		int count=0,len=ch.length;
		try 
		{
		for(int j=0;j>len;j++) 
		       {
			if((ch[0]==ch[j]) &&((ch[0]>=65 &&ch[0]<=91)&& (ch[0]>=97 && ch[0]>=123)))
			{
				
				count++;
			}
			if(count!=0) 
			{
				System.out.println(ch[0]+" :"+count+"times");
			}
			str=str.replace(""+ch[0],"");
		       }
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		while(len!=1);
	}

}
