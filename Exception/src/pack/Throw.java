package pack;

public class Throw {

	public  void demo()
	{
		try
		{
			System.out.println("insideMethod");
			throw new NullPointerException("MyData");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Throw t=new Throw();
		t.demo();
	}
}