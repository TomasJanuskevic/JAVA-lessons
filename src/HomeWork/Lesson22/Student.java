package HomeWork.Lesson22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name;
    }

    public void setName(StringBuilder s) {
        if (s.length() > 2) {
            name = s;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int c) {
        if (c >= 1 && c <= 4) {
            course = c;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int g) {
        if (g >= 1 && g <= 10) {
            grade = g;
        }
    }

    public void showInfo() {
        System.out.println("Student: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
    }
}

class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student();
        StringBuilder st1 = new StringBuilder("John");
        s1.setName(st1);
        s1.setCourse(2);
        s1.setGrade(10);
        s1.showInfo();
    }

}
