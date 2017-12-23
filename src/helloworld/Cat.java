package helloworld;

public class Cat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy obj = new Demo();
		obj.getcolour();
		Toy obj1=new Demo();
		obj1.makesound();
	}

}
  interface Toy{
	   public void getcolour();
	   public void makesound();
  }
  
  
  class Demo implements Toy{
	  public void getcolour()
	  {
		  System.out.println("my colour is black");
		  
	  }
	  public void makesound()
	  {
		  System.out.println("Wolf Wolf");
		  
	  }
	  
  }