class Widening
{
	public static void main(String[] args) 
	{
		byte a = 10;
		System.out.println(a);
		//10
		
		short h = a;
		System.out.println(h);
		
		int b = a;
		System.out.println(b);
		//11
		
		long c = a;
		System.out.println(c);
		//12
		
		float d = a;
		System.out.println(d);
		//13.0
		
		double e = a;
		System.out.println(e);
		//14.0
		
		char f = a;
		System.out.println(f);
		//compile time error
		
	}
}
