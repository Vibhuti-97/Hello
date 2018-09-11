import java.util.Scanner;
public class substring
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=reader.nextLine();
		System.out.println("Sub-Strings are:");
		for(int i=0;i<str.length();i++)
			System.out.println(str.substring(i,str.length()));
	}
}