package HomeWork.Lesson16;

public class Mail {

    public static void email(String emails) {
        int a = 0; // @
        int b = 0; // .
        int c = 0; // ; 

        while (c < emails.length() - 1) {
            a = emails.indexOf('@', c);
            b = emails.indexOf('.', c);
            c = emails.indexOf(';', c + 1);
            System.out.println(emails.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        email("one@yahoo.com; two@gmail.com; three@mail.com;");
    }
}
