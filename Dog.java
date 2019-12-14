package ZadanieLekcja9.Dziedziczenie;

public class Dog extends Animal {
   private String rase;

    public Dog (String name, int numberOfLegs, int numberOfWings, String rase) {
        super(name, numberOfLegs, numberOfWings);
        this.rase=rase;
    }
    @Override
    public void fly() {
        System.out.println("Chodze");
    }
}
