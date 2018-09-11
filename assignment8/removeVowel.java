import java.util.Scanner;
public class removeVowel
{
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=reader.nextLine();
		char[] a=str.toCharArray();
		char[] a1=new char[a.length];
		int i,j=0;
		char temp;
		for(i=0;i<a.length;i++)
		{
			if(a[i]!='a'&&a[i]!='e'&&a[i]!='i'&&a[i]!='o'&&a[i]!='u')
			{
				a1[j]=a[i];
				j++;
			}
		}
		System.out.println("New String is:");
		for(i=0;i<j;i++)
			System.out.print(a1[i]);
	}
}