class MaxMin
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50,60,70};
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum="+max);
		System.out.println("Minimum="+min);
	}
}