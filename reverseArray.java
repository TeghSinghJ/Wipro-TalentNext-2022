class reverseArray
{
	static void reverse(int a[][])
	{
		for(int i=0;i<2;i++)
		{
			for(int j=1;j>=0;j--)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		System.out.println("The reverse of an array is:");
		for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println("");
			}
	}
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		if(args.length<4)
			System.out.println("Please enter 4 numbers");
		else
		{
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					a[i][j]=Integer.parseInt(args[2*i+j]);
				}
			}
			System.out.println("The given array is:");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println("");
			}
			reverse(a);
			
		}
	}
}