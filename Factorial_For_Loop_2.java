import java.util.Scanner;

class Factorial_For_Loop_2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter value: ");

		int base = s.nextInt();
		
		int  factorial = 1;

		for (int i = base; i > 0;i--)
		{
			factorial = factorial * i;
		}

		System.out.println("The factorial of the given number is: " + factorial);

	}
}
