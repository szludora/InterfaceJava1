package gyari_rendezes;

import java.text.Collator;
import java.util.Comparator;

public class NevComparator implements Comparator<Ember> {

    @Override
    public int compare(Ember egyik, Ember masik) {

        // ékezeteket nem jól rendez
        //return egyik.getNev().compareTo(masik.getNev());
        Collator coll = Collator.getInstance();
        return coll.compare(egyik.getNev(), masik.getNev());

    }

}
