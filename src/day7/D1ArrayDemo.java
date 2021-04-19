package day7;

/**
 * Homegenious / Similar Data Type 
 * Continious / Placed one after another / Index
 */
public class D1ArrayDemo {

	public static void main(String[] args) {
		demo4();
	}
	
	
	// Index :: 0
	static void demo4() {
		String[] ids2 = {"A", "B"};

		System.out.println(ids2[0]);
		System.out.println(ids2[1]);
	}
	
	
	static void demo3() {
		String[] ids = {};
		String[] ids1 = {"A"};
		String[] ids2 = {"A", "B"};

		System.out.println(ids2);
	}
	
	
	
	static void demo2() {
		float[] ids = {};
		float[] ids1 = { 1.0f };
		float[] ids2 = { 1.1f, 2.2f, 3.3f };

		System.out.println(ids2);
	}

	static void demo1() {
		// Array is group of similar element
		// 0, 1, N...
		// Array is Object in Java.
		int[] ids = {};
		int[] ids1 = { 1 };
		int[] ids2 = { 1, 2, 3 };

		System.out.println(ids);
		System.out.println(ids1);
		System.out.println(ids2);
	}
}
