package pack;

public class MethodOverLoading {

	public void add(int i) {
		System.out.println(i);
	}

	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void add(int i, int j, int k) {
		System.out.println(i + j - k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoading m = new MethodOverLoading();
		m.add(12);
		m.add(12, 20);
		m.add(12, 30, 10);
	}

}
