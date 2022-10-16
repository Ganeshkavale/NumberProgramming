import java.util.Scanner;

class Leap_Year
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a year: ");

		int year = a.nextInt();

			if ((year%4==0 && year%100 != 0) || (year%400))
			{
				System.out.println(year + " is a leap year");
			

			}
			else
			{
				System.out.println(year + " is not a leap year");

			}

	}
}
