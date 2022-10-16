import java.util.Scanner;

class Strong_Number_Range
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
			int num = first;
			int sum=0;
			
			for (int i = num; i>0; i/=10)
			{
				int rem = i%10;

				int facto = 1;

				for (int j = 1;j<=rem; j++ )
				{
					facto = facto * j; 
				}
				
				//System.out.println("The factorial of individual digit of a " + first + " number is " + rem + " is: " + facto);

				sum = sum + facto;
			}

			//System.out.println("The sum of factorial of individual digit of given number "+ num + " is : " + sum);

			if (sum == first)
			{
				System.out.println(first + " is a Strong Number");

			}

			first++;

		}
	}
}
