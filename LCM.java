class LCM
{
	public static void main(String[] args) 
	{

		int a = 6;

		int b = 13;

		int large = a>b ? a : b;
		
		while (true)
		{
			if (large%a == 0 && large%b == 0)
			{
				System.out.println(large);
				
				break;
			}
			large++;

		}
		
	}
}
