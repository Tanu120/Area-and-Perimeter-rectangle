import java.util.Scanner;
class 36 
{
	public static void main(String[] args) 
	{
		
		System.out.println("ENTER: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = ((a%2==0)&&(a%5==0))?("HI TWO HI FIVE"):((a%2==0)?("HI TWO"):((a%5==0)?("HI FIVE" ):("    ")));
		System.out.println(b);
	}
		
}
