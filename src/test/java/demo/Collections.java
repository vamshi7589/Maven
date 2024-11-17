package demo;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>  alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
//		System.out.println(alist.get(0));
		
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}

		for(Integer e : alist)
		{
			System.out.println(e);
		}
	}

}
