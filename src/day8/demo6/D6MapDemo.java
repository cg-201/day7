package day8.demo6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class D6MapDemo {

	public static void main(String[] args) {
		
		demo1();
		
	}
	
	
	static void demo4() {
		// Sorted :: UDD
		Map<String, Person> map = new TreeMap<>();
		
		// while add object to map, KEY and Value
		map.put("rahul", new Person(100, "Rahul ...", "rahul@gmail.com", "12121212"));
		map.put("ravi", new Person(200, "Ravikant", "ravi@gmail.com", "323232"));
		
		
		// map.remove("ravi");
		map.get("ravi");
	}
	
	
	
	static void demo3() {
		// input sequnce
		Map<String, Person> map = new LinkedHashMap<>();
		
		// while add object to map, KEY and Value
		map.put("rahul", new Person(100, "Rahul ...", "rahul@gmail.com", "12121212"));
		map.put("ravi", new Person(200, "Ravikant", "ravi@gmail.com", "323232"));
		
		
		// map.remove("ravi");
		map.get("ravi");
	}
	
	static void demo2() {
		// can be random
		Map<String, Person> map = new HashMap<>();
		
		// while add object to map, KEY and Value
		map.put("rahul", new Person(100, "Rahul ...", "rahul@gmail.com", "12121212"));
		map.put("ravi", new Person(200, "Ravikant", "ravi@gmail.com", "323232"));
		
		
		// map.remove("ravi");
		map.get("ravi");
	}
	
	
	// Key must be UNIQUE
	static void demo1() {
		// Inheritacnce, UpCasting, Polymorphsim
		Map<String, String> map = new HashMap<>();
		
		// Collections :: adding into collection
		map.put("rahul", "AAAA AAAA");
		map.put("ravi", "BBBBB BBBB");
		map.put("samir", "CCC CCCC");
		map.put("samir", "DDD CCCC");
		
		
		System.out.println(map);
		
		// get the value / object
		String rvalue = map.get("samir");
		System.out.println(rvalue);
		
		// get the size of map
		System.out.println(map.size());
		
		// remove from map
		map.remove("samir");
		System.out.println(map);
		
	}
	
}
