package w1d2;

/**
 * 
 * @author Asgedom
 * @version 0.1 This person class represents a person
 */
public class Person {
	private String name;

	/**
	 * The default constructor
	 */
	public Person() {
		System.out.println("a new person is made");
	}

	public Person(String name) {
		this();
		this.name = name;
	}

	/**
	 * 
	 * @return the name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the person's name
	 * 
	 * @param name that the person's name should become
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * A method that changes the name and outputs it ti the console
	 */
	public void sayHello() {
		System.out.println("My name is : " + this.name);
	}

}
