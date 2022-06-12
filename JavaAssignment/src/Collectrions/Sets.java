package Collectrions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		//HashSet ----->no Insertion order,Null values, No Duplicates
		HashSet<String> S1=new HashSet<String>();
		S1.add("Kiran");
		S1.add("charan");
		S1.add("Raavan");
		S1.add("Arun");
		S1.add("Lahore");
		S1.add("Kiran");
		S1.add(null);
		Iterator<String> itr=S1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	//Code for LinkedHashSet ---> Maintains the insertion Order,Allows null values,No duplicates,extends HAshSet class and implements Set Interface 
		LinkedHashSet<Integer> Lh1=new LinkedHashSet<Integer>();
		Lh1.add(10);
		Lh1.add(20);
		Lh1.add(0);
		Lh1.add(15);
		Lh1.add(25);
		Lh1.add(100);
		Lh1.add(10);
		Lh1.add(20);
		Iterator<Integer> itr1=Lh1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	//Code for Tree set -->Implements the sortedSet Inteface---->It maintains the ascending order of the elements
		TreeSet<String> T1=new TreeSet<String>();
		TreeSet<String> T2=new TreeSet<String>();
		T2.add("50");
		T2.add("20");
		T2.add("23");
		T2.add("15");
		T1.add("Ramana");
		T1.add("Vinod");
		T1.add("Vijay");
		T1.add("Hello");
		T1.addAll(T2);
		Iterator<String> itr2=T1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
