package mapPractice;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap; // Integer -> equals, hashCode 이미 구현되어 있음
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("No such member");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> iter = hashMap.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
}
