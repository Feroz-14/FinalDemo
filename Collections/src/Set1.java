import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		
		Set<Integer>s=new HashSet<Integer>();
		s.add(1);
		s.add(1);
		s.add(9);
		s.add(5);
		s.add(3);
		s.add(15);
		s.add(3);
		System.out.println(s);//1 9 5 3 15  //1 3 5 9 15
		s.remove(3);
		System.out.println(s);
	}
}
