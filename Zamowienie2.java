package ZadanieLekcja8;

public class Zamowienie2 {
    private float wartoscZamowienia;
    private int numerZamowienia;
    private String nazwaZamawiajacego;
    private int ilosc;

    public void setWartoscZamowienia(float wartoscZamowienia) {
        if (wartoscZamowienia <= 0) {
            System.out.println(" Wartosc zamowienia musi byc dodatnia");
            this.wartoscZamowienia=-1;
        } else {
            this.wartoscZamowienia = wartoscZamowienia;
        }
    }
    public void setIlosc(int ilosc) {
        if (ilosc < 1) {
            System.out.println("Ilosc nie moze byc mniejsza niz 0");
            this.ilosc= -1;
        } else {
            this.ilosc=ilosc;
        }
    }

    public void setNumerZamowienia(int numerZamowienia) {
        this.numerZamowienia = numerZamowienia;
    }

    public void setNazwaZamawiajacego(String nazwaZamawiajacego) {
        this.nazwaZamawiajacego = nazwaZamawiajacego;
    }

    public float getWartoscZamowienia() {
        return wartoscZamowienia;
    }

    public int getNumerZamowienia() {
        return numerZamowienia;
    }

    public String getNazwaZamawiajacego() {
        return nazwaZamawiajacego;
    }

    public int getIlosc() {
        return ilosc;
    }
}

