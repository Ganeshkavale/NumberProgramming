import java.util.Scanner;

class Power_While
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter base value");

		int base = s.nextInt();

		System.out.println("Enter raise value");

		int raise = s.nextInt();
		
		int  power = 1;

		int i = 0;

		while (i < raise)
		{
			power = power * base;

			System.out.println(power);

			i++;

		}
		System.out.println("The power of the given number is: " + power);

	}
}
