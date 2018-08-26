import java.util.Scanner;
public class waveform
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
		for(int i=0,j=1;j<a.length&&i<a.length;i+=2,j+=2)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("After waveforming:");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
}