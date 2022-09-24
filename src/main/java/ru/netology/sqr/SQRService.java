package ru.netology.sqr;



public class SQRService {

    //Количество квадратных чисел.
    public int sqare(int start, int end) {
        int check = 0;

        for (int i = 10; i <= 99; i++) {
            int sqar = i * i;
            if (sqar >= start) {
                if (sqar <= end) {
                    check++;
                }
            }
        }
        return check;
    }

    //Тестирование граничных значений в начале заданной границы.
    public int takeAwayBorder(int startBorder, int endBorder) {
        int take = startBorder;

        for (int i = startBorder; i <= startBorder; i--) {
            if (take <= startBorder) {
                int in = i - 1;
                if (in < startBorder) {
                    break;
                }
            }
        }
        return take;
    }

    //Тестирование граничных значений на конце заданной границы.
    public int ultimateBorder(int startBorder, int endBorder) {
        int ultimate = endBorder;

        for (int i = endBorder; i <= endBorder; i++) {
            if (ultimate <= endBorder) {
                int ult = i + 1;
                if (ult > endBorder) {
                    break;
                }
            }
        }
        return ultimate;
    }
}
