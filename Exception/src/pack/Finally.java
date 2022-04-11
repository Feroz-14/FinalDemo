package pack;

public class Finally {

	public static void main(String[] args) {
      
		int a=3;
		try {
		System.out.println(a+8);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error");
			System.exit(0);
		}
		finally
		{
			System.out.println("Always Excecuted");
		}
 }
}
	
