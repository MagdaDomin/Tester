package ZadanieLekcja9.Dziedziczenie;

public class ZOO {

    public static void main(String[] args) {

        Dog terrier= new Dog ("Dzeki",4,0,"terrier");
        Fish gold= new Fish("X",0,0,10);
        Bird eagle= new Bird("Orzel",2,2,"brazowy");

        terrier.swim();
        gold.swim();
        eagle.fly();
    }

}
