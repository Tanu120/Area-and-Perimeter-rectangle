class ConditionalOperator 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 100;
		int a = 1;
		int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(lar);
	}
}
