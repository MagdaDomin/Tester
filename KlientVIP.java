package ZadanieLekcja8;

public class KlientVIP {
    String nazwa;
    float limitkredytu;
    String email;

    public KlientVIP () {
        nazwa="Kowalski";
        limitkredytu= 1000F;
        email="k@onet.pl";
    }

    public KlientVIP(String email, float limitkredytu) {
        nazwa="Kwiatkoski";
        this.email=email;
        this.limitkredytu=limitkredytu;
    }

    public KlientVIP(String nazwa, float limitkredytu, String email) {
        this.nazwa=nazwa;
        this.limitkredytu=limitkredytu;
        this.email=email;
    }

    public String getNazwa() {
        return nazwa;
    }

    public float getLimitkredytu() {
        return limitkredytu;
    }

    public String getEmail() {
        return email;
    }
}
