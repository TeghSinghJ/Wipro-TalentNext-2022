//Given an array of type int, print true if every element is 1 or 4. 
import java.util.*;
class oneFour
{
	static boolean One4(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=1 && arr[i]!=4)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(One4(arr,n));
	}
}