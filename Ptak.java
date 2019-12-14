package ZadanieLekcja10.zadanie6;

public class Ptak implements FlyingObject {

    String name;
    int height;

    public Ptak (String name, int height) {
        this.name=name;
        this.height=height;
    }

    @Override
    public boolean start() {
        return true;
    }

    @Override
    public double przyspisz() {
        return 50D;
    }

    @Override
    public String laduj() {
        return "w gniezdzie";
    }

    @Override
    public String lecProsto() {
        return "z wiatrem";
    }

    @Override
    public String lecWPrawo() {
        return "pod wiatr";
    }

    @Override
    public String lecWLewo() {
        return "na polnoc";
    }
}
