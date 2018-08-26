import java.util.Scanner;
public class sortArray
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array:");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int temp;
		System.out.println("Enter the elements of array:");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=reader.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting:");
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
}