package Zadacha1;

public class Abiturient {
    private int englishRating;
    private int mathRating;
    private int biologicRating;
    private String Name;

    public int getEnglishRating() {
        return englishRating;
    }

    public int getMathRating() {
        return mathRating;
    }

    public int getBiologicRating() {
        return biologicRating;
    }

    public String getName() {
        return Name;
    }

    public Abiturient(int englishRating, int mathRating, int biologicRating, String name) {
        this.englishRating = englishRating;
        this.mathRating = mathRating;
        this.biologicRating = biologicRating;
        Name = name;
    }

    public double getMidleRaiting(){
      return (englishRating+mathRating+biologicRating)*1.0/3;
    };
}