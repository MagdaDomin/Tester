package ZadanieLekcja10;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Tablica {

    public static void printMinV(int[] tablica) {
        int minWartosc = tablica[0];
        for (int i : tablica) {
            if (i < minWartosc) {
                minWartosc = i;
            }
        }
        System.out.println(minWartosc);
    }

    public static void zadanie2(int[] tablica) {
        int[] tablica2 = new int[tablica.length];

        for (int i = 0; i < tablica.length; i++) {
            tablica2[i] = tablica[tablica.length - i-1];
        }
        System.out.println(Arrays.toString(tablica));
        System.out.println(Arrays.toString(tablica2));
        Collections.reverse(Arrays.asList(tablica)); //odwrocenie
    }

    //Zadanie1
    public static void main(String[] args) {
        int[] tablica = {1, 12, 3, -1, 0};
        printMinV(tablica);

        //Zadanie2
        zadanie2(tablica);

    }
}
