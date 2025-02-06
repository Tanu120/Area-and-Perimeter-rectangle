import java.util.Scanner;
class  Vowel
{
	public static void main(String[] args) 
	{
		
		System.out.println("ENTER: ");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		String b = ((a>='A' && a<='Z')||(a>='a' && a<='z'))?((a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')?("VOWEL"):("CONSONENT")):("NOT A ALPHABET") ;
		System.out.println(b);
		}
}
