package HomeWork.Lesson25;

public class Lesson25 {

    public static void main(String[] args) {
        Mechenosec mech1 = new Mechenosec("Mech");
        Lion lion1 = new Lion("Leva");
        Pingvin pingvin1 = new Pingvin("Ping");
        Fish mech2 = new Mechenosec("Mech2");
        Animal mech3 = new Mechenosec("Mech3");
        Mammal lion2 = new Lion("Leva2");
        Animal lion3 = new Lion("Leva3");
        Bird pingvin2 = new Pingvin("Ping2");
        Animal pingvin3 = new Pingvin("Ping3");
        Speakable lion4 = new Lion("Leva4");
        Speakable pingvin4 = new Pingvin("Ping4");
        Animal[] array1 = {mech1, mech2, mech3, lion1, lion2, lion3, pingvin1, pingvin2, pingvin3};
        Speakable[] array2 = {lion1, lion2, lion4, pingvin1, pingvin2, pingvin4};

        for (Animal a : array1) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.sleep();
                m.swim();
                m.eat();
            } else if (a instanceof Lion) {
                Lion l = (Lion) a;
                System.out.println(l.name);
                l.sleep();
                l.run();
                l.eat();
                l.speak();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            }
            System.out.println("----------------");
        }
        System.out.println("-----------------------------------------");

        for (Speakable a : array2) {
            if (a instanceof Lion) {
                Lion l = (Lion) a;
                System.out.println(l.name);
                l.sleep();
                l.run();
                l.eat();
                l.speak();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            }
            System.out.println("----------------");
        }
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
