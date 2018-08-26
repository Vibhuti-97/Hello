import java.util.Scanner;
public class pallindrome
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number:");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int rev=0,s,p=n;
		while(n>0)
		{
			s=n%10;
			rev=(rev*10)+s;
			n/=10;
		}
		if(rev==p)
		System.out.println("Pallindrome number");
		else
		System.out.println("Not a pallindrome number");
	}
}