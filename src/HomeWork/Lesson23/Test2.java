package HomeWork.Lesson23;

public class Test2 {

    protected void abc() {
        System.out.println('X');
    }

}

class Y2 extends Test2 {

    @Override
    public void abc() {
        System.out.println('Y');
    }

    public void def() {
        Y2 y = new Y2();
        y.abc();
    }

    public void ghi() {
        Test2 x = new Y2();
        x.abc();
    }

    public static void main(String[] args) {
        Y2 a = new Y2();
        a.abc();
        a.def();
        a.ghi();
    }
}
