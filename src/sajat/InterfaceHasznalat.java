package sajat;

public class InterfaceHasznalat {

    public static void main(String[] args) {
        Ajto ajto = new Ajto();
        Esernyo esernyo = new Esernyo();

        Kinyithato egyNyithato = new Ajto();
        Kinyithato[] kinyithatok = {ajto, esernyo, egyNyithato, new Laptop()};

        for (Kinyithato nyithato : kinyithatok) {
            System.out.println(nyithato);
            nyithato.kinyit();
            if (nyithato instanceof Laptop) {

                // a kasztolás az kisebb preferenciával rendelkezik, mint a pont operátor
                ((Laptop) nyithato).bekapcsol();
            }
        }

    }

}
