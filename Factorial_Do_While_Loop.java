import java.util.Scanner;

class Factorial_Do_While_Loop
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter value: ");

		int base = s.nextInt();
		
		int  factorial = 1;

		int i = 1;

		do 
		{
			factorial = factorial * i;
			i++;
		}
		while(i <= base);

		System.out.println("The factorial of the given number is: " + factorial);

	}
}
