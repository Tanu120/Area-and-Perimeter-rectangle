import java.util.Scanner;
class CelsiusToFahrenheit 
{
	public static void main(String[] args) 
	{
		System.out.println("DEGREE CELSIUS: ");
		Scanner rd =new Scanner(System.in);
		double c = rd.nextDouble() ;
		double f = (9.0/5)*c+32;
		
		System.out.println("FAHRENHEIT: "+f);
	}
}
