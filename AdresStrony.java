package ZadanieLekcja12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdresStrony {
    //Zadanie2
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("http://w{3}.[a-zA-Z0-9]+.[a-zA-Z]{2,3}|https://w{3}.[a-zA-Z0-9]+.[a-zA-Z]{2,3}");
        String strona1="https://www.onet.pl";
        String strona2= "http://www.onet.pl";
        Matcher matcher1=pattern.matcher(strona1);
        Matcher matcher2=pattern.matcher(strona2);
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }

}


// Tutaj jest wyrazenie regularne ale nie ma danych testowych do jego sprawdzenia.
// Prosze zaproponuj dane testowe zgodne z wymaganiami i sprawdz czy wyrazenie dziala jak nalezy