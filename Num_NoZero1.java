import java.util.Scanner;

class Num_NoZero1
{
	public static void main(String[] args) 
	{

		Scanner a = new Scanner(System.in);

		System.out.println(" Enter a number: ");

		int num = a.nextInt();

		int temp = num;

		while (temp>0)
		{
			int rem = temp%10;

			if (rem ==0)
			{
				break;
			}

			if (rem!=0)
			{
				temp/=10;
			}

			if (temp==0)
			{
				System.out.println(num);
			}
		}
		
	}
}
