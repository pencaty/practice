package map;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap(); // include sorting
		
		Member Kim = new Member(200, "Kim");
		Member Lee = new Member(100, "Lee");
		Member Kang = new Member(300, "Kang");
		Member Kang2 = new Member(300, "Kang2");
		
		manager.addMember(Lee);
		manager.addMember(Kim);
		manager.addMember(Kang);
		manager.addMember(Kang2);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		
		manager.showAllMember();

	}

}

