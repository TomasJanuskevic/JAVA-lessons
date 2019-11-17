
package Lesson8;

public class car {     
    String color;
    String engine;
    
    car(String color2, String engine2){
    color = color2;
    engine = engine2;
    }
}

class human{
String name = "John";
final car car = new car("red", "V6");

 public static void main(String[] args) {
      human h1 = new human();
        System.out.println(h1.car.color);
        h1.car.color = "blue";
        System.out.println(h1.car.color);
      //  h1.car = new car();
    }
}


