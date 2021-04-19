package day7;

public class D2ArrayDemo {

	public static void main(String[] args) {
		demo4();
	}
	
	
	static void demo4() {
		// approach1
		int[] intIds = {};
		float[] floatIds = {};
		String[] stringIds = {};
		Student[] studentids = {};
		
		// approach2
		int[] intIds1 = new int[5];
		float[] floatIds1 = new float[5];
		String[] stringIds1 = new String[5];
		Student[] studentids1 = new Student[5];
	}
	
	
	// Size of the array is fixed.
	static void demo3() {
		String[] arr1 = {"Delhi", "Calcutta"};
		// arr1[0] = "Delhi";
		// arr1[1] = "Calcutta";
		arr1[0] = "DELHI";
		
		String[] arr2 = new String[3];
		// arr2[0] = null;
		// arr2[1] = null;
		// arr2[2] = null;
		arr2[0] = "India";
		arr2[1] = "UK";
		arr2[1] = "UK";
		
		System.out.println(arr2[0]);
	}
	
	
	static void demo2() {
		// Approach1
		// Size Implicit
		// declaration + assignment
		int[] iarr = {100, 200};
		
		// Approach2 
		// Size Explicitly
		// Only Declared an array of Fixed Length
		// No Value Assigned :: Default Value
		int[] iarr1 = new int[5];
		
		System.out.println(iarr[0]); // 100
		System.out.println(iarr1[0]); // 0
		
	}
	
	static void demo1() {
		// Approach1
		int[] iarr = {100, 200};
		
		// Approach2 
		// [5] :: size of the array
		// 0, 1, 2, 3, 4
		int[] iarr1 = new int[5];
		
		
		System.out.println(iarr1[4]);
		
	}
}
