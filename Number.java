import java.util.Scanner;
class Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int dup = a;
		int sum = 0;
		
		while (a>0)
		{
			int rem = a%10;
			sum += rem;
			a /= 10;
		}
		System.out.println(sum);
		
	
	}
}
