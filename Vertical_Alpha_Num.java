import java.util.Scanner;

class Vertical_Alpha_Num
{
	public static void main(String[] args) 
	{	
		

		int num = 1;

		

		char ch = 'a';

		

		for (int i=1;i<=4 ;i++ )
		{
			
			for (int j = 1;j<= 2 ;j++ )
			{
				if (j<2)
				{
					System.out.print(ch + " ");
					System.out.print(num + " ");
				}
				else 
				{
					int temp =num+4;

					int asc=(int)ch;

					int temp1= asc + 4;

					char temp2 = (char)temp1;
					
					System.out.print(temp2 + " ");
					System.out.print(temp + " ");
				}
			}

			System.out.println();
			num++;
			ch++;
		}



	}

}

		
		