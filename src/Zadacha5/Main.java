package Zadacha5;/*
1.Задача на взаимодействие между классами. Разработать систему «Вступительные экзамены».
    Абитуриент регистрируется на Факультет, сдает Экзамены. Преподаватель выставляет Оценку.
    Система подсчитывает средний бал и определяет Абитуриента, зачисленного в учебное заведение.
    2.Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать.
    После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
    В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
    3.Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.
    4.Дан файл  с логинами и паролями. Найдите топ10 самых популярных паролей.
    5.Ход коня по шахматной доске
    Вводиться текущее положение коня и клетка в которую пробуют его передвинуть

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите начальные координаты,например: B 5");
        String start = scanner.nextLine();
        System.out.println("Введите КУДА топать Плотве,например : F 4");
        String finish = scanner.nextLine();
        int startCifra = indexCifru(start.split(" ")[1]);
        int startBykva = indexBukvy(start.split(" ")[0]);
        int finishCifra = indexCifru(finish.split(" ")[1]);
        int finishBykva = indexBukvy(finish.split(" ")[0]);
        int raznicaCifr = Math.abs(startCifra - finishCifra);
        int raznicaBykv = Math.abs(startBykva - finishBykva);
        if ((raznicaBykv == 2 && raznicaCifr == 1) || (raznicaBykv == 1 && raznicaCifr == 2)){
            System.out.println("Плотва довольна");
        } else {
            System.out.println("ПФФФРРРРРРРРР");
        }
    }

    private static int indexCifru(String cifra) {
        String[] poleCifr = {"1", "2", "3", "4", "5", "6", "7", "8"};
        int index = 0;
        for (int i = 0; i < poleCifr.length; i++) {
            if (poleCifr[i].equals(cifra)) {
                index = i;
            }
        }
        return index;
    }

    private static int indexBukvy(String bukva) {
        String[] poleBykv = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int index = 0;
        for (int i = 0; i < poleBykv.length; i++) {
            if (poleBykv[i].equals(bukva.toLowerCase())) {
                index = i;
            }
        }
        return index;
    }

}