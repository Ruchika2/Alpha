package helloworld;

public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               System.out.println("Hello world alpha");
               Animal obj=new Dog();
               obj.makesound();
	}

}

abstract class Animal{
	public abstract void makesound();
	
}

class Dog extends Animal{
	public void makesound(){
		System.out.println("Woof woof");
	}
}
