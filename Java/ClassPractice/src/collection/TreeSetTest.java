package collection;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(); // set with sorting. Compare ������ MemberTree�ּ�.
		treeSet.add("A");
		treeSet.add("E");
		treeSet.add("S");
		treeSet.add("B");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
