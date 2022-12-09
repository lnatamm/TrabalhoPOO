import java.util.*;

class Comparador implements Comparator<Time> {

    public int compare(Time p1, Time p2) {

        if(p1.getPontos() - p2.getPontos() == 0) {
            if(p1.getSaldoGols() - p2.getSaldoGols() == 0) {
                if(p1.getnGols() - p2.getnGols() == 0) {

                }
            }
        }

        return 0;

    }

}