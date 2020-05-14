package map;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap manager = new MemberHashMap();
		
		Member Lee = new Member(100, "Lee");
		Member Kim = new Member(200, "Kim");
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

