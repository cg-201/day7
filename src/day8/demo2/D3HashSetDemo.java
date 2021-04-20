package day8.demo2;

import java.util.HashSet;

public class D3HashSetDemo {
	public static void main(String[] args) {
		demo2();
	}
	
	
	static void demo2() {
		HashSet<Person> set = new HashSet<>();
		
		set.add(new Person(100, "Rahul"));
		set.add(new Person(101, "Rahul"));
		
		System.out.println(set.size());
		System.out.println(set);
	}
	
	static void demo1() {
		HashSet<String> set = new HashSet<>();
		
		set.add("DELHI");
		set.add("DELHI");
		set.add("DELHI");
		set.add("MUMBAI");
		set.add("MUMBAI");
		
		System.out.println(set.size());
		System.out.println(set);
	}
}
