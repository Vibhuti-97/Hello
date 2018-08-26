import java.util.Scanner;
public class primeseries
{
	public static void main(String[] args)
	{
		System.out.println("Enter the value of n:");
		int i,j,c;
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		System.out.println("The prime numbers are:");
		for(i=1;i<=n;i++)
		{
			for(j=1,c=0;j<=i;j++)
			{
				if(i%j==0)
				c++;
			}
			if(c==2)
			System.out.println(i);
		}
	}
}