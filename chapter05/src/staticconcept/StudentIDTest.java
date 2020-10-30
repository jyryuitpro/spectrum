package staticconcept;

public class StudentIDTest {

    public static void main(String[] args) {
//        System.out.println(Student.serialNum);

        Student studentLee = new Student("Lee");
//        System.out.println(studentLee.serialNum);
//        System.out.println(Student.serialNum);
        System.out.println(Student.getSerialNum());

        Student studentKim = new Student("Kim");
//        System.out.println(studentKim.serialNum);
//        System.out.println(studentLee.serialNum);
//        System.out.println(Student.serialNum);
//        System.out.println(Student.serialNum);

        System.out.println(studentLee.getStudentID());
        System.out.println(studentKim.getStudentID());
    }
}
