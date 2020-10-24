package classpart;

public class StudentTest {

    public static void main(String[] args) {
//        Student studentLee = new Student();
        Student studentLee = new Student("이순신");
//        studentLee.studentName = "이순신";
        studentLee.address = "서울";
        studentLee.showStudentInfo();

//        Student studentKim = new Student();
        Student studentKim = new Student(100, "김유신");
//        studentKim.studentID = 100;
//        studentKim.studentName = "김유신";
//        studentKim.address = "경주";
        studentKim.showStudentInfo();

//        System.out.println(studentLee); // classpart.Student@3d494fbf
//        System.out.println(studentKim); // classpart.Student@1ddc4ec2
    }
}
