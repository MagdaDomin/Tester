package ZadanieLekcja10.zadanie6;

public class Main {

    public static void main(String[] args) {

        Ptak orzel = new Ptak("Bielik", 20);
        Samolot boeing = new Samolot(50, 100);
        Latawiec x = new Latawiec("zielony", 40);

        orzel.start();
        boeing.start();
        x.start();

        FlyingObject flyingObject= new Ptak("Edi", 3);
    }
}
