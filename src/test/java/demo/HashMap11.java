package demo;

import java.util.HashMap;

public class HashMap11 {

	public static void main(String[] args) {
		
		
		HashMap<String, Object> hmap = new HashMap<String,Object>();
		hmap.put("Name", "vamshi");
		hmap.put("Age", "123");
	//	hmap.put("Age", "234");
		hmap.put("Age2", "123");
		
		for(String k : hmap.keySet())
		{
		//	System.out.println(k);
			System.out.println(hmap.get(k));
		}
		
		
	}

}
