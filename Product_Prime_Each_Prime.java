import java.util.Scanner;

class Product_Prime_Each_Prime
{
	public static void main(String[] args) 
	{
		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a number: ");

		int num = a.nextInt();

		int product =1;

		while (num>0)
		{

			int rem = num%10;

			product *= rem;

			num/=10;

		}

		System.out.println("The Product of each digit of given number is: " + product);

		int temp;
		
	    for (temp = 2; temp<=product; temp++)
	    {
			if (product%temp == 0)
			{
				break;
			}
	    }

		if (product == temp)
		{
			System.out.println( product + " is a Prime number.");
		}

		else 
		{
			System.out.println(product + " is not a prime number.");

		}

		while (product>0)
		{
			int rem1 = product%10;
			
			System.out.println(rem1 + " is a Digit of Prime number product.");

			int temp1;

			for (temp1=1; temp1<=rem1;temp1++)
			{
				if (rem1%temp1==0)
				{
					break;
				}
			}

			if (rem1 == temp1)
			{
				System.out.println(rem1 + " is a Prime number.");
			}
			else 
			{
				System.out.println(rem1 + " is not a prime number.");
			}
			
			product/= 10;
	 	}

	}
}
