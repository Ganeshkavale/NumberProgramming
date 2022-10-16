import java.util.Scanner;

class Fibonacci_Number_Check_Range 
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
			fibo(num);
		}	
	}
	public static void fibo(int num)
	{
		int n1 = 0, n2 = 1, n3;

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
				System.out.println(n1 + " is a fibonacci number");
				break;				
			}

			if(n1>num)
			{
				System.out.println(n1 + "It is not a fibonacci number");
				break;
			}
		}
	}
}
