package collectionPractice;

import java.util.Comparator;

//public class MemberTree implements Comparable<MemberTree>{
public class MemberTree implements Comparator<MemberTree>{

	private int memberId;
	private String memberName;
	
	public MemberTree() {};
	
	public MemberTree(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + ", " + memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MemberTree) {
			MemberTree member = (MemberTree) obj;
			return (this.memberId == member.memberId);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.memberId;
	}

	/*
	@Override
	public int compareTo(MemberTree member) { // When using Comparable
		return (this.memberId - member.memberId); // 오름차순
	}
	*/

	@Override
	public int compare(MemberTree member1, MemberTree member2) { // When using Comparator
		return (member1.memberId - member2.memberId); // 오름차순
	}
	
	
}
