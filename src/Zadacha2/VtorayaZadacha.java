package Zadacha2;

import java.util.Random;
import java.util.Scanner;

public class VtorayaZadacha {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int chisloN = random.nextInt(999) + 1;
        int poputokK = random.nextInt(10) + 10;
        while (poputokK > 0) {
            poputokK--;
            int userNum = scanner.nextInt();
            if (chisloN > userNum) {
                System.out.println("Введите больше");
            } else if (userNum > chisloN) {
                System.out.println("Введите меньшее");
            } else {
                System.out.println("Угадал");
                return;
            }
        }
        System.out.println("Проиграл");
    }
}

