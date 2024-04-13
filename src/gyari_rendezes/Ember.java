package gyari_rendezes;

// típusparaméterben megmondom, hogy milyen típusú <Ember>
public class Ember implements Comparable<Ember> {

    private String nev;
    private int kor;
    private String cim;

    public static NevComparator NevRendezo() {
        return new NevComparator();
    }

    @Override
    public String toString() {
        return "Ember{" + "neg=" + nev + ", kor=" + kor + ", cim=" + cim + '}';
    }

    public Ember(String neg, int kor, String cim) {
        this.nev = neg;
        this.kor = kor;
        this.cim = cim;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getCim() {
        return cim;
    }

    // hogyan akarom rendezni...?
    @Override
    public int compareTo(Ember masik) {

        // 1. eset egészekre:
//        if (this.kor < masik.kor) {
//            return -1;
//        } else if (this.kor > masik.kor) {
//            return 1;
//        } else {
//            return 0;
//        }
        // 2. eset:
        return this.kor - masik.kor;

    }

}
