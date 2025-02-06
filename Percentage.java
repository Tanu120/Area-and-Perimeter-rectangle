class Percentage 
{
	public static void main(String[] args) 
	{
		System.out.println("MARKS: ");
		int m = 457;
		double p = (m*100)/600;
		System.out.println("PERCENTAGE: "+p);
		String a = (p>=35&&p<=100)?((p>=75&&p<=100)?("A GRADE"):((p>=60&&p<=75)?("B GRADE"):((p>=35&&p<=60)?("C GRADE"):("FAIL")))):("FAIL");
		System.out.println(a);
	}
}
