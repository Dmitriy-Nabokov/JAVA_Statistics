package ru.netology.statistics;

//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import ru.netology.statistics.SalesAmountService;

public class SalesAmountServiceTest {

    @Test
    //Сумма всех продаж
    public void shouldFindSalesSum() {
        SalesAmountService service = new SalesAmountService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountOfSales = 180;
        int actualAmountOfSales = service.getSalesSum(months);

        Assertions.assertEquals(expectedAmountOfSales, actualAmountOfSales);
    }

    @Test
    //Средняя сумма продаж в месяц
    public void shouldFindMonthlySum() {
        SalesAmountService service = new SalesAmountService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthlySalesSum = 15;
        int actualAmountOfSalesSum = service.getMonthlySalesSum(months);

        Assertions.assertEquals(expectedMonthlySalesSum, actualAmountOfSalesSum);
    }

    @Test
    //Номер месяца, в котором был максимум продаж
    public void shouldFindMaxMonth() {
        SalesAmountService service = new SalesAmountService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(months);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    //Номер месяца, в котором был минимум продаж
    public void shouldFindMinMonth() {
        SalesAmountService service = new SalesAmountService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinMonth(months);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    //Количество месяцев, в которых продажи были ниже среднего
    public void shouldFindBelowTheAverage() {
        SalesAmountService service = new SalesAmountService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowTheAverage = 5;
        int actualBelowTheAverage = service.getSalesBelowTheAverage(months);

        Assertions.assertEquals(expectedBelowTheAverage, actualBelowTheAverage);
    }

    @Test
    //Количество месяцев, в которых продажи были ниже среднего
    public void shouldFindAboveTheAverage() {
        SalesAmountService service = new SalesAmountService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveTheAverage = 5;
        int actualAboveTheAverage = service.getSalesAboveTheAverage(months);

        Assertions.assertEquals(expectedAboveTheAverage, actualAboveTheAverage);
    }

}
