class Vechile
{
	Vechile()
	{
		System.out.println("Default of vechile");
	}
	Vechile(int x)
	{
		this();
		System.out.println("Parameterised of vechile");
	}
	void stop()
	{
		System.out.println("Stop of vechile");
	}
}
class cons
{
	public static void main(String[] args)
	{
		Vechile ob = new Vechile(12);
		ob.stop();
	}
}