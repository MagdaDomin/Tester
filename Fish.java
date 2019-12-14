package ZadanieLekcja9.Dziedziczenie;

public class Fish extends Animal {
    private int lenght;

    public Fish (String name, int numberOfLegs, int numberOfWings, int lenght) {
        super(name, numberOfLegs, numberOfWings);
        this.lenght=lenght;
    }
    @Override
    public void fly() {
        System.out.println("Tylko plywam");
    }
}
