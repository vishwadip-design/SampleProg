package practiseProgram;

public class Bubblesort {
	
	public int[]sortNumbers(int arr[])
	  {
		int num=arr.length;  //need length of array
		
		for(int i=0;i<num-1;i++)
		{   
			//fixing one-one position in array
			for(int j=0;j<num-i-1;j++)
				//8-0-1=7  8-0-2=6  8-0-3=5
				//8-1-1=6  8-1-2=5  8-1-3=4
				//8-2-1=5  8-2-2=4  8-2-3=3
			{ 
				if(arr[j]>arr[j+1])  //swaping here
				{
				int temp=arr[j];     //arranging number by position
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrnum[]= {10,89,71,16,19};
		Bubblesort b1=new Bubblesort();
	int rcv[]=	b1.sortNumbers(arrnum);
	int n=rcv.length;
		System.out.println("Sorting Numbers:");
		for(int m=0; m<=n-1;m++)
		{
			System.out.print(" "+rcv[m]);
		}
	}

}
