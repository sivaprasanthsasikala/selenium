
class WaterAnimal
{
	public void eat()
	{
		System.out.println("dog is eating");
	}
}
class Dog extends WaterAnimal
{
	public void bark()
	{
		System.out.println("dog is barking");
	}
}
 class LittleDog extends WaterAnimal
{
	public void walk()
	{
		System.out.println("dog is walkking");
	}
	
}












public class TestInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LittleDog ld=new LittleDog();
		ld.eat();
		ld.walk();
		

	}

}
