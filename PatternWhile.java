import java.util.Scanner;
class PatternWhile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0,j;
		while(i<=n)
		{
			j=0;
			while(j<i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}