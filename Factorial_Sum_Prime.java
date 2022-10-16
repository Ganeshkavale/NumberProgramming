import java.util.Scanner;

class Factorial_Sum_Prime
{
	public static void main(String[] args) 
	{		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a number: ");

		int num = a.nextInt();

		/* System.out.println("Enter a last number: ");

		int last = a.nextInt(); */

		int sum = 0;

		int factorial = 1;

		int in = 1;

		
		
		while (in<= num)		
		{
			factorial = factorial *in;

			in++;

		}
		System.out.println("The factorial of "+ num + " is : " + factorial);

		while (factorial>0)
		{
			int rem= factorial %10;

			factorial/=10;

			sum+= rem;
		}

		System.out.println("The sum of rem is: " + sum);

		int temp;

		for (temp=2;temp<=sum ; temp++)
		{
			if (sum%temp ==0)
			{
				break;
			}
			
		}

		if (sum == temp)
		{
			System.out.println("It is a Prime number: " + sum);

		}
		else
		{
			System.out.println("It is not a Prime number: " + sum);

		}

	}
}












