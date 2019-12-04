package HomeWork.Lesson22;

public class Animal {

    int eyes;

    Animal() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void drink() {
        System.out.println("Animal drink");
    }
}

class Pet extends Animal {

    String name;
    int tail = 1;
    int paw = 4;

    Pet() {
        eyes = 2;
        System.out.println("I am pet");
    }

    public void run() {
        System.out.println("Pet run");
    }

    public void jump() {
        System.out.println("Pet jump");
    }
}

class Dog extends Pet {

    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is " + name);
    }

    public void play() {
        System.out.println("Dog play");
    }
}

class Cat extends Pet {

    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is " + name);
    }

    public void sleep() {
        System.out.println("Cat sleep");
    }
}

class Test {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Reks");
        System.out.println("dog have " + dog1.paw + " paws.");
        Cat cat1 = new Cat("Murka");
        cat1.sleep();
    }
}
