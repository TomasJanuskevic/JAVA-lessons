package HomeWork;

import java.util.Arrays;

public class Lesson1 {

    public static boolean prog(String sentence) {
        String[] s = sentence.split(" ");
        char [][] ch = new char[s.length][];
        for (int i = 0; i < s.length; i++) {
            ch[i][] = s[i].toCharArray();

        }
    }

    public static void main(String[] args) {
        String myName = "domanokz";
        String newName = myName.substring(0, 4) + 'x' + myName.substring(5);
        System.out.println(newName);
    }
}
