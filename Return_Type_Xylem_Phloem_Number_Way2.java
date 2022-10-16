import java.util.Scanner;

class Return_Type_Xylem_Phloem_Number_Way2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first number: ");

		int first = sc.nextInt();

		System.out.println("Enter a last number: ");

		int last = sc.nextInt();

		for (int i=first;i<=last;i++){

			if (outer(i)==inner(i)){
				System.out.println(i + " is a Xylem number!");
			}
			else{
				System.out.println(i + " is Phloem number!");
			}
					
		}

	}
	public static int outer(int temp){

		int num = temp;

		int rem = num%10;

		int sum= rem;

		num/=10;

		while (num>0){

			if (num<=9){
				sum = sum + num;
			}
			num/=10;
		}
		return sum;
	}

	public static int inner(int temp){

		int num = temp;

		int sum1 = 0;

		num/=10;

		while (num>9){

				int rem1 = num%10;

				sum1 = sum1 + rem1;

				num/=10;
			}
			return sum1;
	}

}
