package HomeWork.Lesson18;

public class Array {

    static int[] array(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                }
            }
            array[i] = min;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] ar1 = {2, 6, 4, -5, 50};
        array(ar1);

        for (int a : ar1) {
            System.out.print(a + "");
        }
    }

}
