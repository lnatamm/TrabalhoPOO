import java.util.*;


class Comparador implements Comparator<Time> {

    Copa c = new Copa();
    int partidacerta = 0;
    public int confrontodireto(Time time1, Time time2){

        for(int i = 0; i < c.partidas.size(); i++){
            if (c.partidas.get(i).getTime1().getNome() == time1.getNome() && c.partidas.get(i).getTime2().getNome() == time2.getNome()){
                partidacerta = i;
            } else if (c.partidas.get(i).getTime2().getNome() == time1.getNome() && c.partidas.get(i).getTime1().getNome() == time2.getNome()) {
                partidacerta = i;
            }
        }
        return partidacerta;

    }

    Random random = new Random();




    public int compare(Time p1, Time p2) {

        if(p1.getPontos() - p2.getPontos() == 0) {
            if(p1.getSaldoGols() - p2.getSaldoGols() == 0) {
                if(p1.getnGols() - p2.getnGols() == 0) {
                    if(c.partidas.get(confrontodireto(p1, p2)).getPontos1() - c.partidas.get(confrontodireto(p1,p2)).getPontos2() == 0){
                        if(c.partidas.get(confrontodireto(p1, p2)).getGols1() - c.partidas.get(confrontodireto(p1, p2)).getGols2() == 0){
                            int nr = random.nextInt(2);
                            return c.numero.get(nr);
                        }
                        else return -(c.partidas.get(confrontodireto(p1, p2)).getGols1() - c.partidas.get(confrontodireto(p1, p2)).getGols2());
                    }
                    else return -(c.partidas.get(confrontodireto(p1, p2)).getPontos1() - c.partidas.get(confrontodireto(p1,p2)).getPontos2());
                }
                else return -(p1.getnGols() - p2.getnGols());
            }
            else return -(p1.getSaldoGols() - p2.getSaldoGols());
        }
        else return -(p1.getPontos() - p2.getPontos());
    }

}