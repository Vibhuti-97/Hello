abstract class Animals
{
	public String color,name,breed;
	abstract void eat();
	Animals()
	{
		color="White";
		name="";
		breed="";
	}
	public void speak()
	{
		System.out.println("Speaking!");
	}
}
class Dog extends Animals
{
	public void eat()
	{
		System.out.println("Meat");
	}
	public void speak()
	{
		System.out.println("Bark");
		name="Tommy";
		breed="Labrador";
		System.out.println("Color:"+color+" Name:"+name+" Breed:"+breed);
	}
}
class abstractclass
{
	public static void main(String[] args)
	{
		Dog ob = new Dog();
		ob.eat();
		ob.speak();
	}
}