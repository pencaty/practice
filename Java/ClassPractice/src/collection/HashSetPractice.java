package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("D");
		set.add("A");
		set.add("B");
		set.add("C");
				
		System.out.println(set);
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

	}

}
