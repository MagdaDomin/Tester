package ZadanieLekcja10;

public abstract class ToString {
//Zadanie 3
    public static void main(String[] args) {
        ToStringPrawidlowo[] tablica={new ToStringPrawidlowo(),new ToStringPrawidlowo(),new ToStringPrawidlowo(), new ToStringPrawidlowo()};
       for (ToStringPrawidlowo toStringPrawidlowo:tablica) {
           System.out.println(toStringPrawidlowo);
       }
    }

}
class ToStringPrawidlowo {
    @Override
    public String toString() {
        return "to jest klasa toString";
    }
}
