package practiseProgram;

import java.util.Arrays;

public class BinarySearchElement {
	
	 int fidElement(int[] number,int l,int m,int n)
	 {
		 int num1=number.length;
		 
		 if(num1>=l)
		 { 
			 int mid=m-1/2;
			if(number[mid]==n) //if element present in middle
			{
				return mid;
			}
			if(number[mid]>n) //if element less than
			{
				return fidElement(number, l, mid-1, n);
			}
			if(number[mid]<n) // if element greater than
			{
				return fidElement(number, l, mid+1, n);
			}
			
		 }
		// we reach here when the element is not present in array
		return -1;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={10,15,13,11,18,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int num=arr.length;
		int key=7;
		BinarySearchElement b1=new BinarySearchElement();
		
		//int m1=Arrays.binarySearch(arr, 0, num-1, key);
		//     (array Element,StarIndex,TotalIndex,findElement)
		int n=b1.fidElement(arr,0,num-1,key);
		
		if(n==-1) {
			System.out.println("Element not persent in array");
		}
		else
			System.out.println("Element present at: "+n);
		
	}

}
