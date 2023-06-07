//Write a program to reverse a given number and print
import java.util.Scanner;
class ReverseNumber
{
	static int reverse(int num)
	{
		int res=0;
		while(num!=0)
		{
			res=res*10+num%10;
			num/=10;
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int res=reverse(num);
		System.out.println("Reverse of "+num+" is "+res);
	}
}