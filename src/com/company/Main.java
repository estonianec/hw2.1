package com.company;

public class Main {

    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
        task8();

    }

    public static void task1() {

        byte intVarByte = 123;
        short intVarShort = 4096;
        int intVarInt = 65536;
        long intVarLong = -99999999999999999L;
        float fractionVarFloat = -123.123456f;
        double fractionVarDouble = 1213.12456789;
    }

    public static void task2() {
        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float totalWeight = (boxerOneWeight + boxerTwoWeight);
        System.out.println("Общий вес боксеров составляет " + totalWeight + " кг.");
        float weightDifference = (boxerOneWeight - boxerTwoWeight);
        System.out.println("Разница в весе боксеров составляет " + Math.abs(weightDifference) + " кг.");
    }

    public static void task3() {
        byte bananaWeightItem = 80;
        byte milkWeightItem = 105;
        byte icecreamWeightItem = 100;
        byte eggWeightItem = 70;
        byte bananaCount = 5;
        short milkCount = 200;
        byte icecreamCount = 2;
        byte eggCount = 4;
        float totalBreakfastWeight = (bananaCount * bananaWeightItem + (float) milkCount * milkWeightItem / 100 + icecreamCount * icecreamWeightItem + eggCount * eggWeightItem);
        System.out.println("Общий вес спорт-завтрака составляет " + (totalBreakfastWeight / 1000) + " кг.");
    }

    public static void task4() {
        byte targetWeight = 7;
        float minLostWeight = 250;
        float maxLostWeight = 500;
        float averageDays = targetWeight * 1000 / ((minLostWeight + maxLostWeight) / 2);
        System.out.println("Если спортсмен будет терять в день по 250 г., то наберет нужную форму за " + (targetWeight * 1000 / minLostWeight) + " дней.");
        System.out.println("Если спортсмен будет терять в день по 500 г., то наберет нужную форму за " + (targetWeight * 1000 / maxLostWeight) + " дней.");
        System.out.println("В среднем, спортсмену потребуется на набор нужной формы " + averageDays + " дней"); //Из условия задачи не совсем очевидно, какую именно цифру по итогу необходимо вывести в консоль. На всякий случай предлагаю варианты.
        System.out.println("В среднем, спортсмену потребуется на набор нужной формы " + (byte) Math.floor(averageDays) + "-" + (byte) Math.ceil(averageDays) + " дней");
        float hourLostWeight = (float) (averageDays % Math.floor(averageDays) * 24);
        float minutesLostWeight = (float) (hourLostWeight % Math.floor(hourLostWeight) * 60);
        float secondsLostWeight = (float) (minutesLostWeight % Math.floor(minutesLostWeight) * 60);
        float msLostWeight = (float) (secondsLostWeight % Math.floor(secondsLostWeight) * 1000);
        System.out.println("В среднем, спортсмену потребуется на набор нужной формы " + (byte) Math.floor(averageDays) + " дней, " + (byte) Math.floor(hourLostWeight) + " часов, " + (byte) Math.floor(minutesLostWeight) + " минут, " + (byte) Math.floor(secondsLostWeight) + " секунд, " + (Math.round(msLostWeight)) + " мс.");
    }

    public static void task5() {
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKris = 76_230;
        int salaryMashaNew = (int) (salaryMasha * 1.1);
        int salaryDenisNew = (int) (salaryDenis * 1.1);
        int salaryKrisNew = (int) (salaryKris * 1.1);
        System.out.println("Маша теперь получает " + salaryMashaNew + " рублей. Годовой доход вырос на " + (salaryMashaNew * 12 - salaryMasha * 12) + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на " + (salaryDenisNew * 12 - salaryDenis * 12) + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKrisNew + " рублей. Годовой доход вырос на " + (salaryKrisNew * 12 - salaryKris * 12) + " рублей.");
    }

    public static void task6() {
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println("Результат выполнения задачи №6 = " + result);
    }

    public static void task7() {
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новое значение переменной a = " + a);
        System.out.println("Новое значение переменной b = " + b);
    }

    public static void task8() {
        int a = 123;
        int b = a / 10 % 10;
//      int b = ((a % 100) - (a % 100) % 10) / 10;
        System.out.println("Значение переменной b = " + b);
    }
}
