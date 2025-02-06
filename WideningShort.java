class WideningShort
{
	public static void main(String[] args) 
	{
		//byte g = 128;
		//System.out.println(g);
		//compile time error lossy conversion
		
		short a = 128;
		System.out.println(a);
		
		int b = a;
		System.out.println(b);
		//128
		
		long c = a;
		System.out.println(c);
		//128
		
		float d = a;
		System.out.println(d);
		//128.0
		
		double e = a;
		System.out.println(e);
		//128.0
		
		//char f = a;
		//System.out.println(f);
		//compile time error
		
	}
}
