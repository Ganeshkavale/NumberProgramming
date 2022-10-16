import java.util.Scanner;

class Fibonacci_Series 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int num = sc.nextInt();

		fibo(num);  //to find 11th fibonacci number put num = 11.
	}
	public static void fibo(int num)
	{
		int n1 = 0, n2 = 1, n3;

		for (int i = 0;i<num ;i++ )
		{
			n3 = n1 + n2;

			System.out.print(n1 + " " + " ");

			n1=n2;

			n2= n3;
		}
	}
}
