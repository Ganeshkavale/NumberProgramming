import java.util.Scanner;

class Return_Type_Armstrong_Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		while (first<=last)
		{
			int temp=first;

			int sum=0;

			while (temp>0)
			{
				int rem = temp%10;

				sum = sum + power(rem);

				temp/=10;

			}
						

			if (sum==first)
			{
				System.out.println(first + " is a Armstrong number!");
			}
			else
			{
				System.out.println(first + " is not a Armstrong number!");
			}
			first++;
		}

	}
	public static int power(int rem)
	{
		int power=1;

		int raise = 3;

		for (int i = 1;i<=raise;i++ )
		{
			power+=rem;
		}
		return power;

	}

}
