import java.util.Scanner;

class Return_Type_Prime
{

	public static boolean prime(int num){
		int i;

		for (i=2; i<=num; i++)
		{
			if (num%i==0)
			{
				break;
			}
		}

		if (num==i)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		int first = 1;

		int last= 200;

		for (int j=first;j<=last;j++){
		
			if (prime(j))
			{
				System.out.println(j + " is a prime number!");
			}
			else{
				System.out.println(j + " is not a prime number!");
			}

		}
	}

}
