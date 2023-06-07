/*Initialize a character variable in a program and 
print 'Alphabhet' if the initialized value is an alphabhet, 
print 'Digit' if the initialized value is a number, and 
print 'Special Character', if the initialized value is anything else*/
import java.util.Scanner;
class AlDiSp
{
	static String solve(char a)
	{
		if(('A' <= a && a<'Z')||('a'<= a && a<='z'))
			return "Alphabets";
		if(a>='0' && a<='9')
			return "Digits";
		return "Special Characters";
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char a=sc.next().charAt(0);
		System.out.println(a+" is a "+solve(a));
	}
}