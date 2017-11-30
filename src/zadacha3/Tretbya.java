package zadacha3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Tretbya {
    public static void main(String[] args) {
        int[] mass = {1,4,5,1,1,3};
        System.out.println(kolichNepovtorElemov(mass));

    }

    static int kolichNepovtorElemov(int[] mass) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<mass.length;i++){
            set.add(mass[i]);
        }
        return set.size();
    }

}