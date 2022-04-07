package prog;

public class ReverseString {

	public static void main(String[] args) {

		String a = "Pragathi";
		char y[] = a.toCharArray();
		int size = y.length;
		char b[] = new char[size];
		int i = 0;
		while (i != size) {
			b[size - 1 - i] = y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(b);
	}
}
