import java.util.Scanner;
class MinutesToYears 
{
	public static void main(String[] args) 
	{
		System.out.println("MINUTES: ");
		Scanner sc = new Scanner(System.in);
		long m = sc.nextLong();
		
		long y = m/(365*24*60); //number of years
		long r = m%(365*24*60);// checking if extra minutes left 
		long t = r/(60*24);// calculating extra days
		
		System.out.println("THERE ARE "+m+" MINUTES IN "+y+" YEAR "+t+" DAYS" );
		
		
	}
}
