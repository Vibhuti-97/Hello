interface Animals
{
	public void eat();
	public void speak();
}
class Cat implements Animals
{
	public void eat()
	{
		System.out.println("Milk");
	}
	public void speak()
	{
		System.out.println("Meow");
	}
}
class Dog implements Animals
{
	public void eat()
	{
		System.out.println("Meat");
	}
	public void speak()
	{
		System.out.println("Bark");
	}
}
class interfaces
{
	public static void main(String[] args)
	{
		Cat ob = new Cat();
		Dog ob1 = new Dog();
		ob.eat();
		ob.speak();
		ob1.eat();
		ob1.speak();
	}
}