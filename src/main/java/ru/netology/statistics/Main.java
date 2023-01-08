package ru.netology.statistics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SalesAmountService service = new SalesAmountService();


        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println();
        System.out.println("Статистика по продажам в каждом месяце: " + Arrays.toString(months));
        System.out.println();

        System.out.println(" Сумма всех продаж: " + service.getSalesSum(months));
        System.out.println(" Средняя сумма продаж в месяц: " + service.getMonthlySalesSum(months));
        System.out.println(" Номер месяца, в котором был максимум продаж: " + service.getMaxMonth(months) + "-й ");
        System.out.println(" Номер месяца, в котором был минимум продаж: " + service.getMinMonth(months) + "-й ");
        System.out.println(" Количество месяцев, в которых продажи были ниже среднего: " + service.getSalesBelowTheAverage(months));
        System.out.println(" Количество месяцев, в которых продажи были выше среднего: " + service.getSalesAboveTheAverage(months));

    }
}
