import java.util.Scanner;

class Factorial_Individual_Sum
{
	public static void main(String[] args) 
	{

		Scanner a = new Scanner(System.in);

		System.out.println(" Enter a number: ");

		int num = a.nextInt();

		int sum = 0;

		
		
		while(num>0)
		{ 
			int rem = num%10;

			int f = 1;
			int i = 1;
			
			while (i<=rem)
			{
				f *= i;

				i++;
			}
			
			System.out.println(" The factorial of " + rem + " is:" + f);
			
			sum += f;

			num/=10;

			
		}
		System.out.println(" The sum of factorial is: " + sum);

	
	}
}
