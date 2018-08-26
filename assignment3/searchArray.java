import java.util.Scanner;
public class searchArray
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array:");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int flag=0;
		System.out.println("Enter the elements of array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=reader.nextInt();
		System.out.println("Enter the element to search:");
		int ele=reader.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(ele==a[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		System.out.println("Element is present in array!");
		else
		System.out.println("Element is not present in array!");
	}
}