import java.util.Scanner;
public class reverse
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=reader.nextLine();
		char[] a=str.toCharArray();
		int i,j;
		char temp;
		for(i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("New String is:");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
}