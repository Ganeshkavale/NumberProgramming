import java.util.Scanner;

class Return_Type_Automorphic_Number									//the square of digit is equal to the last digits of the result.
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		for (int i= first; i<=last;i++)
		{

			if (i==squareDigitLastCompare(i))
			{
				System.out.println(i + " is a Automorphic number!");
			}
			else
			{
				System.out.println(i + " is not a Automorphic number!");
			}

		}
		
	}
	
	public static int squareDigitLastCompare(int temp)
	{
		int num = temp;

		int c = 0;

		while (num>0)
		{
			num/=10;
			c++;
		}
		
		int square = temp * temp;

		int a = (int) Math.pow(10,c);

		int ans = square%a;

		return ans;
	}

}
