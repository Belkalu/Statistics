package ru.netology.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void summAllMonthsSales() {
        StatsService service = new StatsService();

        int[] summSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.summMonths(summSales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Сумма всех продаж = " + actual);
    }

    @Test

    public void averageAllMonthsSales() {
        StatsService service = new StatsService();

        int[] summSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageAmount(summSales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж в месяц = " + actual);
    }

    @Test

    public void monthMaxxSales() {
        StatsService service = new StatsService();

        int[] summSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSalesMonth(summSales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц максимальных продаж = " + actual);
    }

    @Test

    public void monthMinSales() {
        StatsService service = new StatsService();

        int[] summSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSalesMonth(summSales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Месяц минимальных продаж = " + actual);
    }

    @Test

    public void amountMonthsBelowAverage() {
        StatsService service = new StatsService();

        int[] summSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthsBelowAverage(summSales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего = " + actual);
    }

    @Test

    public void amountMonthsAboveAverage() {
        StatsService service = new StatsService();

        int[] summSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthsAboveAverage(summSales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев, в которых продажи были выше среднего = " + actual);
    }

}