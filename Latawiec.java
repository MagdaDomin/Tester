package ZadanieLekcja10.zadanie6;

// TEN KOD NIE DZIALA. Nie mozesz robic implementacji interfejsu ktory zakomentowalas .. To samo w innych klasach z tego zadania
public class Latawiec implements FlyingObject {

    String color;
    int size;

    public Latawiec (String color, int size) {
        this.color=color;
        this.size=size;
    }

    @Override
    public boolean start() {
        return false;
    }

    @Override
    public double przyspisz() {
        return 5D;
    }

    @Override
    public String laduj() {
        return "na ziemi";
    }

    @Override
    public String lecProsto() {
        return "z wiatrem";
    }

    @Override
    public String lecWPrawo() {
        return "po pociagnieciu sznurka w prawo";
    }

    @Override
    public String lecWLewo() {
        return "po pociagnieciu sznurka w lewo";
    }
}
