import java.util.Scanner; 

class Decimal_To_Hexamdecimal_1											
{
	public static void main(String[] args) 
	{	
		Scanner a = new Scanner(System.in);

		System.out.println(" Enter a binary number: ");

		int i = a.nextInt();

		int sum = i;

		String bin = " ";

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
}
