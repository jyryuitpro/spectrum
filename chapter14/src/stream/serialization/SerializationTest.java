package stream.serialization;

import java.io.*;

//class Person implements Serializable {
class Person implements Externalizable {

    String name;

    transient String job;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}

public class SerializationTest {

    public static void main(String[] args) {
        Person personLee = new Person("이순신", "엔지니어");
        Person personKim = new Person("김유신", "선생님");

        try (FileOutputStream fos = new FileOutputStream("serial.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personLee);
            oos.writeObject(personKim);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("serial.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
