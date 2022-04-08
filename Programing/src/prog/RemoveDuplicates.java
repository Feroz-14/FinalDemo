package prog;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String x="summary";
		char y[]=x.toCharArray();
		int size=y.length;
		Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldvalue=map.get(y[i]);
				int newvalue=oldvalue+1;
				map.put(y[i], newvalue);
			}
			i++;
		}
		Set<Map.Entry<Character,Integer>>hmap=map.entrySet();
		for(Map.Entry<Character,Integer>data:hmap)
		{
			System.out.print(data.getKey());
		}
	}
}
