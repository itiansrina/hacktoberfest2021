
/**
 * Author:  ARUN BALAJI R
 * Date:    03 July 2021 (Saturday)
 */


import java.util.*;
public class ReverseArray{
	public static void main(String args[]){
		Solution s = new Solution();
		int arr[] = {10,5,7,30};

		System.out.println("Array Before Reverse");
		s.printArray(arr);

		//reverse
		s.reverseArray(arr);

		System.out.println("Array After Sorting");
		s.printArray(arr);
		
	}
}


class Solution{
	void reverseArray(int arr[]){
		int i =0,j = arr.length-1;
		while(i<j){
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			i++;
			j--;

		}
	}

	void printArray(int arr[]){
		for(int i:arr){
			System.out.print(i+" ");

		}
		System.out.println();
	}
}
public class Reversal {
    public static void main(String args[])
    {
        int aryy[]={1,2,3,4,5,6};
        int n=aryy.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=aryy[i];
            aryy[i]=aryy[n-i-1];
            aryy[n-i-1]=temp;


        }
        System.out.println("Reversal of arrya is:");
        for(int i=0;i<n;i++)
        {
          
            System.out.print(aryy[i]+" ");
        }
        System.out.println("");
        

    }
    
}





