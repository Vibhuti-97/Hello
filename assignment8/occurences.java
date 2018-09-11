import java.util.Scanner;
public class occurences
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=reader.nextLine();
		System.out.println("Enter the other string to be searched:");
		String str1=reader.nextLine();
		if(str.contains(str1))
			System.out.println("String is present");
		else
			System.out.println("String is not present");
	}
}