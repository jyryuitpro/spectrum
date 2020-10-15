package collection.treeset;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();

        Member memberLee = new Member(300, "Lee");
        Member memberKim = new Member(100, "Kim");
        Member memberPark = new Member(200, "Park");
//        Member memberPark2 = new Member(300, "Park2");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
//        manager.addMember(memberPark2);

        manager.showAllMember();
//        manager.removeMember(100);
//        manager.showAllMember();
    }
}
