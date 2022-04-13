package pack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		List<String>list=new ArrayList<String>();
		list.add("Hello");
		list.add("Demo");
		list.add("Feroz");
		System.out.println(list);
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		System.out.println(list);
	}

}
