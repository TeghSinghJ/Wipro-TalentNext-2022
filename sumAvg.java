class sumAvg
{
	static int Sum(int[] arr)
	{
		int s=0;
		for(int i=0;i<arr.length;i++)
			s=s+arr[i];
		return s;
	}
	static int Avg(int[] arr)
	{
		int n=arr.length;
		int sum=Sum(arr);
		return sum/n;
			
	}
	public static void main(String args[])
	{
		int[] arr={10,20,30,40,50,60,70};
		int sum=Sum(arr);
		int avg=Avg(arr);
		System.out.println("Sum of arr = "+sum);
		System.out.println("Average of arr = "+avg);
	}
}