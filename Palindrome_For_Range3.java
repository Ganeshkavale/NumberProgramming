import java.util.Scanner;

class Palindrome_For_Range3
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first number: ");

		int first = a.nextInt();

		System.out.println("Enter a last number: ");

		int last = a.nextInt();

		int count = 0;

		int count1 = 0;
				
		for (int num = first;num<=last;num++)
		{
			int temp = num, reverse=0;

			while (temp>0)
			{
				int rem = temp%10;

				reverse = (reverse * 10) + rem;

				temp/=10;
				
			}
		
			if (num ==reverse)
			{
				System.out.println(num + " is a Palindrome number.");
				count++;
			}

			else
			{
				System.out.println( num + " is not a Palindrome number." );
				count1++;
			}
						
		}
		System.out.println("The total count of the palindrome number is: " + count);
		System.out.println("The total count of not palindrome number is: " + count1);
		
	}
}
