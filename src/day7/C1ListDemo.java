package day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * ArrayList :: *****
 * LinkedList
 * 
 * HashSet *****
 */
public class C1ListDemo {

	public static void main(String[] args) {
		demo2();
	}
	
	static void demo3() {
		HashSet set1 = new HashSet();
		
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<>();
	}
	
	
	
	
	static void demo2() {
		LinkedList list1 = new LinkedList();
		
		LinkedList<String> list2 = new LinkedList<String>();
		LinkedList<String> list3 = new LinkedList<>();
	}
	
	static void demo1() {
		// Simplest Collection :: Dynamic
		ArrayList list1 = new ArrayList();
		
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<>();
	}
}
