import java.util.Scanner;
import java.lang.*;
public class armstrong
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number:");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int arm=0,p=n,len=0,q=n,s;
		while(n>0)
		{
			len++;
			n/=10;
		}
		while(p>0)
		{
			s=p%10;
			arm+=Math.pow(s,len);
			p/=10;
		}
		if(arm==q)
		System.out.println("The number is armstrong!");
		else
		System.out.println("The number is not armstrong!");
	}
}