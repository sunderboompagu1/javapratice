package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//declarition
		HashSet myset = new HashSet();  // hetrogenius data all kinds of data we can store these 2
		//Set myset = new HashSet();
		
		//HashSet <String>myset = new HashSet<String>(); //homo genius data specific data
		
		//adding elements into HasSet
		myset.add(100);
		myset.add(10.5);
		myset.add('A');
		myset.add("Sunder");
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//printing HashSet
		System.out.println(myset); // [null, A, Sunder, 100, 10.5, true]
		
		
		//removing specific element
		myset.remove(10.5);// 10.5 is value not index in HashSet we will give value directly not index in ArrayListwe give index.
		System.out.println("After removing: " + myset);
		
		//inserting element
		//not possible because the data is not in proper order.
		
		//Access specific element 
		//not possible no direct approach.
		
		//but we can convert HastSet into ArrayList and we can access.
		//convert HashSet into ArryaList
		ArrayList al = new ArrayList(myset);
		System.out.println(al); //[null, A, Sunder, 100, true]
		System.out.println(al.get(2));
		
		//read and add all the elements using forlop is not possible, we can do with enhance for loop.
		//because there is no index.
		
		//using for each loop
		
//		for(Object x : myset) {
//			System.out.println("enhance for loop:" + x);
//		}
		
		//using iterator
		Iterator <Object>it = myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//clearing all the elemets in HashtSet
		myset.clear();
		System.out.println("is set is empty :" + myset.isEmpty());
		

	}

}
