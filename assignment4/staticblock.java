class Abc
{
	static int count;
	int x;
	static
	{
		count=10;
	}
	Abc()
	{
		x=0;
	}
	void update()
	{
		x=count;
		System.out.println("Updated value of x is:"+x);
	}
}
class staticblock
{
	public static void main(String[] args)
	{
		Abc ob=new Abc();
		ob.update();
		System.out.print("Static value is:"+ob.count);
	}
}