package day8.demo1;

public class D2ObjectDemo {

	public static void main(String[] args) {
		demo3();
	}
	
	
	static void demo3() {
		Person p1 = new Person(100, "Rahul");
		Person p2 = new Person(100, "Rahul");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		// SINCE UDD
		// Comparing / Equality Check for UDD;
		if(p1.equals(p2)) {
			System.out.println("Objects are equal!");
		} else {
			System.out.println("Objects are not equal!!");
		}
		
		
	}
	
	
	
	static void demo2() {
		String str1 = new String("Rahul");
		String str2 = new String("Rahul");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// Compare/Equality Check for two Object
		if(str1.equals(str2)) {
			System.out.println("Both the String Objects are Equal!");
		} else {
			System.out.println("Not Equal!");
		}
	}
	
	
	static void demo1() {
		Person p = new Person(100, "Rahul");
		
		System.out.println(p);
	}
}
