class Narrowing 
{
	public static void main(String[] args) 
	{
		short a = 129;
		
		byte d = (byte) a;
		System.out.println(d);
		
		short b = (short) a;
		System.out.println(b);
		
		int c = (int) a;
		System.out.println(c);
		
		char e = (char) a;
		System.out.println(e);
		
		long f = (long) a;
		System.out.println(f);
		
		
	}
}
