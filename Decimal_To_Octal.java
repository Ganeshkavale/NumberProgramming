import java.util.Scanner; 

class Decimal_To_Octal
{
	public static void main(String[] args) 
	{	
		Scanner a = new Scanner(System.in);

		System.out.println(" Enter a number: ");

		int i = a.nextInt();

		int num = i;

		String bin = "";

		while (num>0)
		{
			int rem = num%8;

			bin = rem + bin;

			num/= 8;
		}

		System.out.println(" The conversion of Decimal number " + i + " to Octal is : " + bin);
		 
		
	}
}
