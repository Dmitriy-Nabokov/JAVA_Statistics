package ru.netology.statistics;

public class SalesAmountService {


    public int getSalesSum(int[] months) {
        // Сумма всех продаж

        int salesSum = 0;
        for (int i = 0; i < months.length; i++) {
            salesSum = salesSum + months[i];
        }
        return salesSum;
    }

    public int getMonthlySalesSum(int[] months) {
        // Средняя сумма продаж в месяц

        int monthlySalesSum = 0;
        for (int i = 0; i < months.length; i++) {
            monthlySalesSum = monthlySalesSum + months[i];
        }
        monthlySalesSum = monthlySalesSum / (months.length);
        return monthlySalesSum;

    }

    public int getMaxMonth(int[] months) {
// Номер месяца, в котором был пик продаж (первый метод)

        int maxMonth = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] >= months[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] months) {
        // Номер месяца, в котором был минимум продаж (второй метод)

        int minMonth = 0;
        int month = 0;
        for (long sale : months) {
            if (sale <= months[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getSalesBelowTheAverage(int[] months) {
        // Количество месяцев, в которых продажи были ниже среднего

        int monthlySalesSum = getMonthlySalesSum(months);
        int monthsBelowTheAverage = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] < monthlySalesSum) {
                monthsBelowTheAverage++;
            }
        }
        return monthsBelowTheAverage;
    }

    public int getSalesAboveTheAverage(int[] months) {
        // Количество месяцев, в которых продажи были выше среднего

        int monthlySalesSum = getMonthlySalesSum(months);
        int monthsAboveTheAverage = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] > monthlySalesSum) {
                monthsAboveTheAverage++;
            }
        }
        return monthsAboveTheAverage;
    }
}