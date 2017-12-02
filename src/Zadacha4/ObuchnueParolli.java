package Zadacha4;

public class ObuchnueParolli implements Comparable{
    private int schetchikSovpadeniya=1;
    private String parol;

    public ObuchnueParolli(String parolb){
        parol=parolb;
    }

    public String getParol() {
        return parol;
    }

    public int getSchetchikSovpadeniya() {
        return schetchikSovpadeniya;
    }

    public void setSchetchikSovpadeniya(int schetchikSovpadeniya) {
        this.schetchikSovpadeniya = schetchikSovpadeniya;
    }

    @Override
    public int compareTo(Object o) {
        return ((ObuchnueParolli)o).getSchetchikSovpadeniya() - this.schetchikSovpadeniya;
    }
}

