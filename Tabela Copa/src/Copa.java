import java.util.*;

public class Copa {
    Time ecuador = new Time("Ecuador");
    Time netherlands = new Time("Netherlands");
    Time qatar = new Time("Qatar");
    Time senegal = new Time("Senegal");
    Time usa = new Time("United States");
    Time england = new Time("England");
    Time wales = new Time("Wales");
    Time iran = new Time("Iran");
    Time mexico = new Time("Mexico");
    Time argentina = new Time("Argentina");
    Time poland = new Time("Poland");
    Time arabia = new Time("Saudi Arabia");
    Time australia = new Time("Australia");
    Time tunisia = new Time("Tunisia");
    Time france = new Time("France");
    Time denmark = new Time("Denmark");
    Time germany = new Time("Germany");
    Time japan = new Time("Japan");
    Time spain = new Time("Spain");
    Time costarica = new Time("Costa Rica");
    Time morocco = new Time("Morocco");
    Time croatia = new Time("Croatia");
    Time belgium = new Time("Belgium");
    Time canada = new Time("Canada");
    Time switzerland = new Time("Switzerland");
    Time cameroon = new Time("Cameroon");
    Time brazil = new Time("Brazil");
    Time serbia = new Time("Serbia");
    Time uruguay = new Time("Uruguay");
    Time korea = new Time("Korea Republic");
    Time portugal = new Time("Portugal");
    Time ghana = new Time("Ghana");


    //GrupoA
    Partida p1 = new Partida(qatar, ecuador);
    Partida p2 = new Partida(senegal, netherlands);
    Partida p3 = new Partida(qatar, senegal);
    Partida p4 = new Partida(netherlands, ecuador);
    Partida p5 = new Partida(ecuador, senegal);
    Partida p6 = new Partida(netherlands, qatar);

    //GrupoB
    Partida p7 = new Partida(england, iran);
    Partida p8 = new Partida(wales, usa);
    Partida p9 = new Partida(wales, iran);
    Partida p10 = new Partida(england, usa);
    Partida p11 = new Partida(iran, usa);
    Partida p12 = new Partida(wales, england);

    //GrupoC
    Partida p13 = new Partida(argentina, arabia);
    Partida p14 = new Partida(mexico, poland);
    Partida p15 = new Partida(poland, arabia);
    Partida p16 = new Partida(argentina, mexico);
    Partida p17 = new Partida(poland, argentina);
    Partida p18 = new Partida(arabia, mexico);

    //GrupoD
    Partida p19 = new Partida(denmark, tunisia);
    Partida p20 = new Partida(france, australia);
    Partida p21 = new Partida(tunisia, australia);
    Partida p22 = new Partida(france, denmark);
    Partida p23 = new Partida(tunisia, france);
    Partida p24 = new Partida(australia, denmark);

    //GrupoE
    Partida p25 = new Partida(germany, japan);
    Partida p26 = new Partida(spain, costarica);
    Partida p27 = new Partida(japan, costarica);
    Partida p28 = new Partida(spain, germany);
    Partida p29 = new Partida(japan, spain);
    Partida p30 = new Partida(costarica, germany);

    //GrupoF
    Partida p31 = new Partida(morocco, croatia);
    Partida p32 = new Partida(belgium, canada);
    Partida p33 = new Partida(belgium, morocco);
    Partida p34 = new Partida(croatia, canada);
    Partida p35 = new Partida(canada, morocco);
    Partida p36 = new Partida(croatia, belgium);

    //GrupoG
    Partida p37 = new Partida(switzerland, cameroon);
    Partida p38 = new Partida(brazil, serbia);
    Partida p39 = new Partida(cameroon, serbia);
    Partida p40 = new Partida(brazil, switzerland);
    Partida p41 = new Partida(serbia, switzerland);
    Partida p42 = new Partida(cameroon, brazil);

    //GrupoH
    Partida p43 = new Partida(uruguay, korea);
    Partida p44 = new Partida(portugal, ghana);
    Partida p45 = new Partida(korea, ghana);
    Partida p46 = new Partida(portugal, uruguay);
    Partida p47 = new Partida(korea, portugal);
    Partida p48 = new Partida(ghana, uruguay);

    ArrayList<Partida> partidas = new ArrayList<Partida>();
    ArrayList<Integer> numero = new ArrayList<>();
    public Copa(){
        partidas.add(p1);
        partidas.add(p2);
        partidas.add(p3);
        partidas.add(p4);
        partidas.add(p5);
        partidas.add(p6);
        partidas.add(p7);
        partidas.add(p8);
        partidas.add(p9);
        partidas.add(p10);
        partidas.add(p11);
        partidas.add(p12);
        partidas.add(p13);
        partidas.add(p14);
        partidas.add(p15);
        partidas.add(p16);
        partidas.add(p17);
        partidas.add(p18);
        partidas.add(p19);
        partidas.add(p20);
        partidas.add(p21);
        partidas.add(p22);
        partidas.add(p23);
        partidas.add(p24);
        partidas.add(p25);
        partidas.add(p26);
        partidas.add(p27);
        partidas.add(p28);
        partidas.add(p29);
        partidas.add(p30);
        partidas.add(p31);
        partidas.add(p32);
        partidas.add(p33);
        partidas.add(p34);
        partidas.add(p35);
        partidas.add(p36);
        partidas.add(p37);
        partidas.add(p38);
        partidas.add(p39);
        partidas.add(p40);
        partidas.add(p41);
        partidas.add(p42);
        partidas.add(p43);
        partidas.add(p44);
        partidas.add(p45);
        partidas.add(p46);
        partidas.add(p47);
        partidas.add(p48);
        numero.add(1);
        numero.add(-1);
    }




}
