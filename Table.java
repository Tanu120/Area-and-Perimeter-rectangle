import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("LIMIT");
		int b = sc.nextInt();
		for(int i=1;i<=b ;i++ )
		{
			System.out.println(a+"X"+b+"="+(a*b));
		}
	int d = 1;	
	for (char a ='A';a<='Z' ;a+=d )
	{
		System.out.println(a);
		d++;
	}
	}
}
