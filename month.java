import java.util.Scanner;
class  month
{
	public static void main(String[] args) 
	{
		System.out.println(" MONTHS ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int y = m/12;
		double r = (m%12)/10.0;
		System.out.println(" MONTHS "+m);
		System.out.println(" YEARS "+(y+r));
		
	}
}
