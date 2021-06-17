package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, List<String>> list = new HashMap<String, List<String>>();

		List<String> list1 = new ArrayList<>();
		list1.add("String1");


		list.put("Test1",list1);
	}

}
