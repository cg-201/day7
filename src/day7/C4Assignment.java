package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class C4Assignment {
	public static void main(String[] args) {
		demo3();
	}
	
	static void demo3() {
		// Arraylist of User Defined Data Type
		ArrayList<Student> list = new ArrayList<>();

		Student std = new Student(1, "A");
		list.add(std);

		Student std1 = new Student(2, "B");
		list.add(std1);

		Student std2 = new Student(3, "C");
		list.add(std2);
		
		// for the UDD, jvm does not how to sort!
		// Collections.sort(list);

		System.out.println(list);
	}
	
	
	
	static void demo2() {
		// Arraylist of User Defined Data Type
		ArrayList<Student> list = new ArrayList<>();

		Student std = new Student(1, "A");
		list.add(std);

		Student std1 = new Student(2, "B");
		list.add(std1);

		Student std2 = new Student(3, "C");
		list.add(std2);

		System.out.println(list);
	}
	

	static void demo1() {
		ArrayList<Student> list = new ArrayList<>();

		Student std = new Student();
		list.add(std);

		Student std1 = new Student();
		list.add(std1);

		Student std2 = new Student();
		list.add(std2);

		System.out.println(list);
	}
	
	
	
}
