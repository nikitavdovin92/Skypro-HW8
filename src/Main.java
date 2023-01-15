public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Пример While!
        System.out.println("пример While!");
        int start = 5;
        while (start > 0) {
            System.out.println (start);
            start = start - 1;
        }
        //пример Do-while!
        System.out.println("пример Do- While!");
        int start2 = 5;
        do {System.out.println (start2);
            start2 = start2 - 1;
        }
        while (start2 > 0);

        //Задача 1
        System.out.println("Задача 1");
        int accumulation = 15000;
        int summa = 0;
        int i = 1;
        while (summa <= 2_459_000) {
            summa+=accumulation;
            System.out.println("Месяц " + i + " -сумма накоплений равна " + summa + " рублей");
            i++;
        }
        //Задача 2
        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;

        }
        System.out.println(" ");
        for (int b = 10; b >= 1; b = b - 1) {
            System.out.print(b + " ");
        }
        //Задача 3
        System.out.println("Задача 3");
        int countryY = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10) {
            year++;
            countryY = countryY / 1000 * (fertility - mortality) + countryY;
            System.out.println("Год " + year + "- численность населения составляет " + countryY);
        }
        //Задача 4
        System.out.println("Задача 4");
        int startMoney = 15000;
        int month = 0;
        while (startMoney < 12_000_000) {
            startMoney = (startMoney * 107) / 100;
            month++;
            System.out.println("Месяц " + month + "- сумма накоплений " + startMoney);
        }
        //Задача 5
        System.out.println("Задача 5");
        int startMoney2 = 15000;
        int month2 = 0;
        while (startMoney2 < 12_000_000) {
            startMoney2 = (startMoney2 * 107) / 100;
            month2++;
            if (month2 % 6 == 0) {
            System.out.println("Месяц " + month2 + "- сумма накоплений " + startMoney2);
            }

        }
        //Задача 6
        System.out.println("Задача 6");
        int startMoney3 = 15000;
        int month3 = 0;
        while (startMoney3 < 20_900_000) {
            startMoney3 = (startMoney3 * 107) / 100;
            month3++;
            if (month3 % 6 == 0 && month3 <= 108) {
                System.out.println("Месяц " + month3 + "- сумма накоплений " + startMoney3);
            }
            System.out.println(month3);

        }
        //Задача 7
        System.out.println("Задача 7");
        int firstFriday = 2;
        for (int friday = firstFriday; friday <= 31; friday += 7 ) {
            System.out.println("Сегодня пятница- " + friday + "-е число. Необходимо подготовить отчёт");
        }
        //Задача 8
        System.out.println("Задача 8");
        int currentYear = 2023;
        int starting = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int firstTimeAppeared = 0;
        for (int years = starting; years <= end; years++) {
            if (years % period == firstTimeAppeared) {
                System.out.println(years);
            }

        }










    }
}