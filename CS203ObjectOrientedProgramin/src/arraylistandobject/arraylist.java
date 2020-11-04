package arraylistandobject;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		for (String str : list) {
			System.out.println(" " + str);
		}

	}

}
