import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer,String>map=new LinkedHashMap<>();
      
      map.put(1,"Ravi");
      map.put(2, "demo");
      map.put(3, "Hello");
      map.put(3, "feroz");
      
      Set<Map.Entry<Integer,String>>mapp=map.entrySet();
      for(Map.Entry<Integer, String> data :mapp)
      {
    	  System.out.println(data.getKey());
    	 // System.out.println(data.getValue());
      }
	}

}
