package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Sai", "Dhanvi", "Rishika", "Rishitha" };

		System.out.println("The 2nd name is " + names[1]);

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("Sai");
		list1.add("Dhanvi");
		list1.add("Rishika");
		list1.add("Rishitha");
		list1.add("Sai");
		//list1.add(null); never add null.
		list1.add(""); //adds empty space

		System.out.println("The list is " + list1);
		System.out.println("The size of the list " + list1.size());
		System.out.println("First name in the list " + list1.get(0));
		System.out.println("Last name in the list " + list1.get(list1.size() - 1));

		list1.set(1, "Vishwanath"); // To update the data form the list at index.
		System.out.println("The list after updating the list " + list1);

		list1.remove(2); // To remove the data form the list at index.
		System.out.println("The list after remove rishika " + list1);

		// Iterate through the list

		for (int i = 0; i < list1.size(); i++) {
			System.out.println("element name " + list1.get(i));

		}

		for (String value : list1) {
			System.out.println("element values " + value);
		}
		
		Iterator<String> itr = list1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		Collections.sort(list1);
		System.out.println("After sorting the list is " + list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("after sorting in descending order " + list1);
		
	}
       
}
