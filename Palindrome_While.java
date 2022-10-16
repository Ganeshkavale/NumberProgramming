import java.util.Scanner;

class Palindrome_While
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first number: ");

		int first = a.nextInt();

		//System.out.println("Enter a last number: ");

		//int last = a.nextInt();

		int num = first;

		int reverse = 0;
				
		while (num > 0)
		{
			int rem = num%10;

			reverse = (reverse * 10) + rem;

			num/=10;

		}

		if (first ==reverse)
		{
			System.out.println("It is a Palindrome number: " + first);

		}
		else
		{
			System.out.println("It is not a Palindrome number: " + first);

		}


	}
}
