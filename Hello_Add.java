class Hello_Add
{
	public static void main(String[] args) 
	{

		int num = 12345;

		int count = 0;

		int sum = 1;

		int rem;



		int num1 = 12345;

		int count1 = 0;

		int sum1 = 1;

		int rem1;

		

		while (num > 0)
		{
			rem = num%10;

			System.out.println(rem);

			num/= 10;

			count++;

			sum +=rem;

		}
		System.out.println("The sum is: " + sum);

		System.out.println("The sum is: " + count);


		while (num1 > 0)
		{
			rem1 = num1%10;

			System.out.println(rem1);

			num1/= 10;

			count1++;

			sum1 *=rem1;

		}
		System.out.println("The sum is: " + sum1);

		System.out.println("The sum is: " + count1);


		do 
		{
			rem1 = num1%10;

			System.out.println(rem1);

			num1/= 10;

			count1++;

			sum1 +=rem1;

		}
		while (num > 0);

		System.out.println("The sum is: " + sum1);

		System.out.println("The sum is: " + count1);





	}
}
