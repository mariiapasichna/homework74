package com.mariiapasichna;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    /*4) В банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется к сумме вклада
    ежемесячно.*/

    public static void main(String[] args) {
        double S = 500;
        double N = 3;
        double rate = 0.015;
        for (int i = 1; i <= 12 * N; i++) {
            S += S * rate;
        }
        S = new BigDecimal(S).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println("The deposit amount in " + N + " years will be " + S + " $");
    }
}
