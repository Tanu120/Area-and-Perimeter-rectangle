import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		
		System.out.print("NUMBER: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println((a==2||a==3||a==5)?(a+" PRIME"):((a%2==0||a%3==0||a%5==0)?(a+" no prime"):(a+" prime")));
	}
}
