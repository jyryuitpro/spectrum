package polymorphism;

import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {
        Animal hAmimal = new Human();
        Animal tAmimal = new Tiger();
        Animal eAmimal = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAmimal);
//        test.moveAnimal(tAmimal);
//        test.moveAnimal(eAmimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAmimal);
        animalList.add(tAmimal);
        animalList.add(eAmimal);

        for (Animal animal : animalList) {
            animal.move();
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
