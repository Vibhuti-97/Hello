class Vechile
{
	void stop()
	{
		System.out.println("Stop of vechile");
	}
}
class Twowheeler extends Vechile
{
	void start()
	{
		super.stop();
		System.out.println("Start of twowheeler");
	}
}
class invoke
{
	public static void main(String[] args)
	{
		Twowheeler ob = new Twowheeler();
		ob.start();
	}
}