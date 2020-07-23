package String.java;

public class BubbleSort {  
	  public static void main(String[] args) {
		  int j;
		int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
	  for(int i=0;i<10;i++)  
	  {  
	    for ( j=0;j<10;j++)  
	    {  
	      if(a[i]<a[j])  
	      {  
	        int temp = a[i];  			
	        a[i]=a[j];  
	        a[j] = temp;   
	      }
	      	    }  
	   
	    System.out.println("i="+i+"j="+j);
	    for(int k=0;k<10;k++)
	    {
	    	System.out.print(a[k]+" ");
	    }
	    System.out.println(" ");
	  }  
	  System.out.println("Printing Sorted List ...");  
	  for(int i=0;i<10;i++)  
	  {  
	    System.out.print(a[i]);  
	    System.out.print(" ");
	  }  
	}  
	}  