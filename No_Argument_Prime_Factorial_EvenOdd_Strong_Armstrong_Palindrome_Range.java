import java.util.Scanner; 

class No_Argument_Prime_Factorial_EvenOdd_Strong_Armstrong_Palindrome_Range
{
	public static void main(String[] args) 
	{
		
		primeNumber();
		
		factorialNumber();

		evenAndOdd();

		strongNumber();	
		
		armstrongNumber();

		palindromeNumber();

		sumRange();

		firstLastDigit_InternalDigit(); //Xelem and Floem number means first and last digit is equal to sum of internal digit.

		noZeroNumber();
		
	}

	public static void primeNumber()
	
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("PRIME NUMBER WITHIN A GIVEN RANGE:");

		System.out.println("Enter a first number: ");

		int e = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		int count = 0;

		int first = e;

		while (first <= last)
		{
			int num = first;

			int i ;

			for (i = 2; i<=num; i++)
			{
				if (num%i == 0)
				{
					break;
				}

			}

			if (num == i)
			{
				System.out.println(num + " is a prime number");

				count++;
			}
	/*		else
			{
				System.out.println(num + " is not a prime number");
			}*/

			first++;

		}
		System.out.println(count + " is a total prime number within " + e + " and " + last + " number.");
	}

	public static void factorialNumber()
	{

		System.out.println("FACTORIAL OF A NUMBER WITHIN A GIVEN RANGE:");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		while (first <= last)
		{
			int f = 1;

			int num = first;

			int i;
	
			for (i = num; i>0; i--) 
			{

				f = f * i;

			}

			System.out.println(f + " is a factorial of " + num + ".");

			first++;
		}
	}
	
	public static void evenAndOdd()
	{
		System.out.println("EVEN AND ODD NUMBER WITHIN A GIVEN RANGE:");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int e = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		int count = 0;

		int count1 = 0;

		int first = e;

		while (first <= last)
		{
			int num = first;

			if (num%2==0)
			{
				System.out.println(num + " is a even number");
				count++;
			}
			else
			{
				System.out.println(num + " is a odd number");
				count1++;
			}		
		
			first++;
		}
		System.out.println(count + " is a total even number within " + e + " and " + last + " number.");
		System.out.println(count1 + " is a total odd number within " + e + " and " + last + " number.");
	}

	public static void strongNumber()
	{
		System.out.println("STRONG NUMBER WITHIN A GIVEN RANGE:");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int e = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		int count = 0;

		int first = e;

		while (first <= last)
		{

			int num = first;

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

				count++;
			}
	/*		else
			{
				System.out.println(num + " is not a strong number");
			}		*/
			first++;
		}
		System.out.println(count + " is a total strong number within " + e + " and " + last + " number.");

	}

	public static void armstrongNumber()
	{
		System.out.println("ARMSTRONG NUMBER WITHIN A GIVEN RANGE:");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int e = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		int count = 0;

		int first = e;

		while (first <= last)
		{
			int num = first;
			
			int i;

			int sum = 0;

			for (i=num;i>0;i/=10)
			{
				int rem = i %10;

				int raise = 3;

				int j;

				int power=1;

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
				count++;
			}
	/*		else
			{
				System.out.println(num + " is not a Armstrong number");
			}    */
			first++;
		}

		System.out.println(count + " is a total armstrong number within " + e + " and " + last + " number.");

	}

	public static void palindromeNumber()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("PALINDROME NUMBER WITHIN A GIVEN RANGE:");

		System.out.println("Enter a first number: ");

		int e = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		int count = 0;

		int first = e;

		while (first <= last)
		{
			int num =first;

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
				count++;
			}
		/*	else
			{
				System.out.println(num + " is not a palindrome number");
			} */
			first++;
		}
		System.out.println(count + " is a total palindrome number within " + e + " and " + last + " number.");

	}
	public static void sumRange()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("SUM OF THE NUMBERS WITHIN A GIVEN RANGE:");

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		int sum = 0;

		while (first <= last)
		{
			sum = sum + first;

			first++;
		}
		System.out.println(sum + " is a sum of the number having range between " + first + " and " + last + ".");

	}
	
	public static void firstLastDigit_InternalDigit()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("THE SUM OF THE FIRST AND LAST DIGIT AND INTERNAL DIGIT: ");

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		while (first<=last)
		{
			int num = first;

			int i = num%10;

			int sum = i;
	
			int sum1 = 0;

			num/=10;

			int temp = num;
		
			while (temp>0)
			{
				/*	while(temp<=9)
				{
					break;

				}*/
				
				if (temp<=9)
				{
					sum = sum + temp;
				}
			
				else
				{
					int rem = temp%10;
					sum1 = sum1 + rem;
				}
		
				temp/=10;			
			}
			System.out.println(sum + " is a sum of the first digit and last digit of the " + first + ".");
		
			System.out.println(sum1 + " is a sum of the internal digit of the " + first + ".");

			first++;
		}
	}

	public static void noZeroNumber()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("NO ZERO NUMBER: ");

		System.out.println("Enter a first number: ");

		int e = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		int first = e;

		int count = 0;

		while (first<=last)
		{
			int num = first;

			while(num>0)
			{
				int rem = num%10;

				if (rem==0)
				{
					break;
				}

				if (rem>0)
				{
					num/=10;
				}
				if (num==0)
				{
					System.out.println(first + " is a non-zero number.");
					count++;
				}
				
			}
			first++;
		}
		System.out.println(count + " are the total non-zero numbers between " + e + " and " + last + ".");

	}
}















