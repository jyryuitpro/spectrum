package staticconcept;

//학생이 있습니다.
public class Student {

    private static int serialNum = 1000;

//    학생은 학번, 이름, 주소 값을 가집니다.
//    public int studentID;
    private int studentID;

    public String studentName;

    public String address;

//    오버로딩 : 이름이 같지만 매개변수가 다른 경우

//    public Student() {}

    public Student(String name) {
        studentName = name;
        serialNum++;
        studentID = serialNum;
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소 없음";
        serialNum++;
        studentID = serialNum;
    }

//    학생의 정보를 보여줍니다.
    public void showStudentInfo() {
        int i = 0;
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        //static 변수
        serialNum++;
        return studentID;
    }

    public static int getSerialNum() {
        //지역변수
        int i = 0;

        //인스턴스 변수
//        studentName = "Lee";

        //static 변수
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }
}
