import java.util.Scanner;
class PrimeNumber
{
	static boolean isPrime(int num)
	{
		int count=0;
		for(int i=0;i<num;i++)
		{
			if(num%i==0)
				count++;
				
		}
		if(count>=2)
			return false;
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isPrime(num))
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is a not primenumber");
	}
}