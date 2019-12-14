package ZadanieLekcja10.zadanie6;

import java.util.ArrayList;
//Zadanie7
public class JavaGenerics {

    FlyingObject objectForPtak= new FlyingObject() {
        @Override
        public boolean start() {
            return false;
        }

        @Override
        public double przyspisz() {
            return 0;
        }

        @Override
        public String laduj() {
            return null;
        }

        @Override
        public String lecProsto() {
            return null;
        }

        @Override
        public String lecWPrawo() {
            return null;
        }

        @Override
        public String lecWLewo() {
            return null;
        }
    };

}

class FlyingObjectClass<T,t> {
    ArrayList<T>ptaki=new ArrayList<>();
    public void dodajDoFL(T t){ ptaki.add(t);}
}

