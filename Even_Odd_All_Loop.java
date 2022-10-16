import java.util.Scanner;

class Even_Odd_All_Loop
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner (System.in);

		System.out.println("Enter first number: ");

		int first = a.nextInt();

		System.out.println("Enter last  number: ");

		int last = a.nextInt();

		
		System.out.println("ENTER FIRST NUMBER FOR do while loop: ");

		int first1 = a.nextInt();

		System.out.println("ENTER LAST NUMBER FOR do while loop : ");

		int last1 = a.nextInt();

		
		System.out.println("ENTER FIRST NUMBER FOR for loop: ");

		int first2 = a.nextInt();

		System.out.println("ENTER LAST NUMBER FOR for loop : ");

		int last2 = a.nextInt();


		int count = 0; 

		int count1 = 0;

		int count2 = 0;

		int count3 = 0;

		int count4 = 0;

		while (first <= last)
		{
			if (first%2 == 0)
			{
				System.out.println("It is a even number: " + first);
				first++;
				count++;
			
			}
			else if (first%2 == 1)
			{
				System.out.println("It is a odd number: " + first);
				first++;
				count1++;
				

			}

		}

		System.out.println("The total count of even number using while loop are: " + count);

		System.out.println("The total count of odd number using while loop are: " + count1);

		do
		{
			if (first1%2 == 0)
			{
				System.out.println("It is a even number: " + first1);
				first1++;
				count2++;
				
			}
			else if (first1%2 == 1)
			{
				System.out.println("It is a odd number: " + first1);
				first1++;
				count3++;
				

			}
		}
		while (first1<=last1);
		
		System.out.println("The total count of even number using do while loop are: " + count2);

		System.out.println("The total count of odd number using do while loop are: " + count3);

		for (int start = first2;start<= last2 ;start++)
		{
			if (start%2 == 0)
			{
				System.out.println("It is a even number: " + start);
				start++;
				count3++;
				
			}
			else if (start%2 == 1)
			{
				System.out.println("It is a odd number: " + start);
				start++;
				count4++;
				

			}
		}
		
		
		System.out.println("The total count of even number using for loop are: " + count3);

		System.out.println("The total count of odd number using for loop are: " + count4);
		
	}
}