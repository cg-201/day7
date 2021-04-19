package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*
 * Add into arraylist (String/Integer)
 * Remove from arraylist
 * Sort the arraylist
 * 
 * Add into HashSet (String/Integer)
 * Remove from HashSet
 * Sort the HashSet ??
 */
public class C2ListDemo {

	public static void main(String[] args) {
		demo6();
	}
	
	static void demo6() {

		HashSet<Integer> list = new HashSet<>();

		// Add an Item
		list.add(34);
		list.add(12);
		list.add(45);
		list.add(5);
		list.add(5);
		list.add(15);
		list.add(55);
		
		System.out.println(list);
		
		// sorting
		// Collections.sort(list);

		// System.out.println(list);

	}
	
	
	static void demo5() {

		ArrayList<Integer> list = new ArrayList<>();

		// Add an Item
		list.add(34);
		list.add(12);
		list.add(45);
		list.add(5);
		list.add(5);
		list.add(15);
		list.add(55);
		
		System.out.println(list);
		
		// sorting
		Collections.sort(list);

		System.out.println(list);

	}
	

	// Sort Operation
	static void demo4() {

		ArrayList<String> list = new ArrayList<>();

		// Add an Item
		list.add("Delhi");
		list.add("Kolkata");
		list.add("Chennai");
		
		System.out.println(list);
		
		// sorting
		Collections.sort(list);

		System.out.println(list);

	}

	static void demo3() {

		ArrayList<String> list = new ArrayList<>();
		System.out.println("Size " + list.size());

		// Add an Item
		list.add("Delhi");
		list.add("Kolkata");
		list.add("Chennai");
		System.out.println("Size " + list.size());

		System.out.println(list);

		// Remove an item
		// list.remove("Delhi");
		list.remove(1);

		System.out.println(list);

	}

	// Add Operation
	static void demo2() {

		ArrayList<String> list = new ArrayList<>();
		System.out.println("Size " + list.size());

		// Add an Item
		list.add("Delhi");
		list.add("Kolkata");
		list.add("Chennai");
		System.out.println("Size " + list.size());

		System.out.println(list);

	}

	static void demo1() {

		ArrayList<String> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Student> list2 = new ArrayList<>();
	}
}
