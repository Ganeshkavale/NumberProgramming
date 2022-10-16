import java.util.Scanner;

class Prime_Number_Range1
{
	public static void main(String[] args) 
	{		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first number: ");

		int first = a.nextInt();

		System.out.println("Enter a last number: ");

		int last = a.nextInt();

		int count = 0;

		int num=first;
		
		while (num<=last)		
		{
			int temp;
			for (temp = 2; temp<=num;temp++ )
			{
				if (num%temp ==0)
				{
					break;
				}
			}

			if (num == temp)
			{				
				System.out.println("It is Prime number: " + num);
				count++;
			}
			num++;

		}
		System.out.println("The total count of Prime number between " + first + " and " + last + " is : " + count);
		

	}
}
