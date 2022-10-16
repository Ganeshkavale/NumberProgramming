import java.util.Scanner;

class Return_Type_Factors								
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

			int factors = sumOfDivisorDigit(i);

			System.out.println("Factors of given number: " + factors);

		/*	if (sumOfDivisorDigit(i)>0)
			{
				System.out.println(i + " is a Factors of given number!");
			}
		/*	else
			{
				System.out.println(i + " is not a factors of a given number!");
			}*/

		}
		
	}	
	
	public static int sumOfDivisorDigit(int temp)
	{
//		int sum = 0;

		int i =1;

		while(i<=temp)
		{

			if (temp%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
		return i;

	}

}
