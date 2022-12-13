import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Tabela {

    private Copa copa = new Copa();
    private JTabbedPane TabbedPanel;
    private JPanel GrupoA;
    private JPanel GrupoB;
    private JPanel GrupoC;
    private JPanel GrupoD;
    private JPanel GrupoE;
    private JPanel GrupoF;
    private JPanel GrupoG;
    private JPanel GrupoH;
    private JTextField CatarGolsXEquador;
    private JTextField EquadorGolsXCatar;
    private JTextField SenegalGolsXHolanda;
    private JTextField HolandaGolsXSenegal;
    private JTextField CatarGolsXSenegal;
    private JTextField SenegalGolsXCatar;
    private JTextField HolandaGolsXEquador;
    private JTextField EquadorGolsXHolanda;
    private JTextField EquadorGolsXSenegal;
    private JTextField SenegalGolsXEquador;
    private JTextField HolandaGolsXCatar;

    private JTextField CatarGolsXHolanda;

    private JTextField[] GrupoATexts = new JTextField[]{CatarGolsXEquador, EquadorGolsXCatar, SenegalGolsXHolanda, HolandaGolsXSenegal, CatarGolsXSenegal, SenegalGolsXCatar, HolandaGolsXEquador, EquadorGolsXHolanda, EquadorGolsXSenegal, SenegalGolsXEquador, HolandaGolsXCatar, CatarGolsXHolanda};
    private Time[] GrupoATimes = new Time[]{copa.getQatar(), copa.getEcuador(), copa.getSenegal(), copa.getNetherlands()};

    private JTextField InglaterraGolsXIra;
    private JTextField IraGolsXInglaterra;
    private JTextField GalesGolsXEstadosUnidos;
    private JTextField EstadosUnidosGolsXGales;
    private JTextField GalesGolsXIra;
    private JTextField IraGolsXGales;
    private JTextField InglaterraGolsXEstadosUnidos;
    private JTextField EstadosUnidosGolsXInglaterra;
    private JTextField IraGolsXEstadosUnidos;
    private JTextField EstadosUnidosGolsXIra;
    private JTextField GalesGolsXInglaterra;
    private JTextField InglaterraGolsXGales;

    private JTextField[] GrupoBTexts = new JTextField[]{InglaterraGolsXIra, IraGolsXInglaterra, GalesGolsXEstadosUnidos, EstadosUnidosGolsXGales, GalesGolsXIra, IraGolsXGales, InglaterraGolsXEstadosUnidos, EstadosUnidosGolsXInglaterra, IraGolsXEstadosUnidos, EstadosUnidosGolsXIra, GalesGolsXInglaterra, InglaterraGolsXGales};

    private Time[] GrupoBTimes = new Time[]{copa.getEngland(), copa.getUsa(), copa.getIran(), copa.getWales()};

    private JTextField ArgentinaGolsXArabia;
    private JTextField ArabiaGolsXArgentina;
    private JTextField MexicoGolsXPolonia;
    private JTextField PoloniaGolsXMexico;
    private JTextField PoloniaGolsXArabia;
    private JTextField ArabiaGolsXPolonia;
    private JTextField ArgentinaGolsXMexico;
    private JTextField MexicoGolsXArgentina;
    private JTextField PoloniaGolsXArgentina;
    private JTextField ArgentinaGolsXPolonia;
    private JTextField ArabiaGolsXMexico;
    private JTextField MexicoGolsXArabia;

    private JTextField[] GrupoCTexts = new JTextField[]{ArgentinaGolsXArabia, ArabiaGolsXArgentina, MexicoGolsXPolonia, PoloniaGolsXMexico, PoloniaGolsXArabia, ArabiaGolsXPolonia, ArgentinaGolsXMexico, MexicoGolsXArgentina, PoloniaGolsXArgentina, ArgentinaGolsXPolonia, ArabiaGolsXMexico, MexicoGolsXArabia};

    private Time[] GrupoCTimes = new Time[]{copa.getArgentina(), copa.getPoland(), copa.getMexico(), copa.getArabia()};

    private JTextField AlemanhaGolsXJapao;
    private JTextField JapaoGolsXAlemanha;
    private JTextField EspanhaGolsXCostaRica;
    private JTextField CostaRicaGolsXEspanha;
    private JTextField JapaoGolsXCostaRica;
    private JTextField CostaRicaGolsXJapao;
    private JTextField EspanhaGolsXAlemanha;
    private JTextField AlemanhaGolsXEspanha;
    private JTextField JapaoGolsXEspanha;
    private JTextField EspanhaGolsXJapao;
    private JTextField CostaRicaGolsXAlemanha;
    private JTextField AlemanhaGolsXCostaRica;

    private JTextField[] GrupoETexts = new JTextField[]{AlemanhaGolsXJapao, JapaoGolsXAlemanha, EspanhaGolsXCostaRica, CostaRicaGolsXEspanha, JapaoGolsXCostaRica, CostaRicaGolsXJapao, EspanhaGolsXAlemanha, AlemanhaGolsXEspanha, JapaoGolsXEspanha, EspanhaGolsXJapao, CostaRicaGolsXAlemanha, AlemanhaGolsXCostaRica};

    private Time[] GrupoETimes = new Time[]{copa.getJapan(), copa.getSpain(), copa.getGermany(), copa.getCostarica()};

    private JTextField MarrocosGolsXCroacia;
    private JTextField CroaciaGolsXMarrocos;
    private JTextField BelgicaGolsXCanada;
    private JTextField CanadaGolsXBelgica;
    private JTextField BelgicaGolsXMarrocos;
    private JTextField MarrocosGolsXBelgica;
    private JTextField CroaciaGolsXCanada;
    private JTextField CanadaGolsXCroacia;
    private JTextField CanadaGolsXMarrocos;
    private JTextField MarrocosGolsXCanada;
    private JTextField CroaciaGolsXBelgica;
    private JTextField BelgicaGolsXCroacia;

    private JTextField[] GrupoFTexts = new JTextField[]{MarrocosGolsXCroacia, CroaciaGolsXMarrocos, BelgicaGolsXCanada, CanadaGolsXBelgica, BelgicaGolsXMarrocos, MarrocosGolsXBelgica, CroaciaGolsXCanada, CanadaGolsXCroacia, CanadaGolsXMarrocos, MarrocosGolsXCanada, CroaciaGolsXBelgica, BelgicaGolsXCroacia};

    private Time[] GrupoFTimes = new Time[]{copa.getMorocco(), copa.getCroatia(), copa.getBelgium(), copa.getCanada()};

    private JTextField SuicaGolsXCamaroes;
    private JTextField CamaroesGolsXSuica;
    private JTextField BrasilGolsXServia;
    private JTextField SerrviaGolsXBrasil;
    private JTextField CamaroesGolsXServia;
    private JTextField ServiaGolsXCamaroes;
    private JTextField BrasilGolsXSuica;
    private JTextField SuicaGolsXBrasil;
    private JTextField ServiaGolsXSuica;
    private JTextField SuicaGolsXServia;
    private JTextField CamaroesGolsXBrasil;
    private JTextField BrasilGolsXCamaroes;

    private JTextField[] GrupoGTexts = new JTextField[]{SuicaGolsXCamaroes, CamaroesGolsXSuica, BrasilGolsXServia, SerrviaGolsXBrasil, CamaroesGolsXServia, ServiaGolsXCamaroes, BrasilGolsXSuica, SuicaGolsXBrasil, ServiaGolsXSuica, SuicaGolsXServia, CamaroesGolsXBrasil, BrasilGolsXCamaroes};

    private Time[] GrupoGTimes = new Time[]{copa.getBrazil(), copa.getSwitzerland(), copa.getCameroon(), copa.getSerbia()};

    private JTextField UruguaiGolsXCoreia;
    private JTextField CoreiaGolsXUruguai;
    private JTextField PortugalGolsXGana;
    private JTextField GanaGolsXPortugal;
    private JTextField CoreiaGolsXGana;
    private JTextField GanaGolsXCoreia;
    private JTextField PortugalGolsXUruguai;
    private JTextField UruguaiGolsXPortugal;
    private JTextField CoreiaGolsXPortual;
    private JTextField PortugalGolsXCoreia;
    private JTextField GanaGolsXUruguai;
    private JTextField UruguaiGolsXGana;

    private JTextField[] GrupoHTexts = new JTextField[]{UruguaiGolsXCoreia, CoreiaGolsXUruguai, PortugalGolsXGana, GanaGolsXPortugal, CoreiaGolsXGana, GanaGolsXCoreia, PortugalGolsXUruguai, UruguaiGolsXPortugal, CoreiaGolsXPortual, PortugalGolsXCoreia, GanaGolsXUruguai, UruguaiGolsXGana};

    private Time[] GrupoHTimes = new Time[]{copa.getUruguay(), copa.getGhana(), copa.getPortugal(), copa.getKorea()};

    private JTextField DinamarcaGolsXTunisia;
    private JTextField TunisiaGolsXDinamarca;
    private JTextField FrancaGolsXAustralia;
    private JTextField AustraliaGolsXFranca;
    private JTextField TunisiaGolsXAustralia;
    private JTextField AustraliaGolsXTunisia;
    private JTextField FrancaGolsXDinamarca;
    private JTextField DinamarcaGolsXFranca;
    private JTextField TunisiaGolsXFranca;
    private JTextField FrancaGolsXTunisia;
    private JTextField AustraliaGolsXDinamarca;
    private JTextField DinamarcaGolsXAustralia;

    private JTextField[] GrupoDTexts = new JTextField[]{DinamarcaGolsXTunisia, TunisiaGolsXDinamarca, FrancaGolsXAustralia, AustraliaGolsXFranca, TunisiaGolsXAustralia, AustraliaGolsXTunisia, FrancaGolsXDinamarca, DinamarcaGolsXFranca, TunisiaGolsXFranca, FrancaGolsXTunisia, AustraliaGolsXDinamarca, DinamarcaGolsXAustralia};

    private Time[] GrupoDTimes = new Time[]{copa.getFrance(), copa.getAustralia(), copa.getTunisia(), copa.getDenmark()};

    private JLabel Time1GrupoA;
    private JLabel Time2GrupoA;
    private JLabel Time3GrupoA;
    private JLabel Time4GrupoA;
    private JLabel Time1GrupoB;
    private JLabel Time2GrupoB;
    private JLabel Time3GrupoB;
    private JLabel Time4GrupoB;
    private JLabel Time1GrupoC;
    private JLabel Time2GrupoC;
    private JLabel Time3GrupoC;
    private JLabel Time4GrupoC;
    private JLabel Time1GrupoD;
    private JLabel Time2GrupoD;
    private JLabel Time3GrupoD;
    private JLabel Time4GrupoD;
    private JLabel Time1GrupoE;
    private JLabel Time2GrupoE;
    private JLabel Time3GrupoE;
    private JLabel Time4GrupoE;
    private JLabel Time1GrupoF;
    private JLabel Time2GrupoF;
    private JLabel Time3GrupoF;
    private JLabel Time4GrupoF;
    private JLabel Time1GrupoG;
    private JLabel Time2GrupoG;
    private JLabel Time3GrupoG;
    private JLabel Time4GrupoG;
    private JLabel Time1GrupoH;
    private JLabel Time2GrupoH;
    private JLabel Time3GrupoH;
    private JLabel Time4GrupoH;
    private JLabel V1A;
    private JLabel E1A;
    private JLabel D1A;
    private JLabel GP1A;
    private JLabel GC1A;
    private JLabel SG1A;
    private JLabel V2A;
    private JLabel E2A;
    private JLabel D2A;
    private JLabel GP2A;
    private JLabel GC2A;
    private JLabel SG2A;
    private JLabel V3A;
    private JLabel E3A;
    private JLabel D3A;
    private JLabel GP3A;
    private JLabel GC3A;
    private JLabel SG3A;
    private JLabel V4A;
    private JLabel E4A;
    private JLabel D4A;
    private JLabel GP4A;
    private JLabel GC4A;
    private JLabel SG4A;
    private JLabel V1B;
    private JLabel E1B;
    private JLabel D1B;
    private JLabel GP1B;
    private JLabel GC1B;
    private JLabel SG1B;
    private JLabel V2B;
    private JLabel E2B;
    private JLabel D2B;
    private JLabel GP2B;
    private JLabel GC2B;
    private JLabel SG2B;
    private JLabel V3B;
    private JLabel E3B;
    private JLabel D3B;
    private JLabel GP3B;
    private JLabel GC3B;
    private JLabel SG3B;
    private JLabel V4B;
    private JLabel E4B;
    private JLabel D4B;
    private JLabel GP4B;
    private JLabel GC4B;
    private JLabel SG4B;
    private JLabel V1C;
    private JLabel E1C;
    private JLabel D1C;
    private JLabel GP1C;
    private JLabel GC1C;
    private JLabel SG1C;
    private JLabel V2C;
    private JLabel E2C;
    private JLabel D2C;
    private JLabel GP2C;
    private JLabel GC2C;
    private JLabel SG2C;
    private JLabel V3C;
    private JLabel E3C;
    private JLabel D3C;
    private JLabel GP3C;
    private JLabel GC3C;
    private JLabel SG3C;
    private JLabel V4C;
    private JLabel E4C;
    private JLabel D4C;
    private JLabel GP4C;
    private JLabel GC4C;
    private JLabel SG4C;
    private JLabel E1D;
    private JLabel V1D;
    private JLabel D1D;
    private JLabel GP1D;
    private JLabel GC1D;
    private JLabel SG1D;
    private JLabel V2D;
    private JLabel E2D;
    private JLabel D2D;
    private JLabel GP2D;
    private JLabel GC2D;
    private JLabel SG2D;
    private JLabel V3D;
    private JLabel E3D;
    private JLabel D3D;
    private JLabel GP3D;
    private JLabel GC3D;
    private JLabel SG3D;
    private JLabel V4D;
    private JLabel E4D;
    private JLabel D4D;
    private JLabel GP4D;
    private JLabel GC4D;
    private JLabel SG4D;
    private JLabel V1E;
    private JLabel E1E;
    private JLabel D1E;
    private JLabel GP1E;
    private JLabel GC1E;
    private JLabel SG1E;
    private JLabel V2E;
    private JLabel E2E;
    private JLabel D2E;
    private JLabel GP2E;
    private JLabel GC2E;
    private JLabel SG2E;
    private JLabel V3E;
    private JLabel E3E;
    private JLabel D3E;
    private JLabel GP3E;
    private JLabel GC3E;
    private JLabel SG3E;
    private JLabel V4E;
    private JLabel E4E;
    private JLabel D4E;
    private JLabel GP4E;
    private JLabel GC4E;
    private JLabel SG4E;
    private JLabel V1F;
    private JLabel E1F;
    private JLabel D1F;
    private JLabel GP1F;
    private JLabel GC1F;
    private JLabel SG1F;
    private JLabel V2F;
    private JLabel E2F;
    private JLabel D2F;
    private JLabel GP2F;
    private JLabel GC2F;
    private JLabel SG2F;
    private JLabel V3F;
    private JLabel E3F;
    private JLabel D3F;
    private JLabel GP3F;
    private JLabel GC3F;
    private JLabel SG3F;
    private JLabel V4F;
    private JLabel E4F;
    private JLabel D4F;
    private JLabel GP4F;
    private JLabel GC4F;
    private JLabel SG4F;
    private JLabel V1G;
    private JLabel E1G;
    private JLabel D1G;
    private JLabel GP1G;
    private JLabel GC1G;
    private JLabel SG1G;
    private JLabel V2G;
    private JLabel E2G;
    private JLabel D2G;
    private JLabel GP2G;
    private JLabel GC2G;
    private JLabel SG2G;
    private JLabel V3G;
    private JLabel E3G;
    private JLabel D3G;
    private JLabel GP3G;
    private JLabel GC3G;
    private JLabel SG3G;
    private JLabel V4G;
    private JLabel E4G;
    private JLabel D4G;
    private JLabel GP4G;
    private JLabel GC4G;
    private JLabel SG4G;
    private JLabel V1H;
    private JLabel E1H;
    private JLabel D1H;
    private JLabel GP1H;
    private JLabel GC1H;
    private JLabel SG1H;
    private JLabel V2H;
    private JLabel E2H;
    private JLabel D2H;
    private JLabel GP2H;
    private JLabel GC2H;
    private JLabel SG2H;
    private JLabel V3H;
    private JLabel E3H;
    private JLabel D3H;
    private JLabel GP3H;
    private JLabel GC3H;
    private JLabel SG3H;
    private JLabel V4H;
    private JLabel E4H;
    private JLabel D4H;
    private JLabel GP4H;
    private JLabel GC4H;
    private JLabel SG4H;
    private JPanel MataMata;
    private JButton enviarBotaoGrupoA;
    private JButton enviarBotaoGrupoB;
    private JButton enviarBotaoGrupoC;
    private JButton enviarBotaoGupoD;
    private JButton enviarBotaoGrupoE;
    private JButton enviarBotaoGrupoG;
    private JButton enviarBotaoGrupoH;
    private JButton enviarBotaoGupoF;
    private JLabel PTS1A;
    private JLabel PTS2A;
    private JLabel PTS3A;
    private JLabel PTS4A;
    private JLabel PTS1B;
    private JLabel PTS2B;
    private JLabel PTS3B;
    private JLabel PTS4B;
    private JLabel PTS1C;
    private JLabel PTS2C;
    private JLabel PTS3C;
    private JLabel PTS4C;
    private JLabel PTS1D;
    private JLabel PTS2D;
    private JLabel PTS3D;
    private JLabel PTS4D;
    private JLabel PTS1E;
    private JLabel PTS2E;
    private JLabel PTS3E;
    private JLabel PTS4E;
    private JLabel PTS1F;
    private JLabel PTS2F;
    private JLabel PTS3F;
    private JLabel PTS4F;
    private JLabel PTS1G;
    private JLabel PTS2G;
    private JLabel PTS3G;
    private JLabel PTS4G;
    private JLabel PTS1H;
    private JLabel PTS2H;
    private JLabel PTS3H;
    private JLabel PTS4H;
    private JTextField Gols1Oitavas1;
    private JTextField Gols2Oitavas1;
    private JTextField Gols1Oitavas2;
    private JTextField Gols2Oitavas2;
    private JTextField Gols1Oitavas3;
    private JTextField Gols2Oitavas3;
    private JTextField Gols1Oitavas4;
    private JTextField Gols2Oitavas4;
    private JTextField Gols1Quartas1;
    private JTextField Gols2Quartas1;
    private JTextField Gols1Quartas2;
    private JTextField Gols2Quartas2;
    private JTextField Gols1Semi1;
    private JTextField Gols2Semi1;
    private JTextField Gols1Oitavas5;
    private JTextField Gols2Oitavas5;
    private JTextField Gols1Oitavas6;
    private JTextField Gols2Oitavas6;
    private JTextField Gols1Oitavas7;
    private JTextField Gols2Oitavas7;
    private JTextField Gols1Oitavas8;
    private JTextField Gols2Oitavas8;
    private JTextField Gols1Quartas3;
    private JTextField Gols2Quartas3;
    private JTextField Gols2Quartas4;
    private JTextField Gols1Quartas4;
    private JTextField Gols2Semi2;
    private JTextField Gols1Semi2;
    private JTextField Gols1Final;
    private JTextField Gols2Final;
    private JTextField Gols2Terceiro;
    private JTextField Gols1Terceiro;
    private JTextField Penaltis1Oitavas1;
    private JTextField Penaltis2Oitavas1;
    private JTextField Penaltis1Oitavas2;
    private JTextField Penaltis2Oitavas2;
    private JTextField Penaltis1Oitavas3;
    private JTextField Penaltis2Oitavas3;
    private JTextField Penaltis1Oitavas4;
    private JTextField Penaltis2Oitavas4;
    private JTextField Penaltis1Quartas1;
    private JTextField Penaltis2Quartas1;
    private JTextField Penaltis1Quartas2;
    private JTextField Penaltis2Quartas2;
    private JTextField Penaltis1Semi1;
    private JTextField Penaltis2Semi1;
    private JTextField Penaltis1Oitavas5;
    private JTextField Penaltis2Oitavas5;
    private JTextField Penaltis1Oitavas6;
    private JTextField Penaltis2Oitavas6;
    private JTextField Penaltis1Oitavas7;
    private JTextField Penaltis2Oitavas7;
    private JTextField Penaltis1Oitavas8;
    private JTextField Penaltis2Oitavas8;
    private JTextField Penaltis1Quartas3;
    private JTextField Penaltis2Quartas3;
    private JTextField Penaltis1Quartas4;
    private JTextField Penaltis2Quartas4;
    private JTextField Penaltis1Semi2;
    private JTextField Penaltis2Semi2;
    private JLabel A1;
    private JLabel B2;
    private JLabel C1;
    private JLabel D2;
    private JLabel E1;
    private JLabel F2;
    private JLabel G1;
    private JLabel H2;
    private JLabel B1;
    private JLabel A2;
    private JLabel D1;
    private JLabel C2;
    private JLabel F1;
    private JLabel E2;
    private JLabel H1;
    private JLabel G2;
    private JLabel VencedorOitavas1;
    private JLabel VencedorOitavas2;
    private JLabel VencedorOitavas3;
    private JLabel VencedorOitavas4;
    private JLabel VencedorOitavas5;
    private JLabel VencedorOitavas6;
    private JLabel VencedorOitavas7;
    private JLabel VencedorOitavas8;
    private JLabel VencedorQuartas1;
    private JLabel VencedorQuartas2;
    private JLabel VencedorQuartas3;
    private JLabel VencedorQuartas4;
    private JLabel VencedorSemi1;
    private JLabel VencedorSemi2;
    private JLabel PerderdorSemi1;
    private JLabel PerderdorSemi2;
    private JLabel VencedorFinal;
    private JLabel VencedorTerceiro;
    private JTextField Penaltis1Final;
    private JTextField Penaltis2Final;
    private JTextField Penaltis1Terceiro;
    private JTextField Penaltis2Terceiro;
    private JButton enviarOitavas1;
    private JButton enviarOitavas2;
    private JButton enviarOitavas3;
    private JButton enviarOitavas4;
    private JButton enviarQuartas1;
    private JButton enviarQuartas2;
    private JButton enviarSemi2;
    private JButton enviarQuartas3;
    private JButton enviarQuartas4;
    private JButton enviarSemi1;
    private JButton enviarOitavas5;
    private JButton enviarOitavas6;
    private JButton enviarOitavas7;
    private JButton enviarOitavas8;
    private JButton enviarFinal;
    private JButton enviarTerceira;
    private JButton Reset1;
    private JButton Reset2;
    private JButton Reset3;
    private JButton Reset4;
    private JButton Reset5;
    private JButton Reset6;
    private JButton Reset7;
    private JButton Reset8;
    private JButton Reset9;

    private void Reset(){

        File arquivo = new File("D:/TrabalhoPOO/TrabalhoPOO/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            bw.write("0;0");
            bw.newLine();
            //Oitavas:
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            //Quartas
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            //Semis
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            //Final e Terceiro Lugar
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("0;0;0;0");
            bw.newLine();
            bw.write("1A");
            bw.newLine();
            bw.write("2B");
            bw.newLine();
            bw.write("1C");
            bw.newLine();
            bw.write("2D");
            bw.newLine();
            bw.write("1E");
            bw.newLine();
            bw.write("2F");
            bw.newLine();
            bw.write("1G");
            bw.newLine();
            bw.write("2H");
            bw.newLine();
            bw.write("1B");
            bw.newLine();
            bw.write("2A");
            bw.newLine();
            bw.write("1D");
            bw.newLine();
            bw.write("2C");
            bw.newLine();
            bw.write("1F");
            bw.newLine();
            bw.write("2E");
            bw.newLine();
            bw.write("1H");
            bw.newLine();
            bw.write("2G");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");
            bw.newLine();
            bw.write("A definir");

            JLabel[] vitoriasA = new JLabel[]{V1A, V2A, V3A, V4A};

            JLabel[] empatesA = new JLabel[]{E1A, E2A, E3A, E4A};

            JLabel[] derrotasA = new JLabel[]{D1A, D2A, D3A, D4A};

            JLabel[] golsProA = new JLabel[]{GP1A, GP2A, GP3A, GP4A};

            JLabel[] golsConA = new JLabel[]{GC1A, GC2A, GC3A, GC4A};

            JLabel[] saldoGolsA = new JLabel[]{SG1A, SG2A, SG3A, SG4A};

            JLabel[] pontosA = new JLabel[]{PTS1A, PTS2A, PTS3A, PTS4A};

            JLabel[] vitoriasB = new JLabel[]{V1B, V2B, V3B, V4B};

            JLabel[] empatesB = new JLabel[]{E1B, E2B, E3B, E4B};

            JLabel[] derrotasB = new JLabel[]{D1B, D2B, D3B, D4B};

            JLabel[] golsProB = new JLabel[]{GP1B, GP2B, GP3B, GP4B};

            JLabel[] golsConB = new JLabel[]{GC1B, GC2B, GC3B, GC4B};

            JLabel[] saldoGolsB = new JLabel[]{SG1B, SG2B, SG3B, SG4B};

            JLabel[] pontosB = new JLabel[]{PTS1B, PTS2B, PTS3B, PTS4B};

            JLabel[] vitoriasC = new JLabel[]{V1C, V2C, V3C, V4C};

            JLabel[] empatesC = new JLabel[]{E1C, E2C, E3C, E4C};

            JLabel[] derrotasC = new JLabel[]{D1C, D2C, D3C, D4C};

            JLabel[] golsProC = new JLabel[]{GP1C, GP2C, GP3C, GP4C};

            JLabel[] golsConC = new JLabel[]{GC1C, GC2C, GC3C, GC4C};

            JLabel[] saldoGolsC = new JLabel[]{SG1C, SG2C, SG3C, SG4C};

            JLabel[] pontosC = new JLabel[]{PTS1C, PTS2C, PTS3C, PTS4C};

            JLabel[] vitoriasD = new JLabel[]{V1D, V2D, V3D, V4D};

            JLabel[] empatesD = new JLabel[]{E1D, E2D, E3D, E4D};

            JLabel[] derrotasD = new JLabel[]{D1D, D2D, D3D, D4D};

            JLabel[] golsProD = new JLabel[]{GP1D, GP2D, GP3D, GP4D};

            JLabel[] golsConD = new JLabel[]{GC1D, GC2D, GC3D, GC4D};

            JLabel[] saldoGolsD = new JLabel[]{SG1D, SG2D, SG3D, SG4D};

            JLabel[] pontosD = new JLabel[]{PTS1D, PTS2D, PTS3D, PTS4D};

            JLabel[] vitoriasE = new JLabel[]{V1E, V2E, V3E, V4E};

            JLabel[] empatesE = new JLabel[]{E1E, E2E, E3E, E4E};

            JLabel[] derrotasE = new JLabel[]{D1E, D2E, D3E, D4E};

            JLabel[] golsProE = new JLabel[]{GP1E, GP2E, GP3E, GP4E};

            JLabel[] golsConE = new JLabel[]{GC1E, GC2E, GC3E, GC4E};

            JLabel[] saldoGolsE = new JLabel[]{SG1E, SG2E, SG3E, SG4E};

            JLabel[] pontosE = new JLabel[]{PTS1E, PTS2E, PTS3E, PTS4E};

            JLabel[] vitoriasF = new JLabel[]{V1F, V2F, V3F, V4F};

            JLabel[] empatesF = new JLabel[]{E1F, E2F, E3F, E4F};

            JLabel[] derrotasF = new JLabel[]{D1F, D2F, D3F, D4F};

            JLabel[] golsProF = new JLabel[]{GP1F, GP2F, GP3F, GP4F};

            JLabel[] golsConF = new JLabel[]{GC1F, GC2F, GC3F, GC4F};

            JLabel[] saldoGolsF = new JLabel[]{SG1F, SG2F, SG3F, SG4F};

            JLabel[] pontosF = new JLabel[]{PTS1F, PTS2F, PTS3F, PTS4F};

            JLabel[] vitoriasG = new JLabel[]{V1G, V2G, V3G, V4G};

            JLabel[] empatesG = new JLabel[]{E1G, E2G, E3G, E4G};

            JLabel[] derrotasG = new JLabel[]{D1G, D2G, D3G, D4G};

            JLabel[] golsProG = new JLabel[]{GP1G, GP2G, GP3G, GP4G};

            JLabel[] golsConG = new JLabel[]{GC1G, GC2G, GC3G, GC4G};

            JLabel[] saldoGolsG = new JLabel[]{SG1G, SG2G, SG3G, SG4G};

            JLabel[] pontosG = new JLabel[]{PTS1G, PTS2G, PTS3G, PTS4G};

            JLabel[] vitoriasH = new JLabel[]{V1H, V2H, V3H, V4H};

            JLabel[] empatesH = new JLabel[]{E1H, E2H, E3H, E4H};

            JLabel[] derrotasH = new JLabel[]{D1H, D2H, D3H, D4H};

            JLabel[] golsProH = new JLabel[]{GP1H, GP2H, GP3H, GP4H};

            JLabel[] golsConH = new JLabel[]{GC1H, GC2H, GC3H, GC4H};

            JLabel[] saldoGolsH = new JLabel[]{SG1H, SG2H, SG3H, SG4H};

            JLabel[] pontosH = new JLabel[]{PTS1H, PTS2H, PTS3H, PTS4H};

            for (int i = 0; i < 4; i++) {

                vitoriasA[i].setText("0");

                empatesA[i].setText("0");

                derrotasA[i].setText("0");

                golsProA[i].setText("0");

                golsConA[i].setText("0");

                saldoGolsA[i].setText("0");

                pontosA[i].setText("0");

                vitoriasB[i].setText("0");

                empatesB[i].setText("0");

                derrotasB[i].setText("0");

                golsProB[i].setText("0");

                golsConB[i].setText("0");

                saldoGolsB[i].setText("0");

                pontosB[i].setText("0");

                vitoriasC[i].setText("0");

                empatesC[i].setText("0");

                derrotasC[i].setText("0");

                golsProC[i].setText("0");

                golsConC[i].setText("0");

                saldoGolsC[i].setText("0");

                pontosC[i].setText("0");

                vitoriasD[i].setText("0");

                empatesD[i].setText("0");

                derrotasD[i].setText("0");

                golsProD[i].setText("0");

                golsConD[i].setText("0");

                saldoGolsD[i].setText("0");

                pontosD[i].setText("0");

                vitoriasE[i].setText("0");

                empatesE[i].setText("0");

                derrotasE[i].setText("0");

                golsProE[i].setText("0");

                golsConE[i].setText("0");

                saldoGolsE[i].setText("0");

                pontosE[i].setText("0");

                vitoriasF[i].setText("0");

                empatesF[i].setText("0");

                derrotasF[i].setText("0");

                golsProF[i].setText("0");

                golsConF[i].setText("0");

                saldoGolsF[i].setText("0");

                pontosF[i].setText("0");

                vitoriasG[i].setText("0");

                empatesG[i].setText("0");

                derrotasG[i].setText("0");

                golsProG[i].setText("0");

                golsConG[i].setText("0");

                saldoGolsG[i].setText("0");

                pontosG[i].setText("0");

                vitoriasH[i].setText("0");

                empatesH[i].setText("0");

                derrotasH[i].setText("0");

                golsProH[i].setText("0");

                golsConH[i].setText("0");

                saldoGolsH[i].setText("0");

                pontosH[i].setText("0");

            }

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    private void Escrever(){
        File arquivo = new File("D:/TrabalhoPOO/TrabalhoPOO/tabelaCopa.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(CatarGolsXEquador.getText() + ";" + EquadorGolsXCatar.getText());
            bw.newLine();
            bw.write(SenegalGolsXHolanda.getText() + ";" + HolandaGolsXSenegal.getText());
            bw.newLine();
            bw.write(CatarGolsXSenegal.getText() + ";" + SenegalGolsXCatar.getText());
            bw.newLine();
            bw.write(HolandaGolsXEquador.getText() + ";" + EquadorGolsXHolanda.getText());
            bw.newLine();
            bw.write(EquadorGolsXSenegal.getText() + ";" + SenegalGolsXEquador.getText());
            bw.newLine();
            bw.write(HolandaGolsXCatar.getText() + ";" + CatarGolsXHolanda.getText());
            bw.newLine();
            bw.write(InglaterraGolsXIra.getText() + ";" + IraGolsXInglaterra.getText());
            bw.newLine();
            bw.write(GalesGolsXEstadosUnidos.getText() + ";" + EstadosUnidosGolsXGales.getText());
            bw.newLine();
            bw.write(GalesGolsXIra.getText() + ";" + IraGolsXGales.getText());
            bw.newLine();
            bw.write(InglaterraGolsXEstadosUnidos.getText() + ";" + EstadosUnidosGolsXInglaterra.getText());
            bw.newLine();
            bw.write(IraGolsXEstadosUnidos.getText() + ";" + EstadosUnidosGolsXIra.getText());
            bw.newLine();
            bw.write(GalesGolsXInglaterra.getText() + ";" + InglaterraGolsXGales.getText());
            bw.newLine();
            bw.write(ArgentinaGolsXArabia.getText() + ";" + ArabiaGolsXArgentina.getText());
            bw.newLine();
            bw.write(MexicoGolsXPolonia.getText() + ";" + PoloniaGolsXMexico.getText());
            bw.newLine();
            bw.write(PoloniaGolsXArabia.getText() + ";" + ArabiaGolsXPolonia.getText());
            bw.newLine();
            bw.write(ArgentinaGolsXMexico.getText() + ";" + MexicoGolsXArgentina.getText());
            bw.newLine();
            bw.write(PoloniaGolsXArgentina.getText() + ";" + ArgentinaGolsXPolonia.getText());
            bw.newLine();
            bw.write(ArabiaGolsXMexico.getText() + ";" + MexicoGolsXArabia.getText());
            bw.newLine();
            bw.write(DinamarcaGolsXTunisia.getText() + ";" + TunisiaGolsXDinamarca.getText());
            bw.newLine();
            bw.write(FrancaGolsXAustralia.getText() + ";" + AustraliaGolsXFranca.getText());
            bw.newLine();
            bw.write(TunisiaGolsXAustralia.getText() + ";" + AustraliaGolsXTunisia.getText());
            bw.newLine();
            bw.write(FrancaGolsXDinamarca.getText() + ";" + DinamarcaGolsXFranca.getText());
            bw.newLine();
            bw.write(TunisiaGolsXFranca.getText() + ";" + FrancaGolsXTunisia.getText());
            bw.newLine();
            bw.write(AustraliaGolsXDinamarca.getText() + ";" + DinamarcaGolsXAustralia.getText());
            bw.newLine();
            bw.write(AlemanhaGolsXJapao.getText() + ";" + JapaoGolsXAlemanha.getText());
            bw.newLine();
            bw.write(EspanhaGolsXCostaRica.getText() + ";" + CostaRicaGolsXEspanha.getText());
            bw.newLine();
            bw.write(JapaoGolsXCostaRica.getText() + ";" + CostaRicaGolsXJapao.getText());
            bw.newLine();
            bw.write(EspanhaGolsXAlemanha.getText() + ";" + AlemanhaGolsXEspanha.getText());
            bw.newLine();
            bw.write(JapaoGolsXEspanha.getText() + ";" + EspanhaGolsXJapao.getText());
            bw.newLine();
            bw.write(CostaRicaGolsXAlemanha.getText() + ";" + AlemanhaGolsXCostaRica.getText());
            bw.newLine();
            bw.write(MarrocosGolsXCroacia.getText() + ";" + CroaciaGolsXMarrocos.getText());
            bw.newLine();
            bw.write(BelgicaGolsXCanada.getText() + ";" + CanadaGolsXBelgica.getText());
            bw.newLine();
            bw.write(BelgicaGolsXMarrocos.getText() + ";" + MarrocosGolsXBelgica.getText());
            bw.newLine();
            bw.write(CroaciaGolsXCanada.getText() + ";" + CanadaGolsXCroacia.getText());
            bw.newLine();
            bw.write(CanadaGolsXMarrocos.getText() + ";" + MarrocosGolsXCanada.getText());
            bw.newLine();
            bw.write(CroaciaGolsXBelgica.getText() + ";" + BelgicaGolsXCroacia.getText());
            bw.newLine();
            bw.write(SuicaGolsXCamaroes.getText() + ";" + CamaroesGolsXSuica.getText());
            bw.newLine();
            bw.write(BrasilGolsXServia.getText() + ";" + SerrviaGolsXBrasil.getText());
            bw.newLine();
            bw.write(CamaroesGolsXServia.getText() + ";" + ServiaGolsXCamaroes.getText());
            bw.newLine();
            bw.write(BrasilGolsXSuica.getText() + ";" + SuicaGolsXBrasil.getText());
            bw.newLine();
            bw.write(ServiaGolsXSuica.getText() + ";" + SuicaGolsXServia.getText());
            bw.newLine();
            bw.write(CamaroesGolsXBrasil.getText() + ";" + BrasilGolsXCamaroes.getText());
            bw.newLine();
            bw.write(UruguaiGolsXCoreia.getText() + ";" + CoreiaGolsXUruguai.getText());
            bw.newLine();
            bw.write(PortugalGolsXGana.getText() + ";" + GanaGolsXPortugal.getText());
            bw.newLine();
            bw.write(CoreiaGolsXGana.getText() + ";" + GanaGolsXCoreia.getText());
            bw.newLine();
            bw.write(PortugalGolsXUruguai.getText() + ";" + UruguaiGolsXPortugal.getText());
            bw.newLine();
            bw.write(CoreiaGolsXPortual.getText() + ";" + PortugalGolsXCoreia.getText());
            bw.newLine();
            bw.write(GanaGolsXUruguai.getText() + ";" + UruguaiGolsXGana.getText());
            bw.newLine();
            //Oitavas:
            bw.write(Gols1Oitavas1.getText() + ";" + Gols2Oitavas1.getText() + ";" + Penaltis1Oitavas1.getText() + ";" + Penaltis2Oitavas1.getText());
            bw.newLine();
            bw.write(Gols1Oitavas2.getText() + ";" + Gols2Oitavas2.getText() + ";" + Penaltis1Oitavas2.getText() + ";" + Penaltis2Oitavas2.getText());
            bw.newLine();
            bw.write(Gols1Oitavas3.getText() + ";" + Gols2Oitavas3.getText() + ";" + Penaltis1Oitavas3.getText() + ";" + Penaltis2Oitavas3.getText());
            bw.newLine();
            bw.write(Gols1Oitavas4.getText() + ";" + Gols2Oitavas4.getText() + ";" + Penaltis1Oitavas4.getText() + ";" + Penaltis2Oitavas4.getText());
            bw.newLine();
            bw.write(Gols1Oitavas5.getText() + ";" + Gols2Oitavas5.getText() + ";" + Penaltis1Oitavas5.getText() + ";" + Penaltis2Oitavas5.getText());
            bw.newLine();
            bw.write(Gols1Oitavas6.getText() + ";" + Gols2Oitavas6.getText() + ";" + Penaltis1Oitavas6.getText() + ";" + Penaltis2Oitavas6.getText());
            bw.newLine();
            bw.write(Gols1Oitavas7.getText() + ";" + Gols2Oitavas7.getText() + ";" + Penaltis1Oitavas7.getText() + ";" + Penaltis2Oitavas7.getText());
            bw.newLine();
            bw.write(Gols1Oitavas8.getText() + ";" + Gols2Oitavas8.getText() + ";" + Penaltis1Oitavas8.getText() + ";" + Penaltis2Oitavas8.getText());
            bw.newLine();
            //Quartas
            bw.write(Gols1Quartas1.getText() + ";" + Gols2Quartas1.getText() + ";" + Penaltis1Quartas1.getText() + ";" + Penaltis2Quartas1.getText());
            bw.newLine();
            bw.write(Gols1Quartas2.getText() + ";" + Gols2Quartas2.getText() + ";" + Penaltis1Quartas2.getText() + ";" + Penaltis2Quartas2.getText());
            bw.newLine();
            bw.write(Gols1Quartas3.getText() + ";" + Gols2Quartas3.getText() + ";" + Penaltis1Quartas3.getText() + ";" + Penaltis2Quartas3.getText());
            bw.newLine();
            bw.write(Gols1Quartas4.getText() + ";" + Gols2Quartas4.getText() + ";" + Penaltis1Quartas4.getText() + ";" + Penaltis2Quartas4.getText());
            bw.newLine();
            //Semis
            bw.write(Gols1Semi1.getText() + ";" + Gols2Semi1.getText() + ";" + Penaltis1Semi1.getText() + ";" + Penaltis1Semi1.getText());
            bw.newLine();
            bw.write(Gols1Semi2.getText() + ";" + Gols2Semi2.getText() + ";" + Penaltis1Semi2.getText() + ";" + Penaltis1Semi2.getText());
            bw.newLine();
            //Final e Terceiro Lugar
            bw.write(Gols1Final.getText() + ";" + Gols2Final.getText() + ";" + Penaltis1Final.getText() + ";" + Penaltis2Final.getText());
            bw.newLine();
            bw.write(Gols1Terceiro.getText() + ";" + Gols2Terceiro.getText() + ";" + Penaltis1Terceiro.getText() + ";" + Penaltis2Terceiro.getText());
            bw.newLine();
            bw.write(A1.getText());
            bw.newLine();
            bw.write(B2.getText());
            bw.newLine();
            bw.write(C1.getText());
            bw.newLine();
            bw.write(D2.getText());
            bw.newLine();
            bw.write(E1.getText());
            bw.newLine();
            bw.write(F2.getText());
            bw.newLine();
            bw.write(G1.getText());
            bw.newLine();
            bw.write(H2.getText());
            bw.newLine();
            bw.write(B1.getText());
            bw.newLine();
            bw.write(A2.getText());
            bw.newLine();
            bw.write(D1.getText());
            bw.newLine();
            bw.write(C2.getText());
            bw.newLine();
            bw.write(F1.getText());
            bw.newLine();
            bw.write(E2.getText());
            bw.newLine();
            bw.write(H1.getText());
            bw.newLine();
            bw.write(G2.getText());
            bw.newLine();
            bw.write(VencedorOitavas1.getText());
            bw.newLine();
            bw.write(VencedorOitavas2.getText());
            bw.newLine();
            bw.write(VencedorOitavas3.getText());
            bw.newLine();
            bw.write(VencedorOitavas4.getText());
            bw.newLine();
            bw.write(VencedorOitavas5.getText());
            bw.newLine();
            bw.write(VencedorOitavas6.getText());
            bw.newLine();
            bw.write(VencedorOitavas7.getText());
            bw.newLine();
            bw.write(VencedorOitavas8.getText());
            bw.newLine();
            bw.write(VencedorQuartas1.getText());
            bw.newLine();
            bw.write(VencedorQuartas2.getText());
            bw.newLine();
            bw.write(VencedorQuartas3.getText());
            bw.newLine();
            bw.write(VencedorQuartas4.getText());
            bw.newLine();
            bw.write(VencedorSemi1.getText());
            bw.newLine();
            bw.write(VencedorSemi2.getText());
            bw.newLine();
            bw.write(PerderdorSemi1.getText());
            bw.newLine();
            bw.write(PerderdorSemi2.getText());
            bw.newLine();
            bw.write(VencedorFinal.getText());
            bw.newLine();
            bw.write(VencedorTerceiro.getText());

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void Ler() throws FileNotFoundException {
        File arquivo = new File("D:/TrabalhoPOO/TrabalhoPOO/tabelaCopa.txt");
        Scanner sc = new Scanner(arquivo);
        try{
            if(arquivo.exists()){
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);

                for(int nLinha = 1 ; nLinha<=64;nLinha++){
                    String linha = sc.nextLine();
                    String linhaSplit [] = linha.split(";");

                    if(nLinha == 1){
                        CatarGolsXEquador.setText(linhaSplit[0]);
                        EquadorGolsXCatar.setText(linhaSplit[1]);
                    }
                    if(nLinha == 2){
                        SenegalGolsXHolanda.setText(linhaSplit[0]);
                        HolandaGolsXSenegal.setText(linhaSplit[1]);
                    }
                    if(nLinha == 3){
                        CatarGolsXSenegal.setText(linhaSplit[0]);
                        SenegalGolsXCatar.setText(linhaSplit[1]);
                    }
                    if(nLinha == 4){
                        HolandaGolsXEquador.setText(linhaSplit[0]);
                        EquadorGolsXHolanda.setText(linhaSplit[1]);
                    }
                    if(nLinha == 5){
                        EquadorGolsXSenegal.setText(linhaSplit[0]);
                        SenegalGolsXEquador.setText(linhaSplit[1]);
                    }
                    if(nLinha == 6){
                        HolandaGolsXCatar.setText(linhaSplit[0]);
                        CatarGolsXHolanda.setText(linhaSplit[1]);
                    }
                    //Grupo B
                    if(nLinha == 7){
                        InglaterraGolsXIra.setText(linhaSplit[0]);
                        IraGolsXInglaterra.setText(linhaSplit[1]);
                    }
                    if(nLinha == 8){
                        GalesGolsXEstadosUnidos.setText(linhaSplit[0]);
                        EstadosUnidosGolsXGales.setText(linhaSplit[1]);
                    }
                    if(nLinha == 9){
                        GalesGolsXIra.setText(linhaSplit[0]);
                        IraGolsXGales.setText(linhaSplit[1]);
                    }
                    if(nLinha == 10){
                        InglaterraGolsXEstadosUnidos.setText(linhaSplit[0]);
                        EstadosUnidosGolsXInglaterra.setText(linhaSplit[1]);
                    }
                    if(nLinha ==11){
                        IraGolsXEstadosUnidos.setText(linhaSplit[0]);
                        EstadosUnidosGolsXIra.setText(linhaSplit[1]);
                    }
                    if(nLinha ==12){
                        GalesGolsXInglaterra.setText(linhaSplit[0]);
                        InglaterraGolsXGales.setText(linhaSplit[1]);
                    }
                    //Grupo C
                    if(nLinha ==13){
                        ArgentinaGolsXArabia.setText(linhaSplit[0]);
                        ArabiaGolsXArgentina.setText(linhaSplit[1]);
                    }
                    if(nLinha ==14){
                        MexicoGolsXPolonia.setText(linhaSplit[0]);
                        PoloniaGolsXMexico.setText(linhaSplit[1]);
                    }
                    if(nLinha ==15){
                        PoloniaGolsXArabia.setText(linhaSplit[0]);
                        ArabiaGolsXPolonia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==16){
                        ArgentinaGolsXMexico.setText(linhaSplit[0]);
                        MexicoGolsXArgentina.setText(linhaSplit[1]);
                    }
                    if(nLinha ==17){
                        PoloniaGolsXArgentina.setText(linhaSplit[0]);
                        ArgentinaGolsXPolonia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==18){
                        ArabiaGolsXMexico.setText(linhaSplit[0]);
                        MexicoGolsXArabia.setText(linhaSplit[1]);
                    }
                    //Grupo D
                    if(nLinha ==19){
                        DinamarcaGolsXTunisia.setText(linhaSplit[0]);
                        TunisiaGolsXDinamarca.setText(linhaSplit[1]);
                    }
                    if(nLinha ==20){
                        FrancaGolsXAustralia.setText(linhaSplit[0]);
                        AustraliaGolsXFranca.setText(linhaSplit[1]);
                    }
                    if(nLinha ==21){
                        TunisiaGolsXAustralia.setText(linhaSplit[0]);
                        AustraliaGolsXTunisia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==22){
                        FrancaGolsXDinamarca.setText(linhaSplit[0]);
                        DinamarcaGolsXFranca.setText(linhaSplit[1]);
                    }
                    if(nLinha ==23){
                        TunisiaGolsXFranca.setText(linhaSplit[0]);
                        FrancaGolsXTunisia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==24){
                        AustraliaGolsXDinamarca.setText(linhaSplit[0]);
                        DinamarcaGolsXAustralia.setText(linhaSplit[1]);
                    }
                    //Grupo E
                    if(nLinha ==25){
                        AlemanhaGolsXJapao.setText(linhaSplit[0]);
                        JapaoGolsXAlemanha.setText(linhaSplit[1]);
                    }
                    if(nLinha ==26){
                        EspanhaGolsXCostaRica.setText(linhaSplit[0]);
                        CostaRicaGolsXEspanha.setText(linhaSplit[1]);
                    }
                    if(nLinha ==27){
                        JapaoGolsXCostaRica.setText(linhaSplit[0]);
                        CostaRicaGolsXJapao.setText(linhaSplit[1]);
                    }
                    if(nLinha ==28){
                        EspanhaGolsXAlemanha.setText(linhaSplit[0]);
                        AlemanhaGolsXEspanha.setText(linhaSplit[1]);
                    }
                    if(nLinha ==29){
                        JapaoGolsXEspanha.setText(linhaSplit[0]);
                        EspanhaGolsXJapao.setText(linhaSplit[1]);
                    }
                    if(nLinha ==30){
                        CostaRicaGolsXAlemanha.setText(linhaSplit[0]);
                        AlemanhaGolsXCostaRica.setText(linhaSplit[1]);
                    }
                    //Grupo F
                    if(nLinha ==31){
                        MarrocosGolsXCroacia.setText(linhaSplit[0]);
                        CroaciaGolsXMarrocos.setText(linhaSplit[1]);
                    }
                    if(nLinha ==32){
                        BelgicaGolsXCanada.setText(linhaSplit[0]);
                        CanadaGolsXBelgica.setText(linhaSplit[1]);
                    }
                    if(nLinha ==33){
                        BelgicaGolsXMarrocos.setText(linhaSplit[0]);
                        MarrocosGolsXBelgica.setText(linhaSplit[1]);
                    }
                    if(nLinha ==34){
                        CroaciaGolsXCanada.setText(linhaSplit[0]);
                        CanadaGolsXCroacia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==35){
                        CanadaGolsXMarrocos.setText(linhaSplit[0]);
                        MarrocosGolsXCanada.setText(linhaSplit[1]);
                    }
                    if(nLinha ==36){
                        CroaciaGolsXBelgica.setText(linhaSplit[0]);
                        BelgicaGolsXCroacia.setText(linhaSplit[1]);
                    }
                    //Grupo G
                    if(nLinha ==37){
                        SuicaGolsXCamaroes.setText(linhaSplit[0]);
                        CamaroesGolsXSuica.setText(linhaSplit[1]);
                    }
                    if(nLinha ==38){
                        BrasilGolsXServia.setText(linhaSplit[0]);
                        SerrviaGolsXBrasil.setText(linhaSplit[1]);
                    }
                    if(nLinha ==39){
                        CamaroesGolsXServia.setText(linhaSplit[0]);
                        ServiaGolsXCamaroes.setText(linhaSplit[1]);
                    }
                    if(nLinha ==40){
                        BrasilGolsXSuica.setText(linhaSplit[0]);
                        SuicaGolsXBrasil.setText(linhaSplit[1]);
                    }
                    if(nLinha ==41){
                        ServiaGolsXSuica.setText(linhaSplit[0]);
                        SuicaGolsXServia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==42){
                        CamaroesGolsXBrasil.setText(linhaSplit[0]);
                        BrasilGolsXCamaroes.setText(linhaSplit[1]);
                    }
                    //Grupo H
                    if(nLinha ==43){
                        UruguaiGolsXCoreia.setText(linhaSplit[0]);
                        CoreiaGolsXUruguai.setText(linhaSplit[1]);
                    }
                    if(nLinha ==44){
                        PortugalGolsXGana.setText(linhaSplit[0]);
                        GanaGolsXPortugal.setText(linhaSplit[1]);
                    }
                    if(nLinha ==45){
                        CoreiaGolsXGana.setText(linhaSplit[0]);
                        GanaGolsXCoreia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==46){
                        PortugalGolsXUruguai.setText(linhaSplit[0]);
                        UruguaiGolsXPortugal.setText(linhaSplit[1]);
                    }
                    if(nLinha ==47){
                        CoreiaGolsXPortual.setText(linhaSplit[0]);
                        PortugalGolsXCoreia.setText(linhaSplit[1]);
                    }
                    if(nLinha ==48){
                        GanaGolsXUruguai.setText(linhaSplit[0]);
                        UruguaiGolsXGana.setText(linhaSplit[1]);
                    }
                    //Oitavas
                    if(nLinha ==49){
                        Gols1Oitavas1.setText(linhaSplit[0]);
                        Gols2Oitavas1.setText(linhaSplit[1]);
                        Penaltis1Oitavas1.setText(linhaSplit[2]);
                        Penaltis2Oitavas1.setText(linhaSplit[3]);
                    }
                    if(nLinha ==50){
                        Gols1Oitavas2.setText(linhaSplit[0]);
                        Gols2Oitavas2.setText(linhaSplit[1]);
                        Penaltis1Oitavas2.setText(linhaSplit[2]);
                        Penaltis2Oitavas2.setText(linhaSplit[3]);

                    }
                    if(nLinha ==51){
                        Gols1Oitavas3.setText(linhaSplit[0]);
                        Gols2Oitavas3.setText(linhaSplit[1]);
                        Penaltis1Oitavas3.setText(linhaSplit[2]);
                        Penaltis2Oitavas3.setText(linhaSplit[3]);
                    }
                    if(nLinha ==52){
                        Gols1Oitavas4.setText(linhaSplit[0]);
                        Gols2Oitavas4.setText(linhaSplit[1]);
                        Penaltis1Oitavas4.setText(linhaSplit[2]);
                        Penaltis2Oitavas4.setText(linhaSplit[3]);
                    }
                    if(nLinha ==53){
                        Gols1Oitavas5.setText(linhaSplit[0]);
                        Gols2Oitavas5.setText(linhaSplit[1]);
                        Penaltis1Oitavas5.setText(linhaSplit[2]);
                        Penaltis2Oitavas5.setText(linhaSplit[3]);
                    }
                    if(nLinha ==54){
                        Gols1Oitavas6.setText(linhaSplit[0]);
                        Gols2Oitavas6.setText(linhaSplit[1]);
                        Penaltis1Oitavas6.setText(linhaSplit[2]);
                        Penaltis2Oitavas6.setText(linhaSplit[3]);

                    }
                    if(nLinha ==55){
                        Gols1Oitavas7.setText(linhaSplit[0]);
                        Gols2Oitavas7.setText(linhaSplit[1]);
                        Penaltis1Oitavas7.setText(linhaSplit[2]);
                        Penaltis2Oitavas7.setText(linhaSplit[3]);
                    }
                    if(nLinha ==56){
                        Gols1Oitavas8.setText(linhaSplit[0]);
                        Gols2Oitavas8.setText(linhaSplit[1]);
                        Penaltis1Oitavas8.setText(linhaSplit[2]);
                        Penaltis2Oitavas8.setText(linhaSplit[3]);
                    }
                    //Quartas
                    if(nLinha ==57){
                        Gols1Quartas1.setText(linhaSplit[0]);
                        Gols2Quartas1.setText(linhaSplit[1]);
                        Penaltis1Quartas1.setText(linhaSplit[2]);
                        Penaltis2Quartas1.setText(linhaSplit[3]);
                    }
                    if(nLinha ==58){
                        Gols1Quartas2.setText(linhaSplit[0]);
                        Gols2Quartas2.setText(linhaSplit[1]);
                        Penaltis1Quartas2.setText(linhaSplit[2]);
                        Penaltis2Quartas2.setText(linhaSplit[3]);
                    }
                    if(nLinha ==59){
                        Gols1Quartas3.setText(linhaSplit[0]);
                        Gols2Quartas3.setText(linhaSplit[1]);
                        Penaltis1Quartas3.setText(linhaSplit[2]);
                        Penaltis2Quartas3.setText(linhaSplit[3]);
                    }
                    if(nLinha ==60){
                        Gols1Quartas4.setText(linhaSplit[0]);
                        Gols2Quartas4.setText(linhaSplit[1]);
                        Penaltis1Quartas4.setText(linhaSplit[2]);
                        Penaltis2Quartas4.setText(linhaSplit[3]);
                    }
                    //Semis
                    if(nLinha ==61){
                        Gols1Semi1.setText(linhaSplit[0]);
                        Gols2Semi1.setText(linhaSplit[1]);
                        Penaltis1Semi1.setText(linhaSplit[2]);
                        Penaltis2Semi1.setText(linhaSplit[3]);
                    }
                    if(nLinha ==62){
                        Gols1Semi2.setText(linhaSplit[0]);
                        Gols2Semi2.setText(linhaSplit[1]);
                        Penaltis1Semi2.setText(linhaSplit[2]);
                        Penaltis2Semi2.setText(linhaSplit[3]);
                    }
                    //Final e Terceiro
                    if(nLinha ==63){
                        Gols1Final.setText(linhaSplit[0]);
                        Gols2Final.setText(linhaSplit[1]);
                        Penaltis1Final.setText(linhaSplit[2]);
                        Penaltis2Final.setText(linhaSplit[3]);
                    }
                    if(nLinha ==64){
                        Gols1Terceiro.setText(linhaSplit[0]);
                        Gols2Terceiro.setText(linhaSplit[1]);
                        Penaltis1Terceiro.setText(linhaSplit[2]);
                        Penaltis2Terceiro.setText(linhaSplit[3]);
                    }
                }

                for(int nl = 1; nl <= 34; nl++){
                    String linha1 = sc.nextLine();
                    if(nl == 1){
                        A1.setText(linha1);
                    }
                    if(nl == 2){
                        B2.setText(linha1);
                    }
                    if(nl == 3){
                        C1.setText(linha1);
                    }
                    if(nl == 4){
                        D2.setText(linha1);
                    }
                    if(nl == 5){
                        E1.setText(linha1);
                    }
                    if(nl == 6){
                        F2.setText(linha1);
                    }
                    if(nl == 7){
                        G1.setText(linha1);
                    }
                    if(nl == 8){
                        H2.setText(linha1);
                    }
                    if(nl == 9){
                        B1.setText(linha1);
                    }
                    if(nl == 10){
                        A2.setText(linha1);
                    }
                    if(nl == 11){
                        D1.setText(linha1);
                    }
                    if(nl == 12){
                        C2.setText(linha1);
                    }
                    if(nl == 13){
                        F1.setText(linha1);
                    }
                    if(nl == 14){
                        E2.setText(linha1);
                    }
                    if(nl == 15){
                        H1.setText(linha1);
                    }
                    if(nl == 16){
                        G2.setText(linha1);
                    }
                    if(nl == 17){
                        VencedorOitavas1.setText(linha1);
                    }
                    if(nl == 18){
                        VencedorOitavas2.setText(linha1);
                    }
                    if(nl == 19){
                        VencedorOitavas3.setText(linha1);
                    }
                    if(nl == 20){
                        VencedorOitavas4.setText(linha1);
                    }
                    if(nl == 21){
                        VencedorOitavas5.setText(linha1);
                    }
                    if(nl == 22){
                        VencedorOitavas6.setText(linha1);
                    }
                    if(nl == 23){
                        VencedorOitavas7.setText(linha1);
                    }
                    if(nl == 24){
                        VencedorOitavas8.setText(linha1);
                    }
                    if(nl == 25){
                        VencedorQuartas1.setText(linha1);
                    }
                    if(nl == 26){
                        VencedorQuartas2.setText(linha1);
                    }
                    if(nl == 27){
                        VencedorQuartas3.setText(linha1);
                    }
                    if(nl == 28){
                        VencedorQuartas4.setText(linha1);
                    }
                    if(nl == 29){
                        VencedorSemi1.setText(linha1);
                    }
                    if(nl == 30){
                        VencedorSemi2.setText(linha1);
                    }
                    if(nl == 31){
                        PerderdorSemi1.setText(linha1);
                    }
                    if(nl == 32){
                        PerderdorSemi2.setText(linha1);
                    }
                    if(nl == 33){
                        VencedorFinal.setText(linha1);
                    }
                    if(nl == 34){
                        VencedorTerceiro.setText(linha1);
                    }

                }
            }
        }catch (IOException ex){

        }
    }

    public Tabela() {

        try {
            Ler();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Excessões Tratadas

        enviarBotaoGrupoA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoA, Time2GrupoA, Time3GrupoA, Time4GrupoA};

                    JLabel[] vitorias = new JLabel[]{V1A, V2A, V3A, V4A};

                    JLabel[] empates = new JLabel[]{E1A, E2A, E3A, E4A};

                    JLabel[] derrotas = new JLabel[]{D1A, D2A, D3A, D4A};

                    JLabel[] golsPro = new JLabel[]{GP1A, GP2A, GP3A, GP4A};

                    JLabel[] golsCon = new JLabel[]{GC1A, GC2A, GC3A, GC4A};

                    JLabel[] saldoGols = new JLabel[]{SG1A, SG2A, SG3A, SG4A};

                    JLabel[] pontos = new JLabel[]{PTS1A, PTS2A, PTS3A, PTS4A};

                    ArrayList<Time> GrupoAArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoATexts.length; i++){

                        if(Integer.parseInt(GrupoATexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoATimes.length; i++) {

                        GrupoAArrayList.add(GrupoATimes[i]);

                    }

                    for (int i = 0; i < GrupoAArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoAArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i).setGols1(Integer.parseInt(GrupoATexts[2 * i].getText()));

                        copa.getPartidas().get(i).getTime1().addGols(Integer.parseInt(GrupoATexts[2 * i].getText()));

                        copa.getPartidas().get(i).getTime2().addGolsSofridos(Integer.parseInt(GrupoATexts[2 * i].getText()));

                        copa.getPartidas().get(i).setGols2(Integer.parseInt(GrupoATexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i).getTime2().addGols(Integer.parseInt(GrupoATexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i).getTime1().addGolsSofridos(Integer.parseInt(GrupoATexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i).definePontos();

                        copa.getPartidas().get(i).defineVDE();

                    }

                    for (int i = 0; i < GrupoATimes.length; i++) {

                        GrupoAArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoATimes.length; i++) {

                        GrupoATimes[i].definePontos();

                        GrupoATimes[i].defineSaldoDeGols();

                        GrupoAArrayList.add(GrupoATimes[i]);

                    }

                    Collections.sort(GrupoAArrayList, new Comparador());

                    for (int i = 0; i < GrupoAArrayList.size(); i++) {

                        times[i].setText(GrupoAArrayList.get(i).getNome());

                        vitorias[i].setText(Integer.toString(GrupoAArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoAArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoAArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoAArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoAArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoAArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoAArrayList.get(i).getPontos()));

                    }

                    A1.setText(GrupoAArrayList.get(0).getNome());

                    A2.setText(GrupoAArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGrupoB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoB, Time2GrupoB, Time3GrupoB, Time4GrupoB};

                    JLabel[] vitorias = new JLabel[]{V1B, V2B, V3B, V4B};

                    JLabel[] empates = new JLabel[]{E1B, E2B, E3B, E4B};

                    JLabel[] derrotas = new JLabel[]{D1B, D2B, D3B, D4B};

                    JLabel[] golsPro = new JLabel[]{GP1B, GP2B, GP3B, GP4B};

                    JLabel[] golsCon = new JLabel[]{GC1B, GC2B, GC3B, GC4B};

                    JLabel[] saldoGols = new JLabel[]{SG1B, SG2B, SG3B, SG4B};

                    JLabel[] pontos = new JLabel[]{PTS1B, PTS2B, PTS3B, PTS4B};

                    ArrayList<Time> GrupoBArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoBTexts.length; i++){

                        if(Integer.parseInt(GrupoBTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoBTimes.length; i++) {

                        GrupoBArrayList.add(GrupoBTimes[i]);

                    }

                    for (int i = 0; i < GrupoBArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoBArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 6).setGols1(Integer.parseInt(GrupoBTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 6).getTime1().addGols(Integer.parseInt(GrupoBTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 6).getTime2().addGolsSofridos(Integer.parseInt(GrupoBTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 6).setGols2(Integer.parseInt(GrupoBTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 6).getTime2().addGols(Integer.parseInt(GrupoBTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 6).getTime1().addGolsSofridos(Integer.parseInt(GrupoBTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 6).definePontos();

                        copa.getPartidas().get(i + 6).defineVDE();

                    }

                    for (int i = 0; i < GrupoBTimes.length; i++) {

                        GrupoBArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoBTimes.length; i++) {

                        GrupoBTimes[i].definePontos();

                        GrupoBTimes[i].defineSaldoDeGols();

                        GrupoBArrayList.add(GrupoBTimes[i]);

                    }

                    Collections.sort(GrupoBArrayList, new Comparador());

                    for (int i = 0; i < GrupoBArrayList.size(); i++) {

                        times[i].setText(GrupoBArrayList.get(i).getNome());

                        vitorias[i].setText(Integer.toString(GrupoBArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoBArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoBArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoBArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoBArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoBArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoBArrayList.get(i).getPontos()));

                    }

                    B1.setText(GrupoBArrayList.get(0).getNome());

                    B2.setText(GrupoBArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }
            }
        });
        enviarBotaoGrupoC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoC, Time2GrupoC, Time3GrupoC, Time4GrupoC};

                    JLabel[] vitorias = new JLabel[]{V1C, V2C, V3C, V4C};

                    JLabel[] empates = new JLabel[]{E1C, E2C, E3C, E4C};

                    JLabel[] derrotas = new JLabel[]{D1C, D2C, D3C, D4C};

                    JLabel[] golsPro = new JLabel[]{GP1C, GP2C, GP3C, GP4C};

                    JLabel[] golsCon = new JLabel[]{GC1C, GC2C, GC3C, GC4C};

                    JLabel[] saldoGols = new JLabel[]{SG1C, SG2C, SG3C, SG4C};

                    JLabel[] pontos = new JLabel[]{PTS1C, PTS2C, PTS3C, PTS4C};

                    ArrayList<Time> GrupoCArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoCTexts.length; i++){

                        if(Integer.parseInt(GrupoCTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoCTimes.length; i++) {

                        GrupoCArrayList.add(GrupoCTimes[i]);

                    }

                    for (int i = 0; i < GrupoCArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoCArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 12).setGols1(Integer.parseInt(GrupoCTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 12).getTime1().addGols(Integer.parseInt(GrupoCTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 12).getTime2().addGolsSofridos(Integer.parseInt(GrupoCTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 12).setGols2(Integer.parseInt(GrupoCTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 12).getTime2().addGols(Integer.parseInt(GrupoCTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 12).getTime1().addGolsSofridos(Integer.parseInt(GrupoCTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 12).definePontos();

                        copa.getPartidas().get(i + 12).defineVDE();

                    }

                    for (int i = 0; i < GrupoCTimes.length; i++) {

                        GrupoCArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoCTimes.length; i++) {

                        GrupoCTimes[i].definePontos();

                        GrupoCTimes[i].defineSaldoDeGols();

                        GrupoCArrayList.add(GrupoCTimes[i]);

                    }

                    Collections.sort(GrupoCArrayList, new Comparador());

                    for (int i = 0; i < GrupoCArrayList.size(); i++) {

                        times[i].setText(GrupoCArrayList.get(i).getNome());

                        vitorias[i].setText(Integer.toString(GrupoCArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoCArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoCArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoCArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoCArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoCArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoCArrayList.get(i).getPontos()));

                    }

                    C1.setText(GrupoCArrayList.get(0).getNome());

                    C2.setText(GrupoCArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGupoD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoD, Time2GrupoD, Time3GrupoD, Time4GrupoD};

                    JLabel[] vitorias = new JLabel[]{V1D, V2D, V3D, V4D};

                    JLabel[] empates = new JLabel[]{E1D, E2D, E3D, E4D};

                    JLabel[] derrotas = new JLabel[]{D1D, D2D, D3D, D4D};

                    JLabel[] golsPro = new JLabel[]{GP1D, GP2D, GP3D, GP4D};

                    JLabel[] golsCon = new JLabel[]{GC1D, GC2D, GC3D, GC4D};

                    JLabel[] saldoGols = new JLabel[]{SG1D, SG2D, SG3D, SG4D};

                    JLabel[] pontos = new JLabel[]{PTS1D, PTS2D, PTS3D, PTS4D};

                    ArrayList<Time> GrupoDArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoDTexts.length; i++){

                        if(Integer.parseInt(GrupoDTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoDTimes.length; i++) {

                        GrupoDArrayList.add(GrupoDTimes[i]);

                    }

                    for (int i = 0; i < GrupoDArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoDArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 18).setGols1(Integer.parseInt(GrupoDTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 18).getTime1().addGols(Integer.parseInt(GrupoDTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 18).getTime2().addGolsSofridos(Integer.parseInt(GrupoDTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 18).setGols2(Integer.parseInt(GrupoDTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 18).getTime2().addGols(Integer.parseInt(GrupoDTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 18).getTime1().addGolsSofridos(Integer.parseInt(GrupoDTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 18).definePontos();

                        copa.getPartidas().get(i + 18).defineVDE();

                    }

                    for (int i = 0; i < GrupoDTimes.length; i++) {

                        GrupoDArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoDTimes.length; i++) {

                        GrupoDTimes[i].definePontos();

                        GrupoDTimes[i].defineSaldoDeGols();

                        GrupoDArrayList.add(GrupoDTimes[i]);

                    }

                    Collections.sort(GrupoDArrayList, new Comparador());

                    for (int i = 0; i < GrupoDArrayList.size(); i++) {

                        times[i].setText(GrupoDArrayList.get(i).getNome());

                        vitorias[i].setText(Integer.toString(GrupoDArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoDArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoDArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoDArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoDArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoDArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoDArrayList.get(i).getPontos()));

                    }

                    D1.setText(GrupoDArrayList.get(0).getNome());

                    D2.setText(GrupoDArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGrupoE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoE, Time2GrupoE, Time3GrupoE, Time4GrupoE};

                    JLabel[] vitorias = new JLabel[]{V1E, V2E, V3E, V4E};

                    JLabel[] empates = new JLabel[]{E1E, E2E, E3E, E4E};

                    JLabel[] derrotas = new JLabel[]{D1E, D2E, D3E, D4E};

                    JLabel[] golsPro = new JLabel[]{GP1E, GP2E, GP3E, GP4E};

                    JLabel[] golsCon = new JLabel[]{GC1E, GC2E, GC3E, GC4E};

                    JLabel[] saldoGols = new JLabel[]{SG1E, SG2E, SG3E, SG4E};

                    JLabel[] pontos = new JLabel[]{PTS1E, PTS2E, PTS3E, PTS4E};

                    ArrayList<Time> GrupoEArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoETexts.length; i++){

                        if(Integer.parseInt(GrupoETexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoETimes.length; i++) {

                        GrupoEArrayList.add(GrupoETimes[i]);

                    }

                    for (int i = 0; i < GrupoEArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoEArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 24).setGols1(Integer.parseInt(GrupoETexts[2 * i].getText()));

                        copa.getPartidas().get(i + 24).getTime1().addGols(Integer.parseInt(GrupoETexts[2 * i].getText()));

                        copa.getPartidas().get(i + 24).getTime2().addGolsSofridos(Integer.parseInt(GrupoETexts[2 * i].getText()));

                        copa.getPartidas().get(i + 24).setGols2(Integer.parseInt(GrupoETexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 24).getTime2().addGols(Integer.parseInt(GrupoETexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 24).getTime1().addGolsSofridos(Integer.parseInt(GrupoETexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 24).definePontos();

                        copa.getPartidas().get(i + 24).defineVDE();

                    }

                    for (int i = 0; i < GrupoETimes.length; i++) {

                        GrupoEArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoETimes.length; i++) {

                        GrupoETimes[i].definePontos();

                        GrupoETimes[i].defineSaldoDeGols();

                        GrupoEArrayList.add(GrupoETimes[i]);

                    }

                    Collections.sort(GrupoEArrayList, new Comparador());

                    for (int i = 0; i < GrupoEArrayList.size(); i++) {

                        times[i].setText(GrupoEArrayList.get(i).getNome());

                        vitorias[i].setText(Integer.toString(GrupoEArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoEArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoEArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoEArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoEArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoEArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoEArrayList.get(i).getPontos()));

                    }

                    E1.setText(GrupoEArrayList.get(0).getNome());

                    E2.setText(GrupoEArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGupoF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoF, Time2GrupoF, Time3GrupoF, Time4GrupoF};

                    JLabel[] vitorias = new JLabel[]{V1F, V2F, V3F, V4F};

                    JLabel[] empates = new JLabel[]{E1F, E2F, E3F, E4F};

                    JLabel[] derrotas = new JLabel[]{D1F, D2F, D3F, D4F};

                    JLabel[] golsPro = new JLabel[]{GP1F, GP2F, GP3F, GP4F};

                    JLabel[] golsCon = new JLabel[]{GC1F, GC2F, GC3F, GC4F};

                    JLabel[] saldoGols = new JLabel[]{SG1F, SG2F, SG3F, SG4F};

                    JLabel[] pontos = new JLabel[]{PTS1F, PTS2F, PTS3F, PTS4F};

                    ArrayList<Time> GrupoFArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoFTexts.length; i++){

                        if(Integer.parseInt(GrupoFTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoFTimes.length; i++) {

                        GrupoFArrayList.add(GrupoFTimes[i]);

                    }

                    for (int i = 0; i < GrupoFArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoFArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 30).setGols1(Integer.parseInt(GrupoFTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 30).getTime1().addGols(Integer.parseInt(GrupoFTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 30).getTime2().addGolsSofridos(Integer.parseInt(GrupoFTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 30).setGols2(Integer.parseInt(GrupoFTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 30).getTime2().addGols(Integer.parseInt(GrupoFTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 30).getTime1().addGolsSofridos(Integer.parseInt(GrupoFTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 30).definePontos();

                        copa.getPartidas().get(i + 30).defineVDE();

                    }

                    for (int i = 0; i < GrupoATimes.length; i++) {

                        GrupoFArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoFTimes.length; i++) {

                        GrupoFTimes[i].definePontos();

                        GrupoFTimes[i].defineSaldoDeGols();

                        GrupoFArrayList.add(GrupoFTimes[i]);

                    }

                    Collections.sort(GrupoFArrayList, new Comparador());

                    for (int i = 0; i < GrupoFArrayList.size(); i++) {

                        times[i].setText(GrupoFArrayList.get(i).getNome());

                        vitorias[i].setText(Integer.toString(GrupoFArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoFArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoFArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoFArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoFArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoFArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoFArrayList.get(i).getPontos()));

                    }

                    F1.setText(GrupoFArrayList.get(0).getNome());

                    F2.setText(GrupoFArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGrupoG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoG, Time2GrupoG, Time3GrupoG, Time4GrupoG};

                    JLabel[] vitorias = new JLabel[]{V1G, V2G, V3G, V4G};

                    JLabel[] empates = new JLabel[]{E1G, E2G, E3G, E4G};

                    JLabel[] derrotas = new JLabel[]{D1G, D2G, D3G, D4G};

                    JLabel[] golsPro = new JLabel[]{GP1G, GP2G, GP3G, GP4G};

                    JLabel[] golsCon = new JLabel[]{GC1G, GC2G, GC3G, GC4G};

                    JLabel[] saldoGols = new JLabel[]{SG1G, SG2G, SG3G, SG4G};

                    JLabel[] pontos = new JLabel[]{PTS1G, PTS2G, PTS3G, PTS4G};

                    ArrayList<Time> GrupoGArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoGTexts.length; i++){

                        if(Integer.parseInt(GrupoGTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoGTimes.length; i++) {

                        GrupoGArrayList.add(GrupoGTimes[i]);

                    }

                    for (int i = 0; i < GrupoGArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoGArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 36).setGols1(Integer.parseInt(GrupoGTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 36).getTime1().addGols(Integer.parseInt(GrupoGTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 36).getTime2().addGolsSofridos(Integer.parseInt(GrupoGTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 36).setGols2(Integer.parseInt(GrupoGTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 36).getTime2().addGols(Integer.parseInt(GrupoGTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 36).getTime1().addGolsSofridos(Integer.parseInt(GrupoGTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 36).definePontos();

                        copa.getPartidas().get(i + 36).defineVDE();

                    }

                    for (int i = 0; i < GrupoGTimes.length; i++) {

                        GrupoGArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoGTimes.length; i++) {

                        GrupoGTimes[i].definePontos();

                        GrupoGTimes[i].defineSaldoDeGols();

                        GrupoGArrayList.add(GrupoGTimes[i]);

                    }

                    Collections.sort(GrupoGArrayList, new Comparador());

                    for (int i = 0; i < GrupoGArrayList.size(); i++) {

                        times[i].setText(GrupoGArrayList.get(i).getNome());

                        vitorias[i].setText(Integer.toString(GrupoGArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoGArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoGArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoGArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoGArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoGArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoGArrayList.get(i).getPontos()));

                    }

                    G1.setText(GrupoGArrayList.get(0).getNome());

                    G2.setText(GrupoGArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }

            }
        });
        enviarBotaoGrupoH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    JLabel[] times = new JLabel[]{Time1GrupoH, Time2GrupoH, Time3GrupoH, Time4GrupoH};

                    JLabel[] vitorias = new JLabel[]{V1H, V2H, V3H, V4H};

                    JLabel[] empates = new JLabel[]{E1H, E2H, E3H, E4H};

                    JLabel[] derrotas = new JLabel[]{D1H, D2H, D3H, D4H};

                    JLabel[] golsPro = new JLabel[]{GP1H, GP2H, GP3H, GP4H};

                    JLabel[] golsCon = new JLabel[]{GC1H, GC2H, GC3H, GC4H};

                    JLabel[] saldoGols = new JLabel[]{SG1H, SG2H, SG3H, SG4H};

                    JLabel[] pontos = new JLabel[]{PTS1H, PTS2H, PTS3H, PTS4H};

                    ArrayList<Time> GrupoHArrayList = new ArrayList<>();

                    for(int i = 0; i < GrupoHTexts.length; i++){

                        if(Integer.parseInt(GrupoHTexts[i].getText()) < 0){

                            throw new Exception();

                        }

                    }

                    for (int i = 0; i < GrupoHTimes.length; i++) {

                        GrupoHArrayList.add(GrupoHTimes[i]);

                    }

                    for (int i = 0; i < GrupoHArrayList.size(); i++) {

                        vitorias[i].setText("0");

                        empates[i].setText("0");

                        derrotas[i].setText("0");

                        golsPro[i].setText("0");

                        golsCon[i].setText("0");

                        saldoGols[i].setText("0");

                        pontos[i].setText("0");

                        GrupoHArrayList.get(i).clear();

                    }

                    for (int i = 0; i < 6; i++) {

                        copa.getPartidas().get(i + 42).setGols1(Integer.parseInt(GrupoHTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 42).getTime1().addGols(Integer.parseInt(GrupoHTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 42).getTime2().addGolsSofridos(Integer.parseInt(GrupoHTexts[2 * i].getText()));

                        copa.getPartidas().get(i + 42).setGols2(Integer.parseInt(GrupoHTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 42).getTime2().addGols(Integer.parseInt(GrupoHTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 42).getTime1().addGolsSofridos(Integer.parseInt(GrupoHTexts[(2 * i) + 1].getText()));

                        copa.getPartidas().get(i + 42).definePontos();

                        copa.getPartidas().get(i + 42).defineVDE();

                    }

                    for (int i = 0; i < GrupoHTimes.length; i++) {

                        GrupoHArrayList.remove(0);

                    }

                    for (int i = 0; i < GrupoHTimes.length; i++) {

                        GrupoHTimes[i].definePontos();

                        GrupoHTimes[i].defineSaldoDeGols();

                        GrupoHArrayList.add(GrupoHTimes[i]);

                    }

                    Collections.sort(GrupoHArrayList, new Comparador());

                    for (int i = 0; i < GrupoHArrayList.size(); i++) {

                        times[i].setText(GrupoHArrayList.get(i).getNome());

                        vitorias[i].setText(Integer.toString(GrupoHArrayList.get(i).getVitorias()));

                        empates[i].setText(Integer.toString(GrupoHArrayList.get(i).getEmpates()));

                        derrotas[i].setText(Integer.toString(GrupoHArrayList.get(i).getDerrotas()));

                        golsPro[i].setText(Integer.toString(GrupoHArrayList.get(i).getnGols()));

                        golsCon[i].setText(Integer.toString(GrupoHArrayList.get(i).getnGolsSofridos()));

                        saldoGols[i].setText(Integer.toString(GrupoHArrayList.get(i).getSaldoGols()));

                        pontos[i].setText(Integer.toString(GrupoHArrayList.get(i).getPontos()));

                    }

                    H1.setText(GrupoHArrayList.get(0).getNome());

                    H2.setText(GrupoHArrayList.get(1).getNome());

                    Escrever();

                }

                catch (Exception exception){

                    JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                }
            }
        });

        enviarOitavas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!A1.getText().equals("1A") && !B2.getText().equals("2B")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas1.getText()) >= 0 && Integer.parseInt(Gols2Oitavas1.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas1.getText()) == Integer.parseInt(Gols2Oitavas1.getText())) {

                                Penaltis1Oitavas1.setEditable(true);

                                Penaltis2Oitavas1.setEditable(true);

                                Gols1Oitavas1.setEditable(false);

                                Gols2Oitavas1.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas1.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas1.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas1.getText()) > Integer.parseInt(Penaltis2Oitavas1.getText())) {

                                        VencedorOitavas1.setText(A1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas1.getText()) < Integer.parseInt(Penaltis2Oitavas1.getText())) {

                                        VencedorOitavas1.setText(B2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas1.getText()) == Integer.parseInt(Penaltis2Oitavas1.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas1.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas1.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas1.setText("0");

                                            Penaltis2Oitavas1.setText("0");

                                            Penaltis1Oitavas1.setEditable(false);

                                            Penaltis2Oitavas1.setEditable(false);

                                            Gols1Oitavas1.setEditable(true);

                                            Gols2Oitavas1.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas1.getText()) > Integer.parseInt(Gols2Oitavas1.getText())) {

                                VencedorOitavas1.setText(A1.getText());

                            } else {

                                VencedorOitavas1.setText(B2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas1.setText("0");

                        Penaltis2Oitavas1.setText("0");

                        Penaltis1Oitavas1.setEditable(false);

                        Penaltis2Oitavas1.setEditable(false);

                        Gols1Oitavas1.setEditable(true);

                        Gols2Oitavas1.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }
            }
        });

        enviarOitavas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!C1.getText().equals("1C") && !D2.getText().equals("2D")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas2.getText()) >= 0 && Integer.parseInt(Gols2Oitavas2.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas2.getText()) == Integer.parseInt(Gols2Oitavas2.getText())) {

                                Penaltis1Oitavas2.setEditable(true);

                                Penaltis2Oitavas2.setEditable(true);

                                Gols1Oitavas2.setEditable(false);

                                Gols2Oitavas2.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas2.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas2.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas2.getText()) > Integer.parseInt(Penaltis2Oitavas2.getText())) {

                                        VencedorOitavas2.setText(C1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas2.getText()) < Integer.parseInt(Penaltis2Oitavas2.getText())) {

                                        VencedorOitavas2.setText(D2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas2.getText()) == Integer.parseInt(Penaltis2Oitavas2.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas2.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas2.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas2.setText("0");

                                            Penaltis2Oitavas2.setText("0");

                                            Penaltis1Oitavas2.setEditable(false);

                                            Penaltis2Oitavas2.setEditable(false);

                                            Gols1Oitavas2.setEditable(true);

                                            Gols2Oitavas2.setEditable(true);
                                        }

                                    }

                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas2.getText()) > Integer.parseInt(Gols2Oitavas2.getText())) {

                                VencedorOitavas2.setText(C1.getText());

                            } else {

                                VencedorOitavas2.setText(D2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas2.setText("0");

                        Penaltis2Oitavas2.setText("0");

                        Penaltis1Oitavas2.setEditable(false);

                        Penaltis2Oitavas2.setEditable(false);

                        Gols1Oitavas2.setEditable(true);

                        Gols2Oitavas2.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!E1.getText().equals("1E") && !F2.getText().equals("2F")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas3.getText()) >= 0 && Integer.parseInt(Gols2Oitavas3.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas3.getText()) == Integer.parseInt(Gols2Oitavas3.getText())) {

                                Penaltis1Oitavas3.setEditable(true);

                                Penaltis2Oitavas3.setEditable(true);

                                Gols1Oitavas3.setEditable(false);

                                Gols2Oitavas3.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas3.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas3.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas3.getText()) > Integer.parseInt(Penaltis2Oitavas3.getText())) {

                                        VencedorOitavas3.setText(E1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas3.getText()) < Integer.parseInt(Penaltis2Oitavas3.getText())) {

                                        VencedorOitavas3.setText(F2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas3.getText()) == Integer.parseInt(Penaltis2Oitavas3.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas3.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas3.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas3.setText("0");

                                            Penaltis2Oitavas3.setText("0");

                                            Penaltis1Oitavas3.setEditable(false);

                                            Penaltis2Oitavas3.setEditable(false);

                                            Gols1Oitavas3.setEditable(true);

                                            Gols2Oitavas3.setEditable(true);
                                        }

                                    }

                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas3.getText()) > Integer.parseInt(Gols2Oitavas3.getText())) {

                                VencedorOitavas3.setText(E1.getText());

                            } else {

                                VencedorOitavas3.setText(F2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas3.setText("0");

                        Penaltis2Oitavas3.setText("0");

                        Penaltis1Oitavas3.setEditable(false);

                        Penaltis2Oitavas3.setEditable(false);

                        Gols1Oitavas3.setEditable(true);

                        Gols2Oitavas3.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }
            }
        });

        enviarOitavas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!G1.getText().equals("1G") && !H2.getText().equals("2H")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas4.getText()) >= 0 && Integer.parseInt(Gols2Oitavas4.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas4.getText()) == Integer.parseInt(Gols2Oitavas4.getText())) {

                                Penaltis1Oitavas4.setEditable(true);

                                Penaltis2Oitavas4.setEditable(true);

                                Gols1Oitavas4.setEditable(false);

                                Gols2Oitavas4.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas4.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas4.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas4.getText()) > Integer.parseInt(Penaltis2Oitavas4.getText())) {

                                        VencedorOitavas4.setText(G1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas4.getText()) < Integer.parseInt(Penaltis2Oitavas4.getText())) {

                                        VencedorOitavas4.setText(H2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas4.getText()) == Integer.parseInt(Penaltis2Oitavas4.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas4.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas4.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas4.setText("0");

                                            Penaltis2Oitavas4.setText("0");

                                            Penaltis1Oitavas4.setEditable(false);

                                            Penaltis2Oitavas4.setEditable(false);

                                            Gols1Oitavas4.setEditable(true);

                                            Gols2Oitavas4.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas4.getText()) > Integer.parseInt(Gols2Oitavas4.getText())) {

                                VencedorOitavas4.setText(G1.getText());

                            } else {

                                VencedorOitavas4.setText(H2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas4.setText("0");

                        Penaltis2Oitavas4.setText("0");

                        Penaltis1Oitavas4.setEditable(false);

                        Penaltis2Oitavas4.setEditable(false);

                        Gols1Oitavas4.setEditable(true);

                        Gols2Oitavas4.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!B1.getText().equals("1B") && !A2.getText().equals("2A")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas5.getText()) >= 0 && Integer.parseInt(Gols2Oitavas5.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas5.getText()) == Integer.parseInt(Gols2Oitavas5.getText())) {

                                Penaltis1Oitavas5.setEditable(true);

                                Penaltis2Oitavas5.setEditable(true);

                                Gols1Oitavas5.setEditable(false);

                                Gols2Oitavas5.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas5.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas5.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas5.getText()) > Integer.parseInt(Penaltis2Oitavas5.getText())) {

                                        VencedorOitavas1.setText(B1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas5.getText()) < Integer.parseInt(Penaltis2Oitavas5.getText())) {

                                        VencedorOitavas5.setText(A2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas5.getText()) == Integer.parseInt(Penaltis2Oitavas5.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas5.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas5.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas5.setText("0");

                                            Penaltis2Oitavas5.setText("0");

                                            Penaltis1Oitavas5.setEditable(false);

                                            Penaltis2Oitavas5.setEditable(false);

                                            Gols1Oitavas5.setEditable(true);

                                            Gols2Oitavas5.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas5.getText()) > Integer.parseInt(Gols2Oitavas5.getText())) {

                                VencedorOitavas5.setText(B1.getText());

                            } else {

                                VencedorOitavas5.setText(A2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas5.setText("0");

                        Penaltis2Oitavas5.setText("0");

                        Penaltis1Oitavas5.setEditable(false);

                        Penaltis2Oitavas5.setEditable(false);

                        Gols1Oitavas5.setEditable(true);

                        Gols2Oitavas5.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!D1.getText().equals("1D") && !C2.getText().equals("2C")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas6.getText()) >= 0 && Integer.parseInt(Gols2Oitavas6.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas6.getText()) == Integer.parseInt(Gols2Oitavas6.getText())) {

                                Penaltis1Oitavas6.setEditable(true);

                                Penaltis2Oitavas6.setEditable(true);

                                Gols1Oitavas6.setEditable(false);

                                Gols2Oitavas6.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas6.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas6.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas6.getText()) > Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                        VencedorOitavas6.setText(D1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas6.getText()) < Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                        VencedorOitavas6.setText(C2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas6.getText()) == Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas6.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas6.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas6.setText("0");

                                            Penaltis2Oitavas6.setText("0");

                                            Penaltis1Oitavas6.setEditable(false);

                                            Penaltis2Oitavas6.setEditable(false);

                                            Gols1Oitavas6.setEditable(true);

                                            Gols2Oitavas6.setEditable(true);

                                        }

                                    }

                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas6.getText()) > Integer.parseInt(Gols2Oitavas6.getText())) {

                                VencedorOitavas6.setText(D1.getText());

                            } else {

                                VencedorOitavas6.setText(C2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas6.setText("0");

                        Penaltis2Oitavas6.setText("0");

                        Penaltis1Oitavas6.setEditable(false);

                        Penaltis2Oitavas6.setEditable(false);

                        Gols1Oitavas6.setEditable(true);

                        Gols2Oitavas6.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!F1.getText().equals("1F") && !E2.getText().equals("2E")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas7.getText()) >= 0 && Integer.parseInt(Gols2Oitavas7.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas7.getText()) == Integer.parseInt(Gols2Oitavas7.getText())) {

                                Penaltis1Oitavas7.setEditable(true);

                                Penaltis2Oitavas7.setEditable(true);

                                Gols1Oitavas7.setEditable(false);

                                Gols2Oitavas7.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas7.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas7.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas7.getText()) > Integer.parseInt(Penaltis2Oitavas7.getText())) {

                                        VencedorOitavas7.setText(F1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas7.getText()) < Integer.parseInt(Penaltis2Oitavas7.getText())) {

                                        VencedorOitavas7.setText(E2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas7.getText()) == Integer.parseInt(Penaltis2Oitavas7.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas7.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas7.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas7.setText("0");

                                            Penaltis2Oitavas7.setText("0");

                                            Penaltis1Oitavas7.setEditable(false);

                                            Penaltis2Oitavas7.setEditable(false);

                                            Gols1Oitavas7.setEditable(true);

                                            Gols2Oitavas7.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas7.getText()) > Integer.parseInt(Gols2Oitavas7.getText())) {

                                VencedorOitavas7.setText(F1.getText());

                            } else {

                                VencedorOitavas7.setText(E2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas7.setText("0");

                        Penaltis2Oitavas7.setText("0");

                        Penaltis1Oitavas7.setEditable(false);

                        Penaltis2Oitavas7.setEditable(false);

                        Gols1Oitavas7.setEditable(true);

                        Gols2Oitavas7.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarOitavas8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!H1.getText().equals("1H") && !G2.getText().equals("2G")) {

                    try {

                        if(Integer.parseInt(Gols1Oitavas8.getText()) >= 0 && Integer.parseInt(Gols2Oitavas8.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Oitavas8.getText()) == Integer.parseInt(Gols2Oitavas8.getText())) {

                                Penaltis1Oitavas8.setEditable(true);

                                Penaltis2Oitavas8.setEditable(true);

                                Gols1Oitavas8.setEditable(false);

                                Gols2Oitavas8.setEditable(false);

                                if(Integer.parseInt(Penaltis1Oitavas8.getText()) >= 0 && Integer.parseInt(Penaltis2Oitavas8.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Oitavas8.getText()) > Integer.parseInt(Penaltis2Oitavas8.getText())) {

                                        VencedorOitavas8.setText(H1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas8.getText()) < Integer.parseInt(Penaltis2Oitavas8.getText())) {

                                        VencedorOitavas8.setText(G2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Oitavas8.getText()) == Integer.parseInt(Penaltis2Oitavas8.getText())) {

                                        if(Integer.parseInt(Penaltis1Oitavas8.getText()) == 0 && Integer.parseInt(Penaltis2Oitavas8.getText()) == 0){
                                        }else {

                                            Penaltis1Oitavas8.setText("0");

                                            Penaltis2Oitavas8.setText("0");

                                            Penaltis1Oitavas8.setEditable(false);

                                            Penaltis2Oitavas8.setEditable(false);

                                            Gols1Oitavas8.setEditable(true);

                                            Gols2Oitavas8.setEditable(true);

                                        }
                                    }
                                }

                                else {

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Oitavas8.getText()) > Integer.parseInt(Gols2Oitavas8.getText())) {

                                VencedorOitavas8.setText(H1.getText());

                            } else {

                                VencedorOitavas8.setText(G2.getText());

                            }

                            Escrever();

                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Oitavas8.setText("0");

                        Penaltis2Oitavas8.setText("0");

                        Penaltis1Oitavas8.setEditable(false);

                        Penaltis2Oitavas8.setEditable(false);

                        Gols1Oitavas8.setEditable(true);

                        Gols2Oitavas8.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarQuartas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorOitavas1.getText().equals("A definir") && !VencedorOitavas2.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Quartas1.getText()) >= 0 && Integer.parseInt(Gols2Quartas1.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Quartas1.getText()) == Integer.parseInt(Gols2Quartas1.getText())) {

                                Penaltis1Quartas1.setEditable(true);

                                Penaltis2Quartas1.setEditable(true);

                                Gols1Quartas1.setEditable(false);

                                Gols2Quartas1.setEditable(false);

                                if(Integer.parseInt(Penaltis1Quartas1.getText()) >= 0 && Integer.parseInt(Penaltis2Quartas1.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Quartas1.getText()) > Integer.parseInt(Penaltis2Quartas1.getText())) {

                                        VencedorQuartas1.setText(VencedorOitavas1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas1.getText()) < Integer.parseInt(Penaltis2Quartas1.getText())) {

                                        VencedorQuartas1.setText(VencedorOitavas2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas1.getText()) == Integer.parseInt(Penaltis2Quartas1.getText())) {

                                        if (Integer.parseInt(Penaltis1Quartas1.getText()) == 0 && Integer.parseInt(Penaltis2Quartas1.getText()) == 0) {
                                        } else {

                                            Penaltis1Quartas1.setText("0");

                                            Penaltis2Quartas1.setText("0");

                                            Penaltis1Quartas1.setEditable(false);

                                            Penaltis2Quartas1.setEditable(false);

                                            Gols1Quartas1.setEditable(true);

                                            Gols2Quartas1.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Quartas1.getText()) > Integer.parseInt(Gols2Quartas1.getText())) {

                                VencedorQuartas1.setText(VencedorOitavas1.getText());

                            } else {

                                VencedorQuartas1.setText(VencedorOitavas2.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Quartas1.setText("0");

                        Penaltis2Quartas1.setText("0");

                        Penaltis1Quartas1.setEditable(false);

                        Penaltis2Quartas1.setEditable(false);

                        Gols1Quartas1.setEditable(true);

                        Gols2Quartas1.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarQuartas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorOitavas3.getText().equals("A definir")  && !VencedorOitavas4.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Quartas2.getText()) >= 0 && Integer.parseInt(Gols2Quartas2.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Quartas2.getText()) == Integer.parseInt(Gols2Quartas2.getText())) {

                                Penaltis1Quartas2.setEditable(true);

                                Penaltis2Quartas2.setEditable(true);

                                Gols1Quartas2.setEditable(false);

                                Gols2Quartas2.setEditable(false);

                                if(Integer.parseInt(Penaltis1Quartas2.getText()) >= 0 && Integer.parseInt(Penaltis2Quartas2.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Quartas2.getText()) > Integer.parseInt(Penaltis2Quartas2.getText())) {

                                        VencedorQuartas2.setText(VencedorOitavas3.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas2.getText()) < Integer.parseInt(Penaltis2Quartas2.getText())) {

                                        VencedorQuartas2.setText(VencedorOitavas4.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas2.getText()) == Integer.parseInt(Penaltis2Quartas2.getText())) {

                                        if (Integer.parseInt(Penaltis1Quartas2.getText()) == 0 && Integer.parseInt(Penaltis2Quartas2.getText()) == 0) {
                                        } else {

                                            Penaltis1Quartas2.setText("0");

                                            Penaltis2Quartas2.setText("0");

                                            Penaltis1Quartas2.setEditable(false);

                                            Penaltis2Quartas2.setEditable(false);

                                            Gols1Quartas2.setEditable(true);

                                            Gols2Quartas2.setEditable(true);

                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Quartas2.getText()) > Integer.parseInt(Gols2Quartas2.getText())) {

                                VencedorQuartas2.setText(VencedorOitavas3.getText());

                            } else {

                                VencedorQuartas2.setText(VencedorOitavas4.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Quartas2.setText("0");

                        Penaltis2Quartas2.setText("0");

                        Penaltis1Quartas2.setEditable(false);

                        Penaltis2Quartas2.setEditable(false);

                        Gols1Quartas2.setEditable(true);

                        Gols2Quartas2.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarQuartas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorOitavas5.getText().equals("A definir") && !VencedorOitavas6.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Quartas3.getText()) >= 0 && Integer.parseInt(Gols2Quartas3.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Quartas3.getText()) == Integer.parseInt(Gols2Quartas3.getText())) {

                                Penaltis1Quartas3.setEditable(true);

                                Penaltis2Quartas3.setEditable(true);

                                Gols1Quartas3.setEditable(false);

                                Gols2Quartas3.setEditable(false);

                                if(Integer.parseInt(Penaltis1Quartas3.getText()) >= 0 && Integer.parseInt(Penaltis2Quartas3.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Quartas3.getText()) > Integer.parseInt(Penaltis2Quartas3.getText())) {

                                        VencedorQuartas3.setText(VencedorOitavas5.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas3.getText()) < Integer.parseInt(Penaltis2Quartas3.getText())) {

                                        VencedorQuartas3.setText(VencedorOitavas6.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas3.getText()) == Integer.parseInt(Penaltis2Quartas3.getText())) {

                                        if (Integer.parseInt(Penaltis1Quartas3.getText()) == 0 && Integer.parseInt(Penaltis2Quartas3.getText()) == 0) {
                                        } else {

                                            Penaltis1Quartas3.setText("0");

                                            Penaltis2Quartas3.setText("0");

                                            Penaltis1Quartas3.setEditable(false);

                                            Penaltis2Quartas3.setEditable(false);

                                            Gols1Quartas3.setEditable(true);

                                            Gols2Quartas3.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Quartas3.getText()) > Integer.parseInt(Gols2Quartas3.getText())) {

                                VencedorQuartas3.setText(VencedorOitavas5.getText());

                            } else {

                                VencedorQuartas3.setText(VencedorOitavas6.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Quartas3.setText("0");

                        Penaltis2Quartas3.setText("0");

                        Penaltis1Quartas3.setEditable(false);

                        Penaltis2Quartas3.setEditable(false);

                        Gols1Quartas3.setEditable(true);

                        Gols2Quartas3.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarQuartas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorOitavas7.getText().equals("A definir") && !VencedorOitavas8.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Quartas4.getText()) >= 0 && Integer.parseInt(Gols2Quartas4.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Quartas4.getText()) == Integer.parseInt(Gols2Quartas4.getText())) {

                                Penaltis1Quartas4.setEditable(true);

                                Penaltis2Quartas4.setEditable(true);

                                Gols1Quartas4.setEditable(false);

                                Gols2Quartas4.setEditable(false);

                                if(Integer.parseInt(Penaltis1Quartas4.getText()) >= 0 && Integer.parseInt(Penaltis2Quartas4.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Quartas4.getText()) > Integer.parseInt(Penaltis2Quartas4.getText())) {

                                        VencedorQuartas4.setText(VencedorOitavas7.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas4.getText()) < Integer.parseInt(Penaltis2Quartas4.getText())) {

                                        VencedorQuartas4.setText(VencedorOitavas8.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Quartas4.getText()) == Integer.parseInt(Penaltis2Quartas4.getText())) {

                                        if (Integer.parseInt(Penaltis1Quartas4.getText()) == 0 && Integer.parseInt(Penaltis2Quartas4.getText()) == 0) {
                                        } else {

                                            Penaltis1Quartas4.setText("0");

                                            Penaltis2Quartas4.setText("0");

                                            Penaltis1Quartas4.setEditable(false);

                                            Penaltis2Quartas4.setEditable(false);

                                            Gols1Quartas4.setEditable(true);

                                            Gols2Quartas4.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Quartas4.getText()) > Integer.parseInt(Gols2Quartas4.getText())) {

                                VencedorQuartas4.setText(VencedorOitavas7.getText());

                            } else {

                                VencedorQuartas4.setText(VencedorOitavas8.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Quartas4.setText("0");

                        Penaltis2Quartas4.setText("0");

                        Penaltis1Quartas4.setEditable(false);

                        Penaltis2Quartas4.setEditable(false);

                        Gols1Quartas4.setEditable(true);

                        Gols2Quartas4.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarSemi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorQuartas1.getText().equals("A definir") && !VencedorQuartas2.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Semi1.getText()) >= 0 && Integer.parseInt(Gols2Semi1.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Semi1.getText()) == Integer.parseInt(Gols2Semi1.getText())) {

                                Penaltis1Semi1.setEditable(true);

                                Penaltis2Semi1.setEditable(true);

                                Gols1Semi1.setEditable(false);

                                Gols2Semi1.setEditable(false);

                                if(Integer.parseInt(Penaltis1Semi1.getText()) >= 0 && Integer.parseInt(Penaltis2Semi1.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Semi1.getText()) > Integer.parseInt(Penaltis2Semi1.getText())) {

                                        VencedorSemi1.setText(VencedorQuartas1.getText());

                                        PerderdorSemi1.setText(VencedorQuartas2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Semi1.getText()) < Integer.parseInt(Penaltis2Semi1.getText())) {

                                        VencedorSemi1.setText(VencedorQuartas2.getText());

                                        PerderdorSemi1.setText(VencedorQuartas1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Semi1.getText()) == Integer.parseInt(Penaltis2Semi1.getText())) {

                                        if (Integer.parseInt(Penaltis1Semi1.getText()) == 0 && Integer.parseInt(Penaltis2Semi1.getText()) == 0) {
                                        } else {

                                            Penaltis1Semi1.setText("0");

                                            Penaltis2Semi1.setText("0");

                                            Penaltis1Semi1.setEditable(false);

                                            Penaltis2Semi1.setEditable(false);

                                            Gols1Semi1.setEditable(true);

                                            Gols2Semi1.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Semi1.getText()) > Integer.parseInt(Gols2Semi1.getText())) {

                                VencedorSemi1.setText(VencedorQuartas1.getText());

                                PerderdorSemi1.setText(VencedorQuartas2.getText());

                            } else {

                                VencedorSemi1.setText(VencedorQuartas2.getText());

                                PerderdorSemi1.setText(VencedorQuartas1.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Semi1.setText("0");

                        Penaltis2Semi1.setText("0");

                        Penaltis1Semi1.setEditable(false);

                        Penaltis2Semi1.setEditable(false);

                        Gols1Semi1.setEditable(true);

                        Gols2Semi1.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarSemi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorQuartas3.getText().equals("A definir") && !VencedorQuartas4.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Semi2.getText()) >= 0 && Integer.parseInt(Gols2Semi2.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Semi2.getText()) == Integer.parseInt(Gols2Semi2.getText())) {

                                Penaltis1Semi2.setEditable(true);

                                Penaltis2Semi2.setEditable(true);

                                Gols1Semi2.setEditable(false);

                                Gols2Semi2.setEditable(false);

                                if(Integer.parseInt(Penaltis1Semi2.getText()) >= 0 && Integer.parseInt(Penaltis2Semi2.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Semi2.getText()) > Integer.parseInt(Penaltis2Semi2.getText())) {

                                        VencedorSemi2.setText(VencedorQuartas3.getText());

                                        PerderdorSemi2.setText(VencedorQuartas4.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Semi2.getText()) < Integer.parseInt(Penaltis2Semi2.getText())) {

                                        VencedorSemi2.setText(VencedorQuartas4.getText());

                                        PerderdorSemi2.setText(VencedorQuartas3.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Semi2.getText()) == Integer.parseInt(Penaltis2Semi2.getText())) {

                                        if (Integer.parseInt(Penaltis1Semi2.getText()) == 0 && Integer.parseInt(Penaltis2Semi2.getText()) == 0) {
                                        } else {

                                            Penaltis1Semi2.setText("0");

                                            Penaltis2Semi2.setText("0");

                                            Penaltis1Semi2.setEditable(false);

                                            Penaltis2Semi2.setEditable(false);

                                            Gols1Semi2.setEditable(true);

                                            Gols2Semi2.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Semi2.getText()) > Integer.parseInt(Gols2Semi2.getText())) {

                                VencedorSemi2.setText(VencedorQuartas3.getText());

                                PerderdorSemi2.setText(VencedorQuartas4.getText());

                            } else {

                                VencedorSemi2.setText(VencedorQuartas4.getText());

                                PerderdorSemi2.setText(VencedorQuartas3.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Semi2.setText("0");

                        Penaltis2Semi2.setText("0");

                        Penaltis1Semi2.setEditable(false);

                        Penaltis2Semi2.setEditable(false);

                        Gols1Semi2.setEditable(true);

                        Gols2Semi2.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });

        enviarFinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!VencedorSemi1.getText().equals("A definir") && !VencedorSemi2.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Final.getText()) >= 0 && Integer.parseInt(Gols2Final.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Final.getText()) == Integer.parseInt(Gols2Final.getText())) {

                                Penaltis1Final.setEditable(true);

                                Penaltis2Final.setEditable(true);

                                Gols1Final.setEditable(false);

                                Gols2Final.setEditable(false);

                                if(Integer.parseInt(Penaltis1Final.getText()) >= 0 && Integer.parseInt(Penaltis2Final.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Final.getText()) > Integer.parseInt(Penaltis2Final.getText())) {

                                        VencedorFinal.setText(VencedorSemi1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Final.getText()) < Integer.parseInt(Penaltis2Final.getText())) {

                                        VencedorFinal.setText(VencedorSemi2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Final.getText()) == Integer.parseInt(Penaltis2Final.getText())) {

                                        if (Integer.parseInt(Penaltis1Final.getText()) == 0 && Integer.parseInt(Penaltis2Final.getText()) == 0) {
                                        } else {

                                            Penaltis1Final.setText("0");

                                            Penaltis2Final.setText("0");

                                            Penaltis1Final.setEditable(false);

                                            Penaltis2Final.setEditable(false);

                                            Gols1Final.setEditable(true);

                                            Gols2Final.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Final.getText()) > Integer.parseInt(Gols2Final.getText())) {

                                VencedorFinal.setText(VencedorSemi1.getText());

                            } else {

                                VencedorFinal.setText(VencedorSemi2.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Final.setText("0");

                        Penaltis2Final.setText("0");

                        Penaltis1Final.setEditable(false);

                        Penaltis2Final.setEditable(false);

                        Gols1Final.setEditable(true);

                        Gols2Final.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });
        enviarTerceira.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!PerderdorSemi1.getText().equals("A definir") && !PerderdorSemi2.getText().equals("A definir")) {

                    try {

                        if(Integer.parseInt(Gols1Terceiro.getText()) >= 0 && Integer.parseInt(Gols2Terceiro.getText()) >= 0) {

                            if (Integer.parseInt(Gols1Terceiro.getText()) == Integer.parseInt(Gols2Terceiro.getText())) {

                                Penaltis1Terceiro.setEditable(true);

                                Penaltis2Terceiro.setEditable(true);

                                Gols1Terceiro.setEditable(false);

                                Gols2Terceiro.setEditable(false);

                                if(Integer.parseInt(Penaltis1Terceiro.getText()) >= 0 && Integer.parseInt(Penaltis2Terceiro.getText()) >= 0) {

                                    if (Integer.parseInt(Penaltis1Terceiro.getText()) > Integer.parseInt(Penaltis2Terceiro.getText())) {

                                        VencedorTerceiro.setText(PerderdorSemi1.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Terceiro.getText()) < Integer.parseInt(Penaltis2Terceiro.getText())) {

                                        VencedorTerceiro.setText(PerderdorSemi2.getText());

                                    }

                                    if (Integer.parseInt(Penaltis1Terceiro.getText()) == Integer.parseInt(Penaltis2Terceiro.getText())) {

                                        if (Integer.parseInt(Penaltis1Terceiro.getText()) == 0 && Integer.parseInt(Penaltis2Terceiro.getText()) == 0) {
                                        } else {

                                            Penaltis1Terceiro.setText("0");

                                            Penaltis2Terceiro.setText("0");

                                            Penaltis1Terceiro.setEditable(false);

                                            Penaltis2Terceiro.setEditable(false);

                                            Gols1Terceiro.setEditable(true);

                                            Gols2Terceiro.setEditable(true);
                                        }

                                    }
                                }

                                else{

                                    throw new InputMismatchException();

                                }

                            } else if (Integer.parseInt(Gols1Terceiro.getText()) > Integer.parseInt(Gols2Terceiro.getText())) {

                                VencedorTerceiro.setText(PerderdorSemi1.getText());

                            } else {

                                VencedorTerceiro.setText(PerderdorSemi2.getText());

                            }

                            Escrever();
                        }

                        else{

                            throw new InputMismatchException();

                        }

                    }

                    catch (NumberFormatException exception){

                        Penaltis1Terceiro.setText("0");

                        Penaltis2Terceiro.setText("0");

                        Penaltis1Terceiro.setEditable(false);

                        Penaltis2Terceiro.setEditable(false);

                        Gols1Terceiro.setEditable(true);

                        Gols2Terceiro.setEditable(true);

                    }

                    catch (InputMismatchException exception){

                        JOptionPane.showMessageDialog(null, "Insira apenas números positivos!", "Error", 0);

                    }

                }

            }
        });
        Reset1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });
        Reset9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reset();

                try {
                    Ler();
                } catch (FileNotFoundException exception) {
                    throw new RuntimeException(exception);
                }

            }
        });

        /*
        enviarBotaoGrupoA.doClick();

        enviarBotaoGrupoB.doClick();

        enviarBotaoGrupoC.doClick();

        enviarBotaoGupoD.doClick();

        enviarBotaoGrupoE.doClick();

        enviarBotaoGupoF.doClick();

        enviarBotaoGrupoG.doClick();

        enviarBotaoGrupoH.doClick();
        */

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabela");

        frame.setContentPane(new Tabela().TabbedPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1920, 1080);

        frame.setVisible(true);

    }

}
