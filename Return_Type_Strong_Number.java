import java.util.Scanner;

class Return_Type_Strong_Number
{
	public static boolean strong(int temp){

		int num = temp;

		int sum=0;
		while (num>0){

			int rem=num%10;

			num/=10;

			sum = sum + factorial(rem);
		}
		
		if (sum==temp){

			return true;
		}

		else{
			return false;
		}

	}		
	
	public static int factorial(int rem1){

		int f=1;

		for (int i = rem1; i>0 ; i-- )
		{
			f*=i;
		}
		return f;

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		for (int i=first;i<=last;i++){

			if (strong(i)){
				System.out.println(i + " is a strong number!");
			}
			else{
				System.out.println(i + " is not a strong number!");
			}
					
		}

	}

	
}
