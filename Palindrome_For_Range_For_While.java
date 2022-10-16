import java.util.Scanner;

class Palindrome_For_Range_For_While
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first number: ");

		int first = a.nextInt();

		System.out.println("Enter a last number: ");

		int last = a.nextInt();

		int sum = 0;

		int count = 0;

		int count1 = 0;

		//int reverse = 0;
				
		for (int i = first;i<=last;i++)
		{
			int num = i, reverse=0;

			while (num>0)
			{
				int rem = num%10;

				reverse = (reverse * 10) + rem;

				num/=10;
			}

			if (i ==reverse)
			{
				System.out.println("It is a Palindrome number: " + i);
				count++;

			}
			else
			{
				System.out.println("It is not a Palindrome number: " + i);
				count1++;
			}
			
		}
		System.out.println("The sum of the palindrome number is: " + sum);

		System.out.println("The total count of the palindrome number is: " + count);

		System.out.println("The total count of not palindrome number is: " + count1);

	}
}
