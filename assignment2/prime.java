import java.util.Scanner;
public class prime
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number:");
		int i,c;
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		for(i=1,c=0;i<=n;i++)
		{
			if(n%i==0)
			c++;
		}
		if(c==2)
			System.out.println(n+" is a prime number!");
		else
			System.out.println(n+" is not a prime number!");
	}
}