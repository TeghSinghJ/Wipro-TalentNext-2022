/*Write a program to accept gender ("Male" or "Female") and age 
from command line arguments and print the percentage of interest based
 on the given conditions*/

class GenderAge
{
	static float solvePercent(String gender,int age)
	{
		if(gender.equals("Female") && (age>1 && age<58))
			return 8.2f;
		else if(gender.equals("Female") && (age>59 && age<100))
			return 9.2f;
		else if(gender.equals("Male") && (age>1 && age<58))
			return 8.4f;
		else if(gender.equals("Male") && (age>59 && age<100))
			return 10.5f;
		return 0;
	}
	public static void main(String args[])
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		float percentage=solvePercent(gender,age);
		System.out.println("percentage = "+percentage+"%");
	}
}