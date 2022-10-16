import java.util.Scanner;

class Number_Range_Not_Zero
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first number: ");

		int first = a.nextInt();

		System.out.println("Enter a last number: ");

		int last = a.nextInt();

		while (first<= last)
		{
			System.out.println("the number is: " + first);

			int temp=first;

			int rem;

			while (temp>0)
			{
				rem = temp%10;

				if (rem == 0)
				{
					System.out.println( first + " is a number which is contains zero");
					break;
				}

				if (rem!=0)
				{
					temp/=10;
				}

				if (temp==0)
				{
					System.out.println("The number which does not contain zero is: " + first);

				}		

			}

			first++;
		}

		

	}
}




















