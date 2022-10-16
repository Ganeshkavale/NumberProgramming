import java.util.Scanner;

class Return_Type_Disarium_Number
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

		for (int i = 1;i<=raise;raise--)
		{
			power*=rem1;
			
		}
		return power;

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();
		
		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		for (int i=first;i<=last;i++){

			if (arm(i)){
				System.out.println(i + " is a Disarium number!");
			}
			else{
				System.out.println(i + " is not a Disarium number!");
			}
					
		}

	}	
}
