package ZadanieLekcja12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tekst {
    public static void main(String[] args) {
        String tekst="Bicycle, also called bike, two-wheeled steerable machine that is pedaled by the rider’s feet. On a standard bicycle the wheels are mounted in-line in a metal frame,\n" +
                "with the front wheel held in a rotatable fork. The rider sits on a saddle and steers by leaning and turning handlebars that are attached to the fork.\n" +
                "The feet turn pedals attached to cranks and a chainwheel. Power is transmitted by a loop of chain connecting the chainwheel to a sprocket on the rear wheel.\n" +
                "Riding is easily mastered, and bikes can be ridden with little effort at 16–24 km (10–15 miles) per hour—about four to five times the pace of walking.\n" +
                "The bicycle is the most efficient means yet devised to convert human energy into mobility.\n" +
                "\n" +
                "Bicycles are widely used for transportation, recreation, and sport (see cycling). Throughout the world,\n" +
                "bicycles are essential to moving people and goods in areas where there are few automobiles. Globally,\n" +
                "there are twice as many bicycles as automobiles, and they outsell automobiles three to one. The Netherlands,\n" +
                "Denmark, and Japan actively promote bicycles for shopping and commuting. In the United States, bike paths have been\n" +
                "constructed in many parts of the country, and bicycles are encouraged by the United States government as an alternative to automobiles.\"\n";

            Pattern pattern = Pattern.compile(" and ");
            Matcher matcher= pattern.matcher(tekst);
            int i= 0;

        while (matcher.find()) {
            i++;
        }
        System.out.println(i);
    }
    public static boolean wordAnd(String word) {
        Pattern pattern=Pattern.compile("\\+48-\\d{3}\\-\\d{3}\\-\\d{3}");
        Matcher matcher= pattern.matcher(word);
        return matcher.matches();
    }
}


// Kod nie działa poprawnie. Powinnien zwracać informacje o ilości wystąpień słowa and