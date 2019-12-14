package ZadanieLekcja12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Zadanie 1

public class FormatNumeru {
    public static void main(String[] args) {
        String formatNumeru1="48123123123";
        String formatNumeru2= "+48123123123";
        String formatNumeru3= "+0048123123123";
        String formatNumeru4= "+00123456789";
        String formatNumeru5= "+48-123-123-123";
        System.out.println(verifyNumber(formatNumeru1));
        System.out.println(verifyNumber(formatNumeru2));
        System.out.println(verifyNumber(formatNumeru3));
        System.out.println(verifyNumber(formatNumeru4));
        System.out.println(verifyNumber(formatNumeru5));

    }
    public static boolean verifyNumber(String number) {
        Pattern pattern=Pattern.compile("\\+48-\\d{3}\\-\\d{3}\\-\\d{3}");
        Matcher matcher= pattern.matcher(number);
        return matcher.matches();
    }
}


// To zadanie jest niestety zle napisane :(
// Przekazujesz kilka numerow na raz, potem sprawdzasz ze jakis z nich spelnia wyrazenie regularne.
// Powinnas zrobic liste numerow telefonów i sprawdzic wyrazenie dla kazdego z nich z osobna