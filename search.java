import java.util.Scanner;
class search
{
	static int FindNumber(int[] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the "+n+" of elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the key:");
		int key=sc.nextInt();
		int res=FindNumber(arr,key);
		if(res>=0)
			System.out.println("Number exist at index"+res);
		else
			System.out.println(res);
	}
}