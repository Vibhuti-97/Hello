import java.util.Scanner;
public class wordcount
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=reader.nextLine();
		str=str.trim();
		char[] a=str.toCharArray();
		int i,j=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==' ')
			j++;
		}
		System.out.println("Number of words are:"+(j+1));
	}
}