package polymorphism;

import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {

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

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {
        //업캐스팅
        Animal hAmimal = new Human();
        Animal tAmimal = new Tiger();
        Animal eAmimal = new Eagle();

//        Eagle human = (Eagle)hAmimal;

        if (hAmimal instanceof Human) {
            Human human = (Human)hAmimal;
            human.readBooks();
        }

        Human human = (Human)hAmimal;
        human.readBooks();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAmimal);
//        test.moveAnimal(tAmimal);
//        test.moveAnimal(eAmimal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAmimal);
        animalList.add(tAmimal);
        animalList.add(eAmimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);

        for (Animal animal : animalList) {
            //가상메서드(virtual method)
            animal.move();
        }
    }

    public void testDownCasting(ArrayList<Animal> animalList) {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);

            if (animal instanceof Human) {
                //명시적 형변환
                Human human = (Human)animal;
                human.readBooks();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            } else {
                System.out.println("error");
            }
        }
    }

    //다형성
    public void moveAnimal(Animal animal) {
        //가상메서드(virtual method)
        animal.move();
    }
}
