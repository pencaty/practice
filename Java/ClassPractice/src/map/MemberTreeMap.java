package map;

import java.util.TreeMap;
import java.util.Iterator;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap; // Integer -> equals, hashCode 이미 구현되어 있음
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("No such member");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> iter = treeMap.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
}
