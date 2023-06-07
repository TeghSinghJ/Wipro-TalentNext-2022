/*Write a program to check if a given integer number is Positive, Negative, or Zero. 
*/
import java.util.*;
class PosNegZero
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(num>0)
			System.out.println("Number is Positive");
		else if(num==0)
			System.out.println("Number is equal to zero");
		else
			System.out.println("Number is Negative");
	}
}