package ZadanieLekcja9.Dziedziczenie;

public class Bird extends Animal {
    private String color;

    public Bird (String name, int numberOfLegs, int numberOfWings, String color) {
        super(name, numberOfLegs, numberOfWings);
        this.color=color;
    }
    @Override
    public void swim() {
        System.out.println("Tylko fruwam");
    }
}
