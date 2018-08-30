final class Vechile
{
	void stop()
	{
		System.out.println("Can't be further extended");
	}
}
class final1
{
	public static void main(String[] args)
	{
		Vechile ob = new Vechile();
		ob.stop();
	}
}