package gyari_rendezes;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

public class Program {

    public static void main(String[] args) {

        String[] nevek = {"Péter", "Xénia", "Pál", "Anna"};
        //int[] szamok = {3,4,2,1};
        Integer[] szamok = {3, 4, 2, 1};

        Arrays.sort(nevek);
        tombKiir("Eredeti", nevek);

        Arrays.sort(szamok);
        tombKiir("Eredeti", szamok);

        Ember[] emberek = new Ember[4];
        emberek[0] = new Ember("Xénia", 2, "Bp");
        emberek[1] = new Ember("Péter", 3, "Érd");
        emberek[2] = new Ember("Pál", 1, "Göd");
        emberek[3] = new Ember("Anna", 4, "Miskolc");

        System.out.println("Ember típusok: ");

        Arrays.sort(emberek);
        tombKiir("Eredeti (ember ---> kor): ", emberek);

        Arrays.sort(emberek, Ember.NevRendezo());
        tombKiir("Eredeti (ember ---> nev): ", emberek);

        Arrays.sort(emberek, new Comparator<Ember>() {
            @Override
            public int compare(Ember egyik, Ember masik) {
                Collator coll = Collator.getInstance();
                return coll.compare(egyik.getCim(), masik.getCim());
            }
        });
        tombKiir("Eredeti (ember ---> cim): ", emberek);
    }

    private static <T> void tombKiir(String cim, T[] tomb) {

        System.out.println(cim);

        for (T elem : tomb) {
            System.out.println(elem);
        }
    }

}
