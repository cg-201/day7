package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C3Demo {
	public static void main(String[] args) {
		demo4();
	}
	
	static void demo4() {
		// Unique + Sorting
		TreeSet<String> set = new TreeSet<>();
		
		set.add("Mumbai");
		set.add("Delhi");
		set.add("Kolkata");
		set.add("Chennai");
		set.add("Delhi");
		
		System.out.println(set);
	}
	
	
	static void demo3() {
		// Unique + Sequnce
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.add("Mumbai");
		set.add("Delhi");
		set.add("Kolkata");
		set.add("Chennai");
		set.add("Delhi");
		
		System.out.println(set);
	}
	
	// Unique Element
	static void demo2() {
		// Uniquence + No Sequence!! :: Faster than Arraylist
		HashSet<String> set = new HashSet<>();
		
		set.add("Mumbai");
		set.add("Delhi");
		set.add("Kolkata");
		set.add("Chennai");
		set.add("Delhi");
		
		System.out.println(set);
		
		
	}
	
	static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Kolkata");
		list.add("Delhi");
		
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		// reverse order
		Collections.reverse(list);
		System.out.println(list);
	}
}
