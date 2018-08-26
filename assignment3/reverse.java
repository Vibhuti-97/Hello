import java.util.Scanner;
public class reverse
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number:");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int rev=0,s;
		while(n>0)
		{
			s=n%10;
			rev=(rev*10)+s;
			n/=10;
		}
		System.out.println("Reverse of number is:"+rev);
	}
}