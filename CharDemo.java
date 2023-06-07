//Initialize two character variables in a program and display the characters in alphabetical order.import java.util.*;
class CharDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		//char b=sc.nextLine();
		if(a<b)
			System.out.println(a+","+b);
		else
			System.out.println(b+","+a);
	}
}