import java.util.Scanner;

class Leap_Year_Range
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first year: ");

		int first_year = a.nextInt();

		System.out.println("Enter a last year: ");

		int last_year = a.nextInt();

		int count = 0;

		int count1 = 0;

		while (first_year <= last_year)
		{
			if ((first_year%4==0 && first_year%100 != 0) || (first_year%400==0))
			{
				System.out.println(first_year + " is a leap year");
				count++;
			

			}
			else
			{
				System.out.println(first_year + " is not a leap year");
				count1++;

			}
			first_year++;
		}
		System.out.println("The total count of the LEAP YEAR is: " + count);
		System.out.println("The total count of NOT LEAP YEAR is: " + count1);
	}
}
