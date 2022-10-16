import java.util.Scanner;

public class RangeOfNumberFactorsSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number: ");		
		int first = sc.nextInt();		
		System.out.println("Enter a last number: ");
		int last = sc.nextInt();
		
		for(int i = first; i <= last ; i++) {
			factorsSum(i);
		}	
	}
	public static void factorsSum(int num) {
		int sum = 0,c=0;
		for(int i = 1; i <= num ; i++) {
			if(num%i == 0) {
				sum = sum + i;
				c++;
				if(c==countDigit(num)) {
				System.out.println("The factor of " + num + " is: ");
				System.out.print(i + " " + " ");
				}
			}
		}
		System.out.println("The sum of the factors of " + num + " is: " + sum);
	}
	public static int countDigit(int num) {
		int c = 0;
		for(int i = num; i > 0 ; i /= 10) {
			c++;
		}
		return c;
	}

}
