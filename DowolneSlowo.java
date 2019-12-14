package ZadanieLekcja8;

public class DowolneSlowo {
    //Zadanie1
    public static void dowolneSlowo(String slowo) {
        int iterator = 0;
        while (iterator < 4) {
            iterator++;
            System.out.println(iterator + slowo);
        }
    }

    public static void main(String[] args) {
        DowolneSlowo.dowolneSlowo("kot");
//        zadanie.dowolneSlowo("2.pies");
//        zadanie.dowolneSlowo("3.mysz");
    }
}
