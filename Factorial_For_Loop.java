import java.util.Scanner;

class Factorial_For_Loop
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter value: ");

		int base = s.nextInt();
		
		int  factorial = 1;

		for (int i = 1; i <= base;i++)
		{
			factorial = factorial * i;
		}

		System.out.println("The factorial of the given number is: " + factorial);

	}
}
