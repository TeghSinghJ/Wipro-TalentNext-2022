//Write a program to print the sum of all the digits of a given number.
import java.util.Scanner;
class SumNumbers
{
	static int SumDigits(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num/=10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sum=SumDigits(num);
		System.out.println("Sum of "+num+" is "+sum);
	}
}