package demo;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("arun");
		hset.add("Varun");
		hset.add("arun");
		
		for(String e: hset)
		{
			System.out.println(e);
		}
		
		

	}

}
