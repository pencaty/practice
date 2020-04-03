package collectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iter = hashSet.iterator();
		while(iter.hasNext()) {
			Member member = iter.next();
			if(member.getMemberId() == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "doesn't exist");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Member> iter = hashSet.iterator();
		while(iter.hasNext()) {
			Member member = iter.next();
			System.out.println(member.getMemberName());
		}
	}
	
}
