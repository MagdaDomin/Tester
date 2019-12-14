package ZadanieLekcja9.Dziedziczenie;

public class Animal {

    private String name;
    private int numberOfLegs;
    private int numberOfWings;

    public Animal(String name, int numberOfLegs, int numberOfWings) {
        this.name=name;
        this.numberOfLegs=numberOfLegs;
        this.numberOfWings=numberOfWings;
    }

    public void swim() {
        System.out.println("plywam");
    }

    public void fly() {
        System.out.println("fruwam");
    }

}
