package collection;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	private TreeSet<MemberTree> treeSet;
	
	public MemberTreeSet() {
		//treeSet = new TreeSet<MemberTree>();
		treeSet = new TreeSet<MemberTree>(new MemberTree()); // When using Comparator
	}
	
	public void addMember(MemberTree member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<MemberTree> iter = treeSet.iterator();
		while(iter.hasNext()) {
			MemberTree member = iter.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "doesn't exist");
		return false;
	}
	
	public void showAllMember() {
		Iterator<MemberTree> iter = treeSet.iterator();
		while(iter.hasNext()) {
			MemberTree member = iter.next();
			System.out.println(member.getMemberName());
		}
	}
	
}
