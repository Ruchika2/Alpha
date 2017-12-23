package helloworld;

public class Cat extends animal implements Toy{
	 public void getcolour()
	  {
		  System.out.println("my colour is black");
		  
	  }
	  public void makesound()
	  {
		  System.out.println("Wolf Wolf");
		  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy obj = new Cat();
		obj.getcolour();
		animal obj1=new Cat();
		obj1.makesound();
	}

}
  interface Toy{
	   public void getcolour();
	   
  }
    abstract  class animal{
	  abstract public void makesound();
	 
   }
  
  
  