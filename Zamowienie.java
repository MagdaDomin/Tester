package ZadanieLekcja8;

public class Zamowienie {
    float wartoscZamowienia;
    int numerZamowienia;
    private String nazwaZamawiajacego;
    int ilosc;

    Zamowienie(float wartoscZamowienia, int numerZamowienia, String nazwaZamawiajacego, int ilosc) {
        if (wartoscZamowienia <= 0) {
            System.out.println(" Wartosc zamowienia musi byc dodatnia");
            this.wartoscZamowienia=-1;
        } else {
            this.wartoscZamowienia = wartoscZamowienia;
        }
        if (ilosc < 1) {
            System.out.println("Ilosc nie moze byc mniejsza niz 0");
            this.ilosc= -1;
        } else {
            this.ilosc=ilosc;
        }
        this.numerZamowienia=numerZamowienia;
        this.nazwaZamawiajacego=nazwaZamawiajacego;
    }

}

