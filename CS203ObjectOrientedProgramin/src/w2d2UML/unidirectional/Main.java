package w2d2UML.unidirectional;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
		person.add(new Person("asg", "hel"));
		person.add(new Person("ged", "iol"));

		for (Person p : person) {
			System.out.println(p.getFirstName());
		}
	}

}
