import java.util.Scanner;
public class Rectangle
{
	int length,breadth;
	void calculateArea()
	{
		System.out.println("The area of rectangle is:"+(length*breadth));
	}
	public static void main(String[] args)
	{
		Rectangle ob=new Rectangle();				
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the length:");
		ob.length=reader.nextInt();
		System.out.println("Enter the breadth:");
		ob.breadth=reader.nextInt();
		ob.calculateArea();
	}
}