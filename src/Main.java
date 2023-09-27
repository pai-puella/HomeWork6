public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = 2; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            }
        }
        System.out.println();

        System.out.println("Задача 6");
        for (int n = 7; n <= 98; n += 7) {
            System.out.println(n);
        }
        System.out.println();

        System.out.println("Задача 7");
        for (int n = 1; n <= 512; n *= 2) {
            System.out.println(n);
        }
        System.out.println();

        System.out.println("Задача 8");
        int savings = 0;
        for (int month = 1; month <= 12; month++) {
            savings += 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();

        System.out.println("Задача 9");
        double savings1 = 0;
        for (int month = 1; month <= 12; month++) {
            savings1 += 29000;
            double interest = savings1 * 0.01;
            savings1 += interest;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings1 + " рублей");
        }
        System.out.println();

        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            System.out.println("2*" + i + "=" + result);
        }
    }
}
