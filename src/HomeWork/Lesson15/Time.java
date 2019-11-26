package HomeWork.Lesson15;

class Time {

    public static void clock() {
        int hour = 0;
        OUTER:
        while (hour <= 6) {

            int minute = 0;
            MIDDLE:
            do {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                minute++;
                int second = 0;
                INNER:
                while (second <= 59) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }

            } while (minute < 59);
            hour++;
        }
    }
}

class Test {

    public static void main(String[] args) {
        Time.clock();
    }
}
