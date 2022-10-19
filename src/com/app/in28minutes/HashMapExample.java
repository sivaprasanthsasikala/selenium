package com.app.in28minutes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(0,"siva");
		hs.put(1,"prasanth");
		hs.put(2,"selenium");
		hs.put(3,"java");
		System.out.println(hs.get(2));
		System.out.println(hs.get(3));
		Set sm=hs.entrySet();
		java.util.Iterator it=sm.iterator();
		while(it.hasNext())
		{
			System.out.println(it.hasNext());
		Map.Entry mp=(Map.Entry)it.next(); 
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		}
		
		
		
		

	}

}
