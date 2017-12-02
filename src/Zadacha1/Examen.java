package Zadacha1;

import java.util.Random;

public class Examen {
    public static int polychitbOcenky(){
        Random random=new Random();
        return random.nextInt(Fakyltet.MAX_BAL);
    }
}
