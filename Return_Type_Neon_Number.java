import java.util.Scanner;

class Return_Type_Neon_Number									//square a given number and sum the individual digit of the result. That sum is equal to the given number.
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		for (int i= first; i<=last;i++)
		{

			if (i==squareSumDigit(i))
			{
				System.out.println(i + " is a Neon number!");
			}
		/*	else
			{
				System.out.println(i + " is not a Neon number!");
			}*/

		}
		
	}
	
	public static int squareSumDigit(int temp)
	{
		int square = temp * temp;

		int sum = 0;

		while (square>0)
		{
			int rem = square%10;

			sum = sum + rem;

			square/=10;

		}
		return sum;
	}

}
