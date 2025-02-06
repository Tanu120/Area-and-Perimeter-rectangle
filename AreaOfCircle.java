import java.util.Scanner;
class  AreaOfCircle
{
	public static void main(String[] args) 
	{
		System.out.println("ENTER RADIUS (IN CM): ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double pi = 22.0/7.0;
		double a = pi*r*r;
		double p = 2*pi*r;
		System.out.println("AREA: "+a);
		System.out.println("PERIMETER: "+p);
	    
	}
	
}

        