public class Main {
    public static void main(String[] args) {
        //Задание № 1
        var weight = 10;
        System.out.println(weight);
        byte box = -100;
        System.out.println(box);
        short box1 = 25367;
        System.out.println(box1);
        int box2 = 123456789;
        System.out.println(box2);
        long box3 = 1055L;
        System.out.println(box3);
        float box4 = 3.14f;
        System.out.println(box4);
        double box5 = 1.123456789;
        System.out.println(box5);

        //Задание № 2
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float weightTotalBoxers = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксёров " + weightTotalBoxers + " кг.");
        float weightDifferenceBoxers = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе боксёров " + weightDifferenceBoxers + " кг.");

        //Задание № 3
        byte banana = 5;
        byte oneBanana = 80;
        int weightBananos = banana * oneBanana;
        short milkml = 200;
        short milk100ml = 105;
        int weightMilk = milkml / 100 * milk100ml;
        byte iceCream = 2;
        byte oneIceCream = 100;
        int weightIceCream = iceCream * oneIceCream;
        byte rawEggs = 4;
        byte oneRawEgg = 70;
        int weightRawEggs = rawEggs * oneRawEgg;
        int weightProductsGramms = weightBananos + weightMilk + weightIceCream + weightRawEggs;
        float weightProductsKG = weightProductsGramms / 1000f;
        System.out.println("Общий вес продуктов в коктейле " + weightProductsKG + " кг.");

        //Заданиее № 4
        byte weightDesired = 7;
        int weightDesiredGramm = weightDesired * 1000;
        int dietOne = weightDesiredGramm / 250;
        System.out.println("При первом рационе понадобится " + dietOne + " дней.");
        int dietTwo = weightDesiredGramm / 500;
        System.out.println("При втором рационе понадобится " + dietTwo + " дней.");
        int dietMiddle = (dietOne + dietTwo) / 2;
        System.out.println("Среднее количество дней для похудения " + dietMiddle + " .");

        //Задание № 5
        int salaryMasha = 67760;
        int yearSalaryMasha = salaryMasha * 12;
        float upSalaryMasha = salaryMasha / 100f * 10;
        float totalUpSalaryMasha = salaryMasha + upSalaryMasha;
        float upYearSalaryMasha = upSalaryMasha * 12;
        float differenceYearSalaryMasha = totalUpSalaryMasha - yearSalaryMasha;
        System.out.println("Маша теперь получает " + totalUpSalaryMasha + " рублей." );

    }
}