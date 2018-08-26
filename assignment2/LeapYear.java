import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the year:");
		int x=reader.nextInt();
		if(x%4==0)
		System.out.println("Leap year!");
		else
		System.out.println("Not a leap year!");
	}
}