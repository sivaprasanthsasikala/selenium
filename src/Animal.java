
 class Animal {
	
	public void eat()
	{
		System.out.println("eating successfully");
	}
	
	 class Dog extends Animal
	{
		public void bark()
		{
			System.out.println("dog is barking");
		}
	 

	 

	 
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.bark();
		dog.eat();

	

}
}
 }