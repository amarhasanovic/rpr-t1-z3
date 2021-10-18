package ba.unsa.etf.rpr;

public class Main {
    private static Sat s = new Sat(15, 30, 45);
    public static void main(String[] args) {
        s.ispisi();
        s.sljedeci();
        s.ispisi();
        s.pomjeriZa(-48);
        s.ispisi();
        s.postavi(0, 0, 0);
        s.ispisi();
    }
}
