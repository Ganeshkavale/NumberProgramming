import java.util.Scanner;

class Armstrong_Number									// It is defined as the sum of cube of individual digit of the the given number is that number itself is called Armstrong number.
{
	public static void main(String[] args) 
	{

		Scanner a = new Scanner(System.in);

		System.out.println(" Enter a number: ");

		int num = a.nextInt();

		int sum = 0;

		
		while(num>0)
		{ 
			int rem = num%10;

			int raise = 3;

			int power = 1;

			int i = 1;
				
			while (i<=raise)
			{
				power = power * rem;

				i++;

			}
			
			System.out.println(" The cube of " + rem + " is:" + power);
			
			sum += power;

			num/=10;
			
		}
		System.out.println(" The sum of cube of " + num + " is:" + sum);

	
	}
}
