import java.util.Scanner;

class Num_Odd_Even
{
	public static void main(String[] args) 
	{		
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a first number: ");

		int num = a.nextInt();

		System.out.println("Enter a last number: ");

		int last = a.nextInt(); 

		int first = num;

		while (first <= last)		
		{
			System.out.println(first);	
			
			for (int i=first;i > 0 ;i/=10 )
			{
						
					int rem = i%10;

					if (rem%2 != 0)
					{
			
						System.out.println(rem + " is a odd number.");
					}
					else
					{
			
						System.out.println(rem + " is a even number.");
					}
				
			 } 
			 first++;

		}

	}

}
