import java.util.*;
class midElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		for(int i=0;i<3;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<3;i++)
			b[i]=sc.nextInt();
		System.out.println(a[1]+","+b[1]);
	}
}