import java.util.Scanner;
public class Complex
{
	int real,imag;
	void display()
	{
		System.out.println("The Complex number is: "+real+"+"+imag+"i");
	}
	public static void main(String[] args)
	{
		Complex ob=new Complex();				
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the real part:");
		ob.real=reader.nextInt();
		System.out.println("Enter the imaginary part:");
		ob.imag=reader.nextInt();
		ob.display();
	}
}