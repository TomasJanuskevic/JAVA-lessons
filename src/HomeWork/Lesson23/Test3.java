 
package HomeWork.Lesson23;



public class Test3 {

    public Test3() {
        System.out.println("X");
    }

    public Test3(int i) {
        System.out.println("X" + i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
       // Test3 x = new Y(18);
       // System.out.println(x.abc());
    }

    class Y extends Test3 {

        public Y(int i) {
            System.out.println("Y");
        }

        public boolean abc() {
            return true;
        }
    }
}
