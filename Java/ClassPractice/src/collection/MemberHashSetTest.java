package collection;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		
		Member Lee = new Member(100, "Lee");
		Member Kim = new Member(200, "Kim");
		Member Kang = new Member(300, "Kang");
		Member Kang2 = new Member(300, "Kang2");
		
		manager.addMember(Lee);
		manager.addMember(Kim);
		manager.addMember(Kang);
		manager.addMember(Kang2); // By redefining equal(), hashCode() of Member, we can remove same element (same ID, name)
		
		manager.showAllMember();

	}

}

