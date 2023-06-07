//Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.
class biggestNumber
{
	static int bigNum(int arr[][])
	{
		int res=0;
		for(int i=1;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(res<arr[i][j])
					res=arr[i][j];
			}
		}
		return res;
	}
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		if(args.length<4)
			System.out.println("Please enter 9 numbers");
		else
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt(args[2*i+j]);
				}
			}
			System.out.println("The given array is:");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println("");
			}
			int res=bigNum(a);
			System.out.println("Biggest number is "+res);
		}
	}
}