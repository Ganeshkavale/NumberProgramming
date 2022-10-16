import java.util.Scanner;

class Factorial_While
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter value: ");

		int base = s.nextInt();
		
		int  factorial = 1;

		int i = 1;

		while (i <= base)
		{
			factorial = factorial * i;

			i++;

		}
		System.out.println("The factorial of the given number is: " + factorial);

	}
}
