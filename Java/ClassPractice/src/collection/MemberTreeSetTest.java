package collection;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet manager = new MemberTreeSet();
		
		MemberTree Kim = new MemberTree(200, "Kim");
		MemberTree Lee = new MemberTree(300, "Lee");
		MemberTree Kang = new MemberTree(100, "Kang");
		
		manager.addMember(Lee);
		manager.addMember(Kim);
		manager.addMember(Kang);
		
		manager.showAllMember();

	}

}

