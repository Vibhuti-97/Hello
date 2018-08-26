import java.util.Scanner;
public class greatestofthree
{
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=reader.nextInt();
		System.out.print("Enter the number:");
		int b=reader.nextInt();
		System.out.print("Enter the number:");
		int c=reader.nextInt();
		int x=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("The greatest of three numbers :"+x);
	}
}