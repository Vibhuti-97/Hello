class Animal
{
	String breed,color;
	void speak()
	{
		System.out.println("Anonymous");
	}
}
class Dog extends Animal
{
	void speak()
	{
		System.out.println("Bark");
	}
}
class Cat extends Animal
{
	void speak()
	{
		System.out.println("Meow");
	}
}
class q2
{
	public static void main(String[] args)
	{
		Dog ob = new Dog();
		Cat ob1 = new Cat();
		ob.speak();
		ob1.speak();
	}
}