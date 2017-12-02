package Zadacha1;

public class Enter {
    public static void main(String[] args) {
        Fakyltet fakyltet = new Fakyltet();
        for (int i = 0; i < 10; i++) {
            Abiturient disciple = new Abiturient(Examen.polychitbOcenky(), Examen.polychitbOcenky(), Examen.polychitbOcenky(), "SchetkikIzRusskih" + i);
            if (disciple.getMidleRaiting() >= Fakyltet.MIN_BAL) {
                fakyltet.getZachislennye().add(disciple);
            }
        }
        for (Abiturient abi : fakyltet.getZachislennye()){
            System.out.println("Имя - "+abi.getName());
            System.out.println("Оценка по биологии -  "+abi.getBiologicRating());
            System.out.println("Оценка по английскому  -  "+abi.getEnglishRating());
            System.out.println("Оценка по математике -  "+abi.getMathRating());
        }
    }
}
