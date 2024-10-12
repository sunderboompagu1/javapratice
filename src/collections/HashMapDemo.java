package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//declarition.
		
		//Map hm = new HashMap();
		
		HashMap <Integer,String>hm = new HashMap<Integer,String>();
		
		//adding pairs.
		hm.put(1, "Jesus");
		hm.put(2, "christ");
		hm.put(3, "Jesus");
		hm.put(3, "Love");
		System.out.println(hm);
		
		System.out.println("size of HashMap:" + hm.size());
		//remove pair.
		hm.remove(3);
		System.out.println("After removing pair: " + hm);
		
		//access value of key
		System.out.println(hm.get(1));
		
		
		// get all the keys from hashmap
		System.out.println(hm.keySet());//[1, 2] only keys
		System.out.println(hm.values()); //[Jesus, christ] only values
		
		//get both key and values.
		System.out.println(hm.entrySet()); // [1=Jesus, 2=christ]
		
		//reading data from the hashmap no for loop.
		
//		for(int k : hm.keySet()) {
//			System.out.println(k + "  " + hm.get(k));
//		}
		
		//using iterator
		
		Iterator <Entry <Integer, String>> it	= hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry <Integer, String>entry =it.next(); //Entery is key and value
			System.out.println(entry.getKey()+ "  "+ entry.getValue());
		}
		
		//clear all from hashmap
		hm.clear();
System.out.println(hm.isEmpty());
		
		
		
	}

}
