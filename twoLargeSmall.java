import java.util.Arrays;
class twoLargeSmall
{
	 public static void main(String args[])
	 {
		 int[] arr={56,25,2,8,48,32};
		 Arrays.sort(arr);
		 int n=arr.length;
		 System.out.println("First smallest element="+arr[0]);
		 System.out.println("Second smallest element="+arr[1]);
		 System.out.println("First Largest element="+arr[n-1]);
		 System.out.println("Second Largest element="+arr[n-2]);
	 }
}