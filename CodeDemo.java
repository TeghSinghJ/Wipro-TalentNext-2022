/*Write a program to receive a color code from the user (an Alphabhet). 
The program should then print the color name, based on the color code 
given. import java.util.Scanner;
*/
class CodeDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char code=sc.next().charAt(0);
		switch(code)
		{
			case 'R':
					System.out.println("Red");
					break;
			case 'B':
					System.out.println("Blue");
					break;
			case 'G':
					System.out.println("Green");
					break;
			case 'O':
					System.out.println("Orange");
					break;
			case 'Y':
					System.out.println("Yellow");
					break;
			default:
				System.out.println("Invalid Choice");
				//exit(1);
				break;
		}
	}
}