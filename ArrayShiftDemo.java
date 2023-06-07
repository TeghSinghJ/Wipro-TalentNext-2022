/*Print a version of the given array where all the 10's have been removed.
 The remaining elements should shift left towards the start of the array 
as needed, and the empty spaces at the end of the array should be 0. 
So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the
 given array or make a new array.
*/
import java.util.*;
class ArrayShiftDemo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
			arr[i]=arr[i]%10;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
}
