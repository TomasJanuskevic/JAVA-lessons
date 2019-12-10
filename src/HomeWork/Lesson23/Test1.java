package HomeWork.Lesson23;

public class Test1 {

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}

class X {

    public void abc() {
        System.out.println('X');
    }
}

class Y extends X {

    @Override
    public void abc() {
        System.out.println('Y');
    }
}
