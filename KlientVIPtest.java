package ZadanieLekcja8;

public class KlientVIPtest {

    public static void main(String[] args) {
        KlientVIP Vip= new KlientVIP();
        KlientVIP Vip2= new KlientVIP("aa@ajk.pl",500);
        KlientVIP Vip3= new KlientVIP("kot", 200,"rr@jj.pl");

        System.out.println(Vip.email);
        System.out.println(Vip.limitkredytu);
        System.out.println(Vip.nazwa);
        System.out.println(Vip2.email);
        System.out.println(Vip2.limitkredytu);
        System.out.println(Vip2.nazwa);
        System.out.println(Vip3.email);
        System.out.println(Vip3.limitkredytu);
        System.out.println(Vip3.nazwa);
    }
}
