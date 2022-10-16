import java.util.Scanner;

class Palindrome_While_Range
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first number: ");

		int first = a.nextInt();

		System.out.println("Enter a last number: ");

		int last = a.nextInt();

		int num = first;

		int count = 0;

		int count1 = 0;

		int reverse = 0;
				
		while (num <=last)
		{
			while (num>0)
			{
				int rem = num%10;

				reverse = (reverse * 10) + rem;

				num/=10;
				num++;
			}

			if (first ==reverse)
			{
				System.out.println("It is a Palindrome number: " + first);
				//count++;

			}
			else
			{
				System.out.println("It is not a Palindrome number: " + first);
				//count1++;
			}
			
		}
		//System.out.println("The total count of the palindrome number is: " + count);
		//System.out.println("The total count of not palindrome number is: " + count1);

	}
}
