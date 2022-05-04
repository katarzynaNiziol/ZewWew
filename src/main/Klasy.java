package main;

public class Klasy {

    public static void main(String[] args) {

        Zewnetrzna z = new Zewnetrzna();
        Zewnetrzna.Wewnetrzna w = z.new Wewnetrzna();

        w.testNaZew ();
        System.out.println("***********");
        z.a = 100;
        w.testNaZew();

    }
}
