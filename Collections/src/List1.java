import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(4);
		li.add(5);
		li.add(1);
		System.out.println(li);//12451
		li.remove(0);//2451
		System.out.println(li);
		li.remove(2);//241
	    System.out.println(li);
	    
		Iterator itr=li.iterator();
		
		System.out.println(itr.hasNext());//boolean
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

//int a[]= {1,2,3,4};