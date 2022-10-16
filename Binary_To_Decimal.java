import java.util.Scanner; 

class Binary_To_Decimal
{
	public static void main(String[] args) 
	{	
		Scanner a = new Scanner(System.in);

		System.out.println(" Enter a binary number: ");

		int i = a.nextInt();

		int num = i;

		String bin = " ";

		int count = 0;

		int sum = 0;


		while (num>0)
		{
			int rem = num%10;

			sum = sum + rem*power(2,count);

			num/= 10;

			count++;
		}
		System.out.println(" The conversion of binary number " + i + " to Decimal is : " +sum);

	}
		
	public static int power(int num, int count)
	{
		int power = 1;

		int size = count;

		for (int i = 1;i<=size ; i++)
		{
			power *= num;
		}
		return power;
	}	 		
}
