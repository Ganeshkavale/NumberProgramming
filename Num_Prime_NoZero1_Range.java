import java.util.Scanner;

class Num_Prime_NoZero1_Range
{
	public static void main(String[] args) 
	{

		Scanner a = new Scanner(System.in);

		System.out.println(" Enter a first number: ");

		int num = a.nextInt();

		System.out.println(" Enter a last number: ");

		int last = a.nextInt();

		int i;

		while (num<=last)
		{
		
			for (i=2;i<=num;i++ )
			{
				if (num%i == 0)
				{
					break;
				}
			}
	
			if (i == num)
			{
				System.out.println(num + " is a Prime number.");
			
				int temp = num;

				while (temp>0)
				{	
					int rem = temp%10;

					if (rem ==0)
					{
						System.out.println(num + " is a Prime number which contains zero.");  // Here we can simply put break by removing statement so we get only non-zero prime number as written below.
						break;

					}

					if (rem!=0)
					{
						temp/=10;
					}

					if (temp==0)
					{
						System.out.println(num + " is a Prime number which does not contain zero.");

					}
				}	
			}
			else
			{
				System.out.println(num + " is not a Prime number.");

			}
			num++;
			
		}
		
	}
}
