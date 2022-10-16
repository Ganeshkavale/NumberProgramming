import java.util.Scanner;

class Factorial_Of_Each_Digit_Sum
{
	public static void main(String[] args) 
	{		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a number: ");

		int num = a.nextInt();

		int sum=0;

		while (num>0)
		{
	//		factorial_each /= factorial_each;
			
			int rem = num%10;

			num/=10;

			int factorial_each = 1;

			for (int i = 1; i<=rem; i++)
			{
				factorial_each = factorial_each * i;

							
			}
			System.out.println("The factorial of individual digit of given number "+ rem + " is : " + factorial_each);

			sum+= factorial_each;


		}

		System.out.println("The sum of factorial of individual digit of given number "+ num + " is : " + sum);

	}
}
