class geometry
{
	int side;
	geometry()
	{
		side=5;
	}
	void print()
	{
		System.out.println("The area of square is:"+(side*side));
		}
	void print(int l)
	{
		System.out.println("The new area of square is:"+(l*l));
	}
	void print(double l)
	{
		System.out.println("The new area of square is:"+(l*l));
	}
}
class overload
{
	public static void main(String[] args)
	{
		geometry ob=new geometry();
		ob.print();
		ob.print(10);
		ob.print(10.9);
	}
}