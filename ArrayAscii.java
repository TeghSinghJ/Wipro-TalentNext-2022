import java.util.Scanner;
class ArrayAscii
{
	public static void main(String args[])
	{
		char[] ascii_arr=new char[256];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of ASCII values: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			ascii_arr[i]=(char)i;
		//System.out.println("S.No\tASCII");
		for(int i=0;i<n;i++)
			System.out.print(" "+ascii_arr[i]);
	}
}