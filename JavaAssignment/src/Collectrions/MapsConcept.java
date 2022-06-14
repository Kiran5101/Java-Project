package Collectrions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsConcept {
	public static void main(String[] args) {
		// HashMap Does not maintain any order,Allows duplicate values ,not allows duplicate keys
		//Maps cannot be traversed and we ned to convert map to set using entrySet() or KeySet() method
		HashMap<String, Integer> M1=new HashMap<String,Integer>();
		HashMap<String,Integer> M2=new HashMap<String,Integer>();
		M2.put("Hi", 10);
		M2.put("Hello", 12);
		M2.put("Haha", 2);
		M1.put("Kiran",11);
		M1.put("Ramana", 10);
		M1.put("Naari", 9);
		M1.put("Hello", 20);
		M1.putAll(M2);
		//inserts the entry based on the key value
		M1.putIfAbsent("Naari", 26);
		//replaces existing value
		M1.replace("Kiran", 1000);
		M1.replace("Hi", 10, 2000);	
		M1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("Reverse Sorting");
		M1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		//Linked Hashmap Maintains the insertion order,No duplicates Allows only null values 
		LinkedHashMap<String,Integer> LH1=new LinkedHashMap<String,Integer>();
		LH1.put("Kiran", 1186517);
		LH1.put("Raavan", 1177711);
		LH1.put("Aditya", 1121123);
		LH1.put("Vinod", 145234);
		Set set=LH1.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
	}
	

