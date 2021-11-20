package com.company;

public class Main {

    public static void main(String[] args) {
//first part
        byte intVarByte = 123;
        short intVarShort = 4096;
        int intVarInt = 65536;
        long intVarLong = -99999999999999999L;
        float fractionVarFloat = -123.123456f;
        double fractionVarDouble = 1213.12456789;
//second part
        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float totalWeight = (boxerOneWeight + boxerTwoWeight);
        System.out.println("Общий вес боксеров составляет " + totalWeight + " кг.");
        float weightDifference = (boxerOneWeight - boxerTwoWeight);
        System.out.println("Разница в весе боксеров составляет " + Math.abs(weightDifference) + " кг.");
//third part
        byte bananaWeightItem = 80;
        byte milkWeightItem = 105;
        byte icecreamWeightItem = 100;
        byte eggWeightItem = 70;
        byte bananaCount = 5;
        short milkCount = 200;
        byte icecreamCount = 2;
        byte eggCount = 4;
        float totalBreakfastWeight = (bananaCount * bananaWeightItem + (float)milkCount * milkWeightItem / 100 + icecreamCount * icecreamWeightItem + eggCount * eggWeightItem); //При коммите выдает предупреждение на этой строке "'milkCount * milkWeightItem / 100': integer division in floating-point context". Не понятно почему.
        System.out.println("Общий вес спорт-завтрака составляет " + (totalBreakfastWeight / 1000) + " кг.");
//fourth part
        byte targetWeight = 7;
        float minLostWeight = 250;
        float maxLostWeight = 500;
        float averageDays = targetWeight * 1000 / ((minLostWeight + maxLostWeight) / 2);
        System.out.println("Если спортсмен будет терять в день по 250 г., то наберет нужную форму за " + (targetWeight * 1000 / minLostWeight) + " дней.");
        System.out.println("Если спортсмен будет терять в день по 500 г., то наберет нужную форму за " + (targetWeight * 1000 / maxLostWeight) + " дней.");
        System.out.println("В среднем, спортсмену потребуется на набор нужной формы " + averageDays + " дней"); //Из условия задачи не совсем очевидно, какую именно цифру по итогу необходимо вывести в консоль. На всякий случай предлагаю варианты.
        System.out.println("В среднем, спортсмену потребуется на набор нужной формы " + (byte)Math.floor(averageDays) + "-" + (byte)Math.ceil(averageDays) + " дней");
        float hourLostWeight = (float) (averageDays % Math.floor(averageDays) * 24);
        float minutesLostWeight = (float) (hourLostWeight % Math.floor(hourLostWeight) * 60);
        float secondsLostWeight = (float) (minutesLostWeight % Math.floor(minutesLostWeight) * 60);
        float msLostWeight = (float) (secondsLostWeight % Math.floor(secondsLostWeight) * 1000);
        System.out.println("В среднем, спортсмену потребуется на набор нужной формы " + (byte)Math.floor(averageDays) + " дней, " + (byte)Math.floor(hourLostWeight) + " часов, " + (byte)Math.floor(minutesLostWeight) + " минут, " + (byte)Math.floor(secondsLostWeight) + " секунд, " + (Math.round(msLostWeight)) + " мс.");
//fifth part
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKris = 76_230;
        System.out.println("Маша теперь получает " + (int)(salaryMasha * 1.1) + " рублей. Годовой доход вырос на " + (int)(salaryMasha * 1.1 * 12 - salaryMasha * 12) + " рублей."); //Понимаю, что можно было добавить ещё переменные для хранения предудыщей зп, или наоборот для новой зп, но не уверен что вообще лучше - оптимизировать кол-во кода или переменных.
        System.out.println("Денис теперь получает " + (int)(salaryDenis * 1.1) + " рублей. Годовой доход вырос на " + (int)(salaryDenis * 1.1 * 12 - salaryDenis * 12) + " рублей."); //В критериях оценки написано "– Операция сложения выполнена верно". Мне кажется применять сложение здесь можно, но неоптимально =)
        System.out.println("Кристина теперь получает " + (int)(salaryKris * 1.1) + " рублей. Годовой доход вырос на " + (int)(salaryKris * 1.1 * 12 - salaryKris * 12) + " рублей.");
//sixth part
        int a = 12; // для a и b использую int, так как они используются в задачах #7 и #8.
        int b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println("Результат выполнения задачи №6 = " + result);
//seventh part
        a = 5; //a и b объявлены в задаче #6
        b = 7;
        a = a * b / a;
        System.out.println("Новое значение переменной a = " + a);
        b = b - (int)Math.sqrt(b);
        System.out.println("Новое значение переменной b = " + b);
//eighth part
        a = 222; //a и b объявлены в задаче #6
        b = ((a % 100) - (a % 100) % 10) / 10;
        System.out.println("Значение переменной b = " + b);
    }
}
