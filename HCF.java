class HCF
{
	public static void main(String[] args) 
	{
2
		int a = 6;

		int b = 48;

		int small = a<b ? a : b;
		
		while (true)
		{
			if (small%a == 0 && small%b == 0)
			{
				System.out.println(small);
				
				break;
			}
			small--;

		}
		
	}
}
