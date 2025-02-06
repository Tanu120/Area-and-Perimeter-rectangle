class For 
{
	public static void main(String[] args) 
	{
		for (int i=1; i <= 10 ;i++ )
		{
			System.out.print(i);
		}
		
		for (char i='A'; i <= 'Z' ;i++ )
		{
			
			System.out.println();
			System.out.println(i);
		}
		
		for (char i='z'; i <= 'a' ;i-- )
		{
			
			System.out.println();
			System.out.print(i);
		}
		
		for (char i='0'; i <= '9' ;i++ )
		{
			
			System.out.println();
			System.out.print(i);
		}
		
		for (int i= 0; i <= 127 ;i++ )
		{
			System.out.println();
			System.out.print(i+":"+((char)i));
		}
	}
}
