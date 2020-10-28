package thisconcept;

public class Person {

    String name;

    int age;

    public Person() {
//        age = 100;
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + ", " + age);
    }

    public Person getSelf() {
        return this;
    }
}
