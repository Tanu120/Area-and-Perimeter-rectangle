import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("    CURRENCY CONVERTER    ");
		System.out.println();
		System.out.println(" ENTER:(INR)");
		System.out.println();
		float inr = sc.nextFloat();
		System.out.println();
		System.out.println("****LIST****");
		System.out.println("1: USD ");
		System.out.println("2: EURO " );
		System.out.println("3: GBP ");
		System.out.println("4: PKR ");
		System.out.println();
		System.out.println("CURRENCY");
		String c = sc.next().toUpperCase();
		
		float cc = 0;
		if (c.equals("USD"))
		{
			cc = inr/86.56f;
			System.out.print(inr+" inr = "+cc+" USD ");
		}
		else if (c.equals("EUR"))
		{
			cc = inr/90.25f;
			System.out.print(inr+" inr = "+cc+" EURO ");
		}
		else if (c.equals("GBP"))
		{
			cc = inr/107.66f;
			System.out.print(inr+" inr = "+cc+" POUNDS ");
		}
		else if (c.equals("PKR"))
		{
			cc = inr*3.322f;
			System.out.print(inr+" inr = "+cc+" PKR ");
		}
		else 
			
		
		
		
	}
}
