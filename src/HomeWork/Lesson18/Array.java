package HomeWork.Lesson18;

public class Array {

    static int[] array(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] ar1 = {9, 4, -5, 50, 9};
        array(ar1);

        for (int a : ar1) {
            System.out.print(a + " ");
        }
    }

}
