import java.util.Scanner;
class VerifyLeapYear
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int year;
		System.out.println("enter the year to check");
		year=in.nextInt();
		if (year%4==0 && year%100!=0 || year%400==0)
		{
				System.out.println("entered year is a leap year");
		}
		else
		{
			System.out.println("entered year is not a leap year");
		}
	}
}