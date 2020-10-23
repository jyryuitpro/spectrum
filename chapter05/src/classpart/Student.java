package classpart;

class ABC {

}

//학생이 있습니다.
public class Student {

//    학생은 학번, 이름, 주소 값을 가집니다.
    public int studentID;

    public String studentName;

    public String address;

//    학생의 정보를 보여줍니다.
    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }
}
