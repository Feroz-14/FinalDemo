package pack;

class ParentDog
{
	public void eat()
	{
		System.out.println("eatting");
	}
}
class ChildDog extends ParentDog
{
	public void sleep()
	{
		System.out.println("sleeping");
		System.out.println("barking");
	}
}

public class Inheritance extends ChildDog{

	public static void main(String[] args) {
		
		ChildDog c=new ChildDog();
		c.eat();
		c.sleep();
	}
}
