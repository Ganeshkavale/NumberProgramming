import java.util.Scanner;

class Return_Type_Composite_Number									//The composite number is a number in which the number has more than two factors.
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
			if (compositeNumberCheck(i))
			{
				System.out.println(i + " is a Composite number!");
			}
			else	
			{
				System.out.println(i + " is not a Composite number!");
			}
		}
	}

	public static boolean compositeNumberCheck(int num)
	{
		int temp=num;

		int count=0;

		for (int i = 1;i<=temp; i++)
		{
			if (temp%i==0)
			{
				count++;
			}
		}

		if (count>2)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}