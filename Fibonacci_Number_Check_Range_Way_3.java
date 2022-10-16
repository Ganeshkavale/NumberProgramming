import java.util.Scanner;

class Fibonacci_Number_Check_Range_Way_3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		for (int num = first; num<=last ; num++)
		{		
			if(fibo(num))
			{
				System.out.println(num + " is a fibonacci number");				
			}

			else
			{
				System.out.println(num + " is not a fibonacci number");
			}

		}	
	}
	public static boolean fibo(int num)
	{
		int n1 = 0, n2 = 1, n3;

		boolean a ;

		for ( ; ; )
		{
			n3 = n1 + n2;

			if (n1<num)
			{
				n1=n2;

				n2= n3;
			}		

			if(n1==num)
			{
				a = true;
				
				break;
			}

			if(n1>num)
			{
				a = false;
				break;
			}
		}
		
		return a;
		
	}
}
