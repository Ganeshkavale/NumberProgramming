class Multi_Count_While
{
	public static void main(String[] args) 
	{

		int a = 12345;

		int count = 0;
		
		int multi = 1;

		while (a>0)
		{
			int rem = a%10;

			System.out.println(rem);

			a/= 10;

			multi *=rem;

			count++;

		}
		System.out.println("The sum of individual digit of given number is: " + multi);

		System.out.println("The total count is: " + count);
	}
}
