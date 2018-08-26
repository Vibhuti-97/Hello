import java.util.Scanner;
public class Sum
{
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=reader.nextInt();
		System.out.println("Enter the number:");
		int y=reader.nextInt();
		System.out.println("The sum of the numbers:"+(x+y));
	}
}