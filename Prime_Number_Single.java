import java.util.Scanner;

class Prime_Number_Single
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first number: ");

		int first = a.nextInt();

			int temp;
			for (temp = 2; temp<=first;temp++ )
			{
				if (first%temp ==0)
				{
					break;
				}
			}

			if (first == temp)
			{
				System.out.println("It is Prime number: " + first);
			

			}
			else
			{
				System.out.println("It is not Prime number: " + first);

			}

		

	}
}
