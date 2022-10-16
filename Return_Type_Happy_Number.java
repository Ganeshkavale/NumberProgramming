import java.util.Scanner;

class Return_Type_Happy_Number									//The Happy number is a number which ends 1 after give one number, do square and sum it, check that sum is one or not. if one then its happy number.
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		for (int i= first;i<=last;i++)
		{
			if (happyNumberCheck(i))
			{
				System.out.println(i + " is a Happy number!");
			}
			else	
			{
				System.out.println(i + " is Unhappy number!");
			}
		}
	}

	public static boolean happyNumberCheck(int num)
	{
		int temp=num;
		
		int sum = 0;

		while (sum!=1 && sum!=4)
		{
			 sum = 0;
	
			for	(int i = temp;i>0;i/=10)
			{
				int rem = i%10;

				int square = rem * rem;

				sum = sum + square;
			}
			temp=sum;
		}
		if (sum==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}