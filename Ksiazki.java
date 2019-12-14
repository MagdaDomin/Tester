package ZadanieLekcja12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ksiazki {
    public static void main(String[] args) {
        String ksiazka1= "\"Everyday Italian\" is a COOKING book written by Giada De Laurentiis in 2005. It costs 30.00";
        String ksiazka2= "\"Harry Potter\" is a CHILDREN book written by J K. Rowling in 2005. It costs 29.99";
        String ksiazka3= "\"Learning XML\" is a WEB book written by Erik T. Ray in 2005. It costs 39.95";
        parseBookData(ksiazka1);
    }

    public static void parseBookData(String bookData){
        Pattern groupPattern = Pattern.compile("^\"(.*?)\".+?([A-Z]+).+?by (.+) in.+?(\\d+)..+?(\\d{1,}.\\d{1,})");
        Matcher matcher = groupPattern.matcher(bookData);
        matcher.find();
        System.out.println(matcher.group(3) + ", " + matcher.group(1)+ ", " + matcher.group(2) + ", " + matcher.group(4) + ", " + matcher.group(5));

    }

}



// Ten kod niestety nie działa. Nic sie nie wypisuje. Zadanie polega na wypisaniu  na ekran odpowiednich informacji ktore mozna wyciagnac z teksu
// Podpowiedz : Portaktuj te 3 linijki teksu jako 3 osobne String-i a nie 1 duzy