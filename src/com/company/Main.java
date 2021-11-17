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
        float totalBreakfastWeight = (bananaCount * bananaWeightItem + milkCount * milkWeightItem / 100 + icecreamCount * icecreamWeightItem + eggCount * eggWeightItem); //При коммите выдает предупреждение на этой строке. Не понятно почему.
        System.out.println("Общий вес спорт-завтрака составляет " + (totalBreakfastWeight / 1000) + " кг.");
//fourth part
        byte targetWeight = 7;
        float minLostWeight = 250;
        float maxLostWeight = 500;
        short minLostWeightS = 250;
        short maxLostWeightS = 500;
        float averageDays = targetWeight * 1000 / ((minLostWeight + maxLostWeight) / 2);
        int averageDaysS = targetWeight * 1000 / ((minLostWeightS + maxLostWeightS) / 2); //Не понял, почему не дает использовать short. Так же не понял, почему при использовании float выдает результат 18.0, а не 18.666666.
        System.out.println("Если спортсмен будет терять в день по 250 г., то наберет нужную форму за " + (targetWeight * 1000 / minLostWeight) + " дней.");
        System.out.println("Если спортсмен будет терять в день по 500 г., то наберет нужную форму за " + (targetWeight * 1000 / maxLostWeight) + " дней.");
        System.out.println("В среднем спортсмену потребуется на набор нужной формы " + averageDays + " дней");
        System.out.println("В среднем спортсмену потребуется на набор нужной формы "+ averageDaysS + "-" + Math.round(averageDays) + " дней");
//fifth part

    }
}
