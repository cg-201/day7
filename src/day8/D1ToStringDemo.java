package day8;

public class D1ToStringDemo {
	public static void main(String[] args) {
		demo2();
	}
	
	
	// Mulitple person object
	static void demo2() {
		Person p1 = new Person(1, "Sachin");
		System.out.println(p1);
		
		Person p2 = new Person(2, "Saurav");
		System.out.println(p2);
	}
	
	
	// Lets make the object readable
	static void demo1() {
		String str = "hello world";
		System.out.println(str);
		
		Person person = new Person();
		System.out.println(person);
	}
}
