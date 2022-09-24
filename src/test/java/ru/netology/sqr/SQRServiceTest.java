package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    //Количество квадратных чисел.
    @Test
    public void sqareTest() {
        SQRService service = new SQRService();

        int actual = service.sqare(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    //Тестирование граничных значений в начале заданной границы.
    @Test
    public void takeAwayBorderTest() {
        SQRService service = new SQRService();

        int actual = service.takeAwayBorder(200, 300);
        int expected = 200;
        Assertions.assertEquals(expected, actual);
    }

    //Тестирование граничных значений на конце заданной границы.
    @Test
    public void ultimateBorderTest() {
        SQRService service = new SQRService();

        int actual = service.ultimateBorder(200, 300);
        int expected = 300;
        Assertions.assertEquals(expected, actual);
    }
}