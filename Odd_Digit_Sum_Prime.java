import java.util.Scanner;

class Odd_Digit_Sum_Prime
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);

		System.out.println("Enter a number :");

		int n = a.nextInt();

		//int n = 11357;

		int sum = 0;


		for (int num=n; num>0 ;num/= 10)
		{
			int rem = num%10;

			if (rem%2 !=0)
			{
				System.out.println("Reminder odd digit is " + rem);

				sum+=rem;
			}
			else
			{
				System.out.println("Reminder Even digit is " + rem);

			}			
		}
		System.out.println("The sum of odd digit " + sum);

		int temp;

		for (temp=2;temp<=sum ;temp++)
		{
			if (sum%temp==0)
			{
				break;
			}
		}

		if(sum == temp)
		{
			System.out.println(sum+ " is a Prime number.");
		}
		else
		{
			System.out.println(sum+ " is a not a Prime number.");
		}
	
	}

}