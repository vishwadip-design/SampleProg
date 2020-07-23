package String.java;

public class ReverseStrinrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words="My First Java Program";
		String w1[]=words.split(" ");
		
		for(String temp:w1)
		{
			System.out.println(temp);
		}
		
		for(int i=0;i<w1.length-1;i++)
		{
			char [] ch=w1[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--) 
			{
				System.out.print(ch[j]);
			}
		//	System.out.println(" ");
		}
	}

}
