
package Lesson4;

public class Test1 {
    String color = "red";
    String engine = "V6";
}

class car {
    public static void main (String [] args){
    Test1 car1 = new Test1();
    Test1 car2 = new Test1(); 
    car2.engine = "v8";
    
    Test1 car3 = car2;
    car3.color = "green";
    
    System.out.println(car1.color);
    System.out.println(car2.engine);
    System.out.println(car1.engine);
    System.out.println(car3.engine);
    System.out.println(car3.color);
    System.out.println(car2.color);
}
}         