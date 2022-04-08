package pack;

class Demo {
	public void m1(int i) {
		System.out.println(i);
	}

	public void m2(int i, int j) {
		System.out.println(i + j);
	}
}

public class MethodOverRiding {

	public void m1(int i) {
		System.out.println(i);
	}

	public void m2(int i, int j) {
		System.out.println(i + j);
	}

	public static void main(String[] args) {
		MethodOverRiding m = new MethodOverRiding();
		m.m1(20);
		m.m2(20, 30);

		Demo d = new Demo();
		d.m1(20);
		d.m2(10, 15);
	}
}
