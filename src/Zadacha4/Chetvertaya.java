package Zadacha4;

import java.io.FileNotFoundException;
import java.util.*;

public class Chetvertaya {
    public static void main(String[] args) throws FileNotFoundException {
        String LoginsAndPassword = FileUtils.read("src/Zadacha4/LoginsAndPassword.txt");
        String[] massiv = LoginsAndPassword.split("\n");
        String[] paroli = new String[massiv.length];
        for (int i = 0; i < massiv.length; i++) {
            paroli[i] = massiv[i].split(" ")[1];
        }
        List<ObuchnueParolli> korobkaGdeParoli = new ArrayList<>();
        for (int i = 0; i < paroli.length; i++) {
            boolean sovpadPparol=false;
            for (int x = 0; x < korobkaGdeParoli.size(); x++) {
                if (paroli[i].equals(korobkaGdeParoli.get(x).getParol())) {
                    korobkaGdeParoli.get(x).setSchetchikSovpadeniya(korobkaGdeParoli.get(x).getSchetchikSovpadeniya()+1);
                    sovpadPparol=true;
                    break;
                }
            }
            if (!sovpadPparol){
                korobkaGdeParoli.add(new ObuchnueParolli(paroli[i]));
            }
        }
        Collections.sort(korobkaGdeParoli);
        for (int i=0;i<10;i++){
            System.out.println("pass - "+korobkaGdeParoli.get(i).getParol()+"   naideno "+korobkaGdeParoli.get(i).getSchetchikSovpadeniya());
        }
    }
}
