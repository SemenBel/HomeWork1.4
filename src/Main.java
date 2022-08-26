public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int n = 10; n >= 1; n = n - 1) {
            System.out.print(n + " ");
        }
    }
    public static void task2() {
        int firstFriday = 5;
        int daysMonth = 31;
        for (int i = firstFriday; i <= daysMonth; i += 7) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
        }
    }
    public static void task3() {
        int nowYear = 2022;
        int lastPeriod = nowYear - 200;
        int futurePeriod = nowYear + 100;
        for (int i = lastPeriod; i <= futurePeriod; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}