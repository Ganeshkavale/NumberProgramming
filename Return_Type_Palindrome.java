import java.util.Scanner;

class Return_Type_Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		for (int i=first;i<=last;i++){

			if (i ==palindrome(i)){
				System.out.println(i + " is a Palindrome number!");
			}
			else{
				System.out.println(i + " is not a Palindrome number!");
			}
					
		}

	}
	public static int palindrome(int num){

		int reverse = 0;

		while (num>0){

			int rem = num%10;

			reverse = (reverse * 10) + rem;

			num/=10;
		}
		return reverse;
	}

}
