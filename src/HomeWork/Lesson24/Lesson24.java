package HomeWork.Lesson24;

public class Lesson24 {

    public static void main(String[] args) {
        Mechenosec fish = new Mechenosec("nemo");
        System.out.println(fish.name);
        fish.eat();
        fish.sleep();
        fish.swim();
        
        Speakable pingvin = new Pingvin("Monk");
        pingvin.speak();
        
        Animal Lion1 = new Lion("Leva");
        System.out.println(Lion1.name);
        Lion1.eat();
        Lion1.sleep();
        
    }

}

abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    void sleep() {
        System.out.println("Visada idomu ziureti kaip miega zuvys");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + "sings");
    }
}

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    void swim() {
        System.out.println("Mechenosec grazi zuvis kuri greitai plaukioja");
    }

    void eat() {
        System.out.println("Mechenosec nera plesri zuvis");
    }
}

class Pingvin extends Bird {

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    void eat() {
        System.out.println("Pingvinai megsta valgyti zuvi");
    }

    void sleep() {
        System.out.println("Pingvinai miega prisigalude vienas prie kito");
    }

    void fly() {
        System.out.println("Pingvinai nemoka skraidyti");
    }

    public void speak() {
        System.out.println("Pingvinai nemoka dainuoti");
    }
}

class Lion extends Mammal {

    Lion(String name) {
        super(name);
        this.name = name;
    }

    void eat() {
        System.out.println("Liutas valgo mesa");
    }

    void sleep() {
        System.out.println("Liutas didele dienos dali miega");
    }

    void run() {
        System.out.println("Liutas nepati greiciausia kate");
    }
}
