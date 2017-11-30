package Zadacha4;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Chetvertaya<E> {
    public static void main(String[] args) throws FileNotFoundException {
        String LoginsAndPassword = FileUtils.read("src/Zadacha4/LoginsAndPassword.txt");
        String[]massiv=LoginsAndPassword.split("\n");
        for (int i=0;i<10;i++){
            System.out.println(massiv[i]);
        }

    }
}
