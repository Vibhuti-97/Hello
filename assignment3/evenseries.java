import java.util.Scanner;
public class evenseries
{
	public static void main(String[] args)
	{
		System.out.println("Enter the value of n:");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		System.out.println("The even numbers are:");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
	}
}