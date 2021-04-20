package day8;

public class Person {
	private int id;
	private String name;
	
	// Empty Constructor
	public Person() {
		super();
	}

	// Parametrized constructor
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	/*@Override
	public String toString() {
		// return "I am person object";
		// this keyword is used to access instance member
		return   this.name + " " + this.id; 
	}*/
}
