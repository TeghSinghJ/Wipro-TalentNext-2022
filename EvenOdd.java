//Write a program to check if a given integer number is odd or even.
import java.util.*;
class EvenOdd
{
	static boolean isEven(int num)
	{
		if(num%2==0)
			return true;
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int  num=sc.nextInt();
		if(isEven(num))
			System.out.println(num+" is an even number");
		else
			System.out.println(num+" is an Odd number");
	}
}