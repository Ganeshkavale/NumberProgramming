import java.util.Scanner; 

class First_Last_Sum_Internal_Digits
{
	public static void main(String[] args) 
	{	
		Scanner a = new Scanner(System.in);

		System.out.println(" Enter a number: ");

		int i = a.nextInt();

		int num = i;

		int sum = num%10;

		int sum1 = sum;

		num/=10;

		int sum2 = 0;

		while (num>0)
		{
			while (num<=9)
			{
				break;
			}

			if (num<=9)
			{
				sum1+=num;

			}

			else 
			{
				int rem = num%10;

				sum2 += rem;

			}
		num/=10;

		}
		System.out.println(" The sum of first and last digit of the " + i + " is: " + sum1);

		System.out.println(" The sum of internal digit of the " + i + " is: " + sum2);
		 
		
	}
}
