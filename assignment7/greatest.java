import java.util.Scanner;
class greatest
{
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number as a string:");
		String n=reader.next();
		System.out.println("Enter other number as a string:");
		String m=reader.next();
		int x=Integer.valueOf(n);
		int y=Integer.valueOf(m);
		System.out.println("Greatest is :"+(x>y?x:y));
	}
}