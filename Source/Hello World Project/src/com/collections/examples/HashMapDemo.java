package com.collections.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map map=new HashMap();
		System.out.println("The size of tree set is " +map.size());
		String[] arr={"Yo","yo1","yo2"};
		map.put(1, 12);
		map.put(2, 22);
		map.put(3, "Bat-Man");
		map.put(4,new Student());
		map.put("abcd","Yo");
		map.put("xyz",1234);
		map.put(3.5,"float key");
		map.put(3, "New Bat-Man");
		map.put(5, arr);
		System.out.println("The size of tree set is " +map.size());
		
		System.out.println("The elements of Hashmap at key 3 is "+map.get(3));
		System.out.println("The elements of Hashmap at key 3.5 is "+map.get(3.5));
		System.out.println("The elements of Hashmap at key xyz is "+map.get("xyz"));
		System.out.println("The elements of Hashmap at key 4 is "+map.get(4));
		System.out.println("The elements of Hashmap at key 5 is "+map.get(5));
		
		Set set= map.keySet();
		for(Object key:set) {
			System.out.println("The keys of Hashmap are "+key);
			System.out.println("The elements of Hashmap at key " +key+ " is "+map.get(key));
		}
		
		
		
		//Keys are must to retrieve any value.
		//We can store multiple values for one key(array of names or numbers associated with a value)
		//We can store same value with different keys.
		//if we give different values for the same key, the latest value will be associated with the key(as in case of
		//key 3 in above example).
		
	}

}
