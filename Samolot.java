package ZadanieLekcja10.zadanie6;

public class Samolot implements FlyingObject {

    int lenght;
    int nrOfPassengers;

    public Samolot (int lenght, int nrOfPassengers) {
        this.lenght=lenght;
        this.nrOfPassengers=nrOfPassengers;
    }

    @Override
    public boolean start() {
        return true;
    }

    @Override
    public double przyspisz() {
        return 500D;
    }

    @Override
    public String laduj() {
        return "na lotnisku";
    }

    @Override
    public String lecProsto() {
        return "autopilot";
    }

    @Override
    public String lecWPrawo() {
        return "autopilot";
    }

    @Override
    public String lecWLewo() {
        return "autopilot";
    }
}
