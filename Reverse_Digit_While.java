import java.util.Scanner;

class Reverse_Digit_While
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter base value");

		int base = a.nextInt();

		int reverse = 0;

		int i = 1;

		
		while (base>0)
		{
			int rem = base%10;

			reverse = (reverse * 10) + rem;

			base/=10;
			;

		}
		System.out.println("The reverse digit of the given number is: " + reverse);

	}
}
