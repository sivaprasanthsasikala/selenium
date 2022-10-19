
public class Animal1 {
	public void bark()
	{
		System.out.println("dog is barking");
	}
	public class Dog extends Animal1
	{
	public void eat()
	{
		System.out.println("dog is eating");
	}
	}
	public class LittleDog extends Dog
	{
		public void walk()
		{
		System.out.println("dog is walking");	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LittleDog ld=new LittleDog();

	}

}
