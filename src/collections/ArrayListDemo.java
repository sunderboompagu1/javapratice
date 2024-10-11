package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		//Declarition	
		ArrayList mylist = new ArrayList(); 
		//List mylist = new ArrayList(); // child calls ArrayList can hold parent class "List"
			
		//ArrayList <Integer>mylist = new ArrayList<Integer>();//same kind of data of data integer type of objects.
		
		//adding data into arrayLIst
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("jesus");
		mylist.add('A');
		mylist.add(null);
		mylist.add(true);
		mylist.add(100);
		
		//size of arraylist
		System.out.println("size of array list: " + mylist.size());
		//remove element from an arrayList
		
		
		
		//printing arraylist
		System.out.println("valsues of array list" + mylist);
		
		//remove element from an arraylist
		mylist.remove(6);
		//after removing
		System.out.println("valsues of array list" + mylist);
		
		//insert element in arraylist
		mylist.add(2,"sunder");	
		
		//after adding or asserting
		System.out.println("valsues of array list" + mylist);
		
		//modifey element in the arraylist(modefy/replace/change)
		mylist.set(2,"boompagu");
		System.out.println("valsues after replacing" + mylist);
		
		//get a valu from the array of paortucal index
		System.out.println(mylist.get(3));
		
		//reading all the elements in an arraylist
		//using normal for loop
//		for(int i=0;i<=mylist.size()-1;i++) {
//			System.out.println(mylist.get(i));
//		}
		//foreach loop
//		for(Object x :mylist) {
//			System.out.println(x);
//		}
		
		//Iterator this is mainly for collection. Iterator is a cursor
		//when you use Iterator we need to use while loop
//		Iterator it = mylist.iterator();
//		
//		while(it.hasNext()) { // if element found it will return True check value present or not
//			
//			System.out.println(it.next()); // next is a method which gets elements from the array list
//		}
//		
		//checking arraylist is empty or not
		System.out.println("is empty or not?" + mylist.isEmpty());
		
		//remove all the elements from array list
		
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add(10.5);
		
		mylist.removeAll(mylist2);
		System.out.println("after remove" + mylist);
		//remove all the elements
		mylist.clear();
		System.out.println("is my arraylist clear " + mylist.isEmpty());
		
		
		
		
		
		
		}

}
