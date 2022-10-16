import java.util.Scanner;

class Return_Type_Circular_Prime_Count								
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();	

		int count = count(first);

		rotate(first,count);

	}

	public static int count(int num)
	{
		int count = 0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		return count;
	}

	public static void rotate(int num, int count)
	{

		int size = count - 1;

		int cout = 0;

		for (int i = 0;i<count ;i++ )
		{
			int rem = num%10;
			
			int temp = num/10;
		
			for (int j=0;j<size ;j++ )
			{
				rem=rem*10;
			}
			num=rem+temp;


			if (num==prime(num))
			{
				System.out.println(num + " is a Prime number");
				cout++;			
			}
			else
			{
				System.out.println(num + " is not a Prime number");			
			}
			
		}
		if (cout==count)
		{
			System.out.println(num + " is a circular Prime number");
		}

		else
		{
			System.out.println(num + " is not a circular Prime number");
		}
		

	}
	public static int prime(int temp1)
	{
		int i;
		for (i=2;i<=temp1 ;i++ )
		{
			if (temp1%i==0)
			{
				break;
			}
		}
		return i;
	}
}