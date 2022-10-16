import java.util.Scanner;

class Prime_Number_Single
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first number: ");

		int first = a.nextInt();

		//System.out.println("Enter a last number: ");

		//int last = a.nextInt();

		//int num = first;

		//int count = 0;

		//int count1 = 0;

		//int reverse = 0;

		//int num;
				
		//for (num = first; num<=last;num++)
		//{
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
			//	count++;

			}
			else
			{
				System.out.println("It is not Prime number: " + first);

			}

		//}
		//System.out.println("The total count of Prime number is: " + count);

	}
}
