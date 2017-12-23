package helloworld;

public class Cat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy obj = new Demo();
		obj.getcolour();
	}

}
  interface Toy{
	   public void getcolour();
  }
  
  
  class Demo implements Toy{
	  public void getcolour()
	  {
		  System.out.println("my colour is black");
	  }
	  
  }