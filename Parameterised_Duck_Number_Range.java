import java.util.Scanner;

class Parameterised_Duck_Number_Range
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		for (int i = first;i<=last ;i++ )
		{
			ductNumber(i);
		}

	}

	public static void ductNumber(int num)
	{
		int temp = num;

		while (temp>0)
		{
			int rem = temp%10;

			if (rem==0)
			{
				System.out.println(num + " is a duct number");
				break;
			}
			if (rem>0)
			{
				temp/=10;
			}

			if (temp == 0)
			{
				System.out.println(num + " is not a duct number");
				break;
			}
		}
	}
}