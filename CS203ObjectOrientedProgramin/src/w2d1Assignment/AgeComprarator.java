package w2d1Assignment;

import java.util.Comparator;

public class AgeComprarator implements Comparator<Person> {

	@Override
	public int compare(Person a, Person b) {

		return a.getAge() - b.getAge();
	}

}
