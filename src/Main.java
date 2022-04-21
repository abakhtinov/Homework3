import java.awt.*;
import java.awt.geom.Arc2D;

public class Main {
    public static void main(String[] args) {
        // Задание 1

        byte a = 1;
        short b = 200;
        int c = 40000;
        long d = 12345678901L;
        float e = 1.5f;
        double f = 1.7777777;
        char g = 90;
        boolean h = 15 < 4;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


        //Задание 2

        float firstBoxerWeight = 78.2f;
        float secondBoxerWeigt = 82.7f;
        float totalWeightBoexers = firstBoxerWeight + secondBoxerWeigt;
        System.out.println("Общий вес боксеров " + totalWeightBoexers + " кг");
        float differenceWeight = secondBoxerWeigt % firstBoxerWeight;
        System.out.println("Разница в весе между бойцами равна "+ differenceWeight + " кг");

        //Задание 3

        byte bananas = 5;
        byte bananasWeight = 80;
        int milk = 200;
        float milkWeight = (milk/100)*105;
        byte icecream = 2;
        byte icecreamWeight = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        float coctail = (bananas*bananasWeight)+milkWeight+(icecream*icecreamWeight)+(eggs*eggWeight);
        float totalWeigthCoctail = coctail / 1000;
        System.out.println("Общий вес завтрака " + totalWeigthCoctail + "кг");

        //Задание 4

        byte boxerWeight = 100;
        byte targetWeightloss = 7;
        int targetWeightLoss = targetWeightloss * 1000;
        int weightLossmin = 250;
        int weightLossmax = 500;
        int minDays = targetWeightLoss / weightLossmax;
        int maxDays = targetWeightLoss / weightLossmin;
        float averageDays = (minDays+maxDays)/2;
        System.out.println("Минимальное количество дней для похудения "+minDays);
        System.out.println("Максимальное количество дней для похудения "+maxDays);
        System.out.println("Среднее количество дней для похудения "+averageDays);


        //Задание 5


        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KrisSalary = 76230;
        float increaseSalary = 1.1f;
        float MashaNewSalary = MashaSalary*increaseSalary;
        float DenisNewSalary = DenisSalary*increaseSalary;
        float KrisNewSalary = KrisSalary*increaseSalary;
        byte year = 12;
        int annualIncomeMasha = MashaSalary*year;
        int annualIncomeDenis = DenisSalary*year;
        int annualIncomeKris = KrisSalary*year;
        float annualIncomeMashaNew = MashaNewSalary*year;
        float annualIncomeDenisNew = DenisNewSalary*year;
        float annualIncomeKrisNew = KrisNewSalary*year;
        float differenceSalaryMasha = MashaNewSalary-MashaSalary;
        float differenceSalaryDenis = DenisNewSalary-DenisSalary;
        float differenceSalaryKris = KrisNewSalary-KrisSalary;
        System.out.println("Маша теперь получает "+ MashaNewSalary+"рублей. "+"Годовой доход вырос на "+differenceSalaryMasha+"рублей");
        System.out.println("Денис теперь получает "+ DenisNewSalary+"рублей. "+"Годовой доход вырос на "+differenceSalaryDenis+"рублей");
        System.out.println("Кристина теперь получает "+ KrisNewSalary+"рублей. "+"Годовой доход вырос на "+differenceSalaryKris+"рублей");



    }
}


