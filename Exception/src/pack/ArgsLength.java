package pack;

public class ArgsLength {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("open sts");
			int n=args.length;
			System.out.println(n);
			System.out.println(n/0);
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);	
		}
	}
}
