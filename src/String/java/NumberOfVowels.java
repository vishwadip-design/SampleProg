package String.java;

import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=0,e=0,i=0,o=0,u=0;
     
     Scanner sc1=new Scanner(System.in);
     System.out.println("Enter the String:");
     String str=sc1.next();
     str=str.toLowerCase();
     for (int j = 0; j < str.length(); j++) 
      {
		 char ch=str.charAt(j);
    	 if(ch=='a')
    	  {++a;}
    	 else if (ch=='e')
    	 {++e;}
    	 else if (ch=='i')
    	 {++i;}
    	 else if (ch=='o')
    	 {++o;}
    	 else if(ch=='u')
    	 {++u;}
	 }
     System.out.println("a->"+a);
     System.out.println("e->"+e);
     System.out.println("i->"+i);
     System.out.println("o->"+o);
     System.out.println("u->"+u);
	}

}
