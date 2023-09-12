package ru.netology.stats.service;

public class StatsService {
    public int summMonths(int[] summSales) {
        int month = 0;
        for (int i = 0; i < summSales.length; i++) {
            month = month + summSales[i];
        }
        return month;
    }

    public int averageAmount(int[] summSales) {
        int averageNumber = summMonths(summSales) / 12;
        return averageNumber;
    }

    public int maxSalesMonth(int[] summSales) {
        int maxMonth = 0;
        for (int i = 0; i < summSales.length; i++) {
            if (summSales[i] >= summSales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] summSales) {
        int minMonth = 0;
        for (int i = 0; i < summSales.length; i++) {
            if (summSales[i] <= summSales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(int[] summSales) {
        int minMonthsSumm = 0;
        for (int i = 0; i < summSales.length; i++) {
            if (summSales[i] < averageAmount(summSales)) {
                minMonthsSumm++;
            }
        }
        return minMonthsSumm;
    }

    public int monthsAboveAverage(int[] summSales) {
        int maxMonthsSumm = 0;
        for (int i = 0; i < summSales.length; i++) {
            if (summSales[i] > averageAmount(summSales)) {
                maxMonthsSumm++;
            }
        }
        return maxMonthsSumm;
    }
}