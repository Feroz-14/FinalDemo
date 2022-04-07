package prog;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int temp;
		System.out.println("A:" + a);
		System.out.println("B:" + b);
		System.out.println("------------------------------");
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swaping A:" + a);
		System.out.println("After Swaping B:" + b);
	}

}
