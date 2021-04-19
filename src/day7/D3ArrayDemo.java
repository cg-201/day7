package day7;

public class D3ArrayDemo {

	public static void main(String[] args) {
		// Array Operations
		int[] ids = new int[5];
		
		// P1: Fixed Length
		// P2: Can not delete an element from array
		// P3: Sort an array; 
		// P4: Add an element :: no flexible approach
		
		// Sorting ?
		// int[];
		// String[];
		// Student[];
		// UDD[];
		
		
		// Array Assignments :: Array operations
		// 1. Add an element/number in Array;
		// 2. Remove an element from array;
		// 3. Find an element in array;
		// 4. Sort the array;
		// 5. Iterate all the elements of array;
		
		// Add / Reset the position
		ids[0] = 100;
		ids[0] = 200;
		ids[1] = 500;
		ids[2] = 34;
		ids[3] = 45;
		ids[4] = 10;
		
		for(int i=0; i<ids.length; i++) {
			System.out.println(ids[i]);
		}
		
	}
}
