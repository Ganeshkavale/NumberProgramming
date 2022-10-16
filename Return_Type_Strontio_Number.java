import java.util.Scanner;

class Return_Type_Strontio_Number									//double the given number and check the intermediate numbers are same or different, if same then it is Strontio Number. INPUT MUST BE FOUR DIGIT NUMBER.
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		if (first>999 && last<10000)
		{
			for (int i= first;i<=last;i++)
			{
				
				if (strontioNumberCheck(i))
				{
					System.out.println(i + " is a Strontio number!");
				}
				else	
				{
					System.out.println(i + " is not a Strontio number!");
				}
			}
		}
		else
		{
			System.out.println("Enter a correct input");		
		}	
	}

	
	public static boolean strontioNumberCheck(int a)
	{
		int temp = a;

		int num = temp * 2;

		int n = num%1000;

		n/=10;

		int j = n%10;

		int i = n/10;		

		if (i == j)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}