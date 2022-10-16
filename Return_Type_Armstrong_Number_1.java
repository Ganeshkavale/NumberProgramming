import java.util.Scanner;

class Return_Type_Armstrong_Number_1
{
	public static boolean arm(int temp){

		int num = temp;

		int sum=0;
		while (num>0){

			int rem=num%10;

			num/=10;

			sum = sum + power(rem);
		}
		
		if (sum==temp){

			return true;
		}

		else{
			return false;
		}

	}		
	
	public static int power(int rem1){

		int power=1;

		int raise = 3;

		for (int i = 1;i<=raise;i++)
		{
			power*=rem1;
		}
		return power;

	}

	public static void main(String[] args) 
	{
		int first = 150;

		int last = 160;

		for (int i=first;i<=last;i++){

			if (arm(i)){
				System.out.println(i + " is a Armstrong number!");
			}
			else{
				System.out.println(i + " is not a Armstrong number!");
			}
					
		}

	}

	
}
