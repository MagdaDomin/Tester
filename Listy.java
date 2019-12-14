package ZadanieLekcja10;

import java.util.ArrayList;
//Zadanie 4
public class Listy {
    public static ArrayList listcompare(ArrayList array, ArrayList array2) {
        ArrayList<Boolean> wynik=new ArrayList<>();
        for (int i=0; i < array.size(); i++) {
            if (array.get(i) == array2.get(i)) {
                wynik.add(true);
            } else {
                wynik.add(false);
            }
        }
        return wynik;
    }
    //zadanie5
    public static ArrayList listcompare2(ArrayList array, ArrayList array2) {
        ArrayList wynik=new ArrayList<>();
        for (int i=0; i < array.size(); i++) {
            if (array.get(i) == array2.get(i)) {
                wynik.add(array.get(i));
            }
        }
        return wynik;
    }

    public static void main(String[] args) {
//        var arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(5);
        listcompare(arrayList,arrayList2);

        System.out.println(listcompare(arrayList,arrayList2));
        System.out.println(listcompare2(arrayList,arrayList2));
    }

}