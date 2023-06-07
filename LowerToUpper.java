/*Initialize a character variable with an alphabhet in a program.
If the character value is in lowercase, the output should be 
displayed in uppercase in the following format*/
import java.util.Scanner;
class LowerToUpper
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c>='a' && c<='z')
			System.out.println(c+"->"+(char)(c-32));
		else if(c>='A' && c<='Z')
			System.out.println(c+"->"+(char)(c+32));
	}
}