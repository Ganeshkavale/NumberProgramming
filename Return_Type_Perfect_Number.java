import java.util.Scanner;

class Return_Type_Perfect_Number									//The sum of the digits of a factors the given number (Don't consider number itself) is equal to given number.
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

			if (i==sumOfDivisorDigit(i))
			{
				System.out.println(i + " is a Perfect number!");
			}
			else
			{
				System.out.println(i + " is not a Perfect number!");
			}


		}
		
	}			
	
	public static int sumOfDivisorDigit(int temp)
	{
		int sum = 0;

		for (int i=1; i<temp;i++)
		{
			if (temp%i==0)
			{
				sum = sum + i;
				
			}
		}
		return sum;

	}
}
