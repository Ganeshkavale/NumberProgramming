import java.util.Scanner;

class Square_For
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter base value of square of individual digit: ");

		int base = a.nextInt();
		int sum_square=0;
		


		
		while (base>0)
		{
			int rem = base%10;

			sum_square+=rem*rem;

			base/=10;

		}
		System.out.println("The sum of square of individual digit of the given number is: " + sum_square);

	}
}
