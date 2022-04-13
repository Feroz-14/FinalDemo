import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {

		List<String> li = new LinkedList<String>();
		li.add(null);
		li.add(null);
		li.add("Feroz");
		li.add("Feroz");
		li.add("Demo");
		System.out.println(li);// null null feroz feroz demo
		li.remove(0);//null,feroz,feroz,demo
		li.remove(1);//null,feroz,demo
		Iterator i=li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
