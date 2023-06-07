//Write a Java program to find if the given number is palindrome or not

import java.util.Scanner;
class PalindromeNumber
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
	static boolean isPalindrome(int num)
	{
		int rev=reverse(num);
		return num==rev;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(isPalindrome(num))
			System.out.println(num+" is a palindrome number");
		else
			System.out.println(num+" is not a palindrome number");
	}
}