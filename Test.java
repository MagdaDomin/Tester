package ZadanieLekcja8;

public class Test {

    public static void main(String[] args) {
        //Zadanie 2
        String y= "abc";
        int q=12;


        Zamowienie abc= new Zamowienie(20F, 1, "ZadanieLekcja8.Test", 10);
        //lub
        Zamowienie2 zamowienie2= new Zamowienie2();
        zamowienie2.setIlosc(10);
        zamowienie2.setNazwaZamawiajacego("ZadanieLekcja8.Test");
        zamowienie2.setNumerZamowienia(1);
        zamowienie2.setWartoscZamowienia(20F);
    }
}
