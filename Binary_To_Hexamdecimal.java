import java.util.Scanner; 

class Binary_To_Hexamdecimal											// We need to convert first binary to decimal and then that decimal number to hexadecimal.
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

		while(sum>0)
		{
			int hexa = sum%16;

			if (hexa==10)
			{
				bin = hexa + "A";
			}
			else if (hexa==11)
			{
				bin = hexa + "B";
			}
			else if (hexa==12)
			{
				bin = hexa + "C";
			}
			else if (hexa==13)
			{
				bin = hexa + "D";
			}
			else if (hexa==14)
			{
				bin = hexa + "E";
			}
			else if (hexa==15)
			{
				bin = hexa + "F";
			}
			else
			{
				bin = hexa + " ";
			}
			sum/=16;
		}
		System.out.println(" The conversion of binary number " + i + " to Hexadecimal is : " + bin);

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
