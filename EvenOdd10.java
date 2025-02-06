import java.util.Scanner;
class EvenOdd10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = n%2==0 ? "EVEN" : "ODD";
		System.out.println(a);
	}
}
