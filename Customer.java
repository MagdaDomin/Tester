package ZadanieLekcja9.Kompozycja;

public class Customer {
    String name;
    String surname;
    private int clientID;

    public Customer(String name, String surname, int clientID)  {
        if (name.length() > 30 || surname.length() > 30) {
            System.out.println("error");
        }
        this.name = name;
        this.surname = surname;
        this.clientID = clientID;

    }
}
