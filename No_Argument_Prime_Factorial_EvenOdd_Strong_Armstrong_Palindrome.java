import java.util.Scanner; 

class No_Argument_Prime_Factorial_EvenOdd_Strong_Armstrong_Palindrome
{
	public static void main(String[] args) 
	{
		
		primeNumber();
		
		factorialNumber();

		evenAndOdd();

		strongNumber();	
		
		armstrongNumber();

		palindromeNumber();
		
	}

	public static void primeNumber()
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for checking prime number: ");

		int num = sc.nextInt();;

		int i;

		for (i = 1; i<=num; i++)
		{
			if (i%2 == 0)
			{
				break;
			}

		}

		if (num == i)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num + " is not a prime number");
		}

	}

	public static void factorialNumber()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for finding its factorial: ");

		int num = sc.nextInt();

		int f = 1;

		int i;

		for (i = num; i>0; i--) 
		{

			f = f * i;

		}

		System.out.println(f + " is a factorial of " + num + ".");
	}

	public static void evenAndOdd()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for checking it is even or odd number: ");

		int num = sc.nextInt();

		if (num%2==0)
		{
			System.out.println(num + " is a even number");
		}
		else
		{
			System.out.println(num + " is a odd number");
		}

	}

	public static void strongNumber()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for checking a strong number: ");

		int num = sc.nextInt();

		int i;

		int sum = 0;

		for (i=num;i>0;i/=10)
		{

			int rem = i %10;

			int j;

			int f = 1;

			for (j=1;j<=rem;j++)
			{
				f = f * j;

			}

			System.out.println(f + " is a factorial of digit " + rem + " of number " + num + ".");
			sum = sum + f;
		}

		System.out.println(sum + " is a sum of factorial of " + num + ".");

		if (num == sum)
		{
			System.out.println(num + " is a strong number");
		}
		else
		{
			System.out.println(num + " is not a strong number");
		}

	}

	public static void armstrongNumber()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for checking Armstrong number: ");

		int num = sc.nextInt();

		int i;

		int power = 1;

		int sum = 0;

		for (i=num;i>0;i/=10)
		{
			int rem = i %10;

			int raise = 3;

			int j;

			for (j=1;j<=raise;j++)
			{
				power = power * rem;
			}

			System.out.println(power + " is a cube of digit " + rem + " of number " + num + ".");

			sum = sum + power;
		}

		System.out.println(sum + " is a sum of cube of individual digit of " + num + ".");

		if (num == sum)
		{
			System.out.println(num + " is a Armstrong number");
		}
		else
		{
			System.out.println(num + " is not a Armstrong number");
		}

	}

	public static void palindromeNumber()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for checking PALINDROME number: ");

		int num = sc.nextInt();

		int i;

		int reverse = 0;

		for (i=num;i>0;i/=10)
		{
			int rem = i %10;

			reverse = (reverse * 10) + rem;

		}

		System.out.println(reverse + " is reverse of " + num +".");

		if (num == reverse)
		{
			System.out.println(num + " is a palindrome number");
		}
		else
		{
			System.out.println(num + " is not a palindrome number");
		}

	}

	
}
