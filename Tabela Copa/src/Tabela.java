import javax.swing.*;

public class Tabela {
    private JTabbedPane TabbedPanel;
    private JPanel GrupoA;
    private JPanel GrupoB;
    private JPanel GrupoC;
    private JPanel GrupoD;
    private JPanel GrupoE;
    private JPanel GrupoF;
    private JPanel GrupoG;
    private JPanel GrupoH;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabela");

        frame.setContentPane(new Tabela().TabbedPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

}
