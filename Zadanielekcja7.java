
package ZadanieLekcja7;

public class Zadanielekcja7 {

    static void iloscDniWRoku(int rok, String miesiac){
        switch (miesiac) {
            case "stycznen":
            case "marzec":
            case "maj":
            case "lipiec":
            case "sierpien":
            case "pazdziernik":
            case "grudzien":
                System.out.println(31);
                break;
            case "wrzesien":
            case "kwiecien":
            case "czerwiec":
            case"listopad":
                System.out.println(30);
                break;
            case "luty":
                if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
        }
    }

    public static void main(String[] args) {

// Zadanie 1
//        1) Zadeklaruj zmienną typu double równą 50
//        2) Zadekraluj drugą zmienna double równą 30

        System.out.println("dodawanie");
        System.out.println(50D + 30D);

        System.out.println("mnożenie");
        double wynikMozenie = (50D + 30D) * 30;
        System.out.println(wynikMozenie);

        System.out.println("dzielenie");
        double wynikDzielenie = wynikMozenie / 70D;
        System.out.println(wynikDzielenie);

        if (wynikMozenie % 70 >= 15) {
            System.out.println("Reszta z dzienia większa niż 15");
        }

//        Zadanie 2

        int a = 10;
        int b = 20;
        boolean warunek = false;

        if (a > 0 && b > 0 && warunek == false) {
            System.out.println("Tester");
        } else {
            System.out.println("Automatyczny");
        }

//Zadanie 3
        String miesiace = "grudzien";
        switch (miesiace) {
            case "grudzien":
            case "styczen":
            case "luty":
                System.out.println("Zima");
                break;
            case "marzec":
            case "kwiecien":
            case "maj":
                System.out.println("Wiosna");
                break;
            case "czerwiec":
            case "lipiec":
            case "sierpien":
                System.out.println("Lato");
                break;
            case "wrzesien":
            case "pazdziernik":
            case "listopad":
                System.out.println("Jesien");
                break;
        }

// Zadanie 4

        int rok = 1234;

        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nieprzestepny");
        }

// Zadanie 5

        iloscDniWRoku(2000,"luty");
        iloscDniWRoku(2001,"luty");
        iloscDniWRoku(2002,"luty");
        iloscDniWRoku(2003,"luty");
        iloscDniWRoku(2004,"luty");
    }

}