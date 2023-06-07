//Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
import java.util.*;
class LastDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<0 || b<0)
			System.out.println("Numbers cannot be negative:");
		System.out.println((a%10)==(b%10));
	}
}