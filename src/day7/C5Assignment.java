package day7;

import java.util.HashSet;

public class C5Assignment {
	public static void main(String[] args) {
		demo2();
	}
	
	static void demo2() {
		// UDD :: How to maintain the uniqunes with UDD.
		HashSet<Student> set = new HashSet<>();
		
		Student std1 = new Student(1, "A");
		set.add(std1);
		
		Student std2 = new Student(1, "A");
		set.add(std2);
		
		System.out.println(set);
	}
	
	static void demo1() {
		HashSet<String> set = new HashSet<>();
		
		set.add("A");
		set.add("P");
		set.add("A");
		set.add("Q");
		
		System.out.println(set);
	}
}
