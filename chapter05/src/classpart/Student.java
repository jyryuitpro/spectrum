package classpart;

class ABC {

}

//학생이 있습니다.
public class Student {

//    학생은 학번, 이름, 주소 값을 가집니다.
//    public int studentID;
    private int studentID;

    public String studentName;

    public String address;

//    오버로딩 : 이름이 같지만 매개변수가 다른 경우

//    public Student() {}

    public Student(String name) {
        studentName = name;
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소 없음";
    }




//    학생의 정보를 보여줍니다.
    public void showStudentInfo() {
        int i = 0;
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }
}
