package demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
			
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		
		Iterator<Integer> itr = alist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	

	}

}
