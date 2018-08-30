abstract class Vechile
{
	abstract void start();
	void stop()
	{
		System.out.println("Stop of vechile");
	}
}
class Twowheeler extends Vechile
{
	void start()
	{
		System.out.println("Start of twowheeler");
	}
}
class Fourwheeler extends Vechile
{
	void start()
	{
		System.out.println("Start of fourwheeler");
	}
}
class lastq
{
	public static void main(String[] args)
	{
		Twowheeler ob = new Twowheeler();
		Fourwheeler ob1 = new Fourwheeler();
		ob.start();
		ob.stop();
		ob1.start();
		ob1.stop();
	}
}