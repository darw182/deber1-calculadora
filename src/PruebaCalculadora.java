import javax.swing.*;

public class PruebaCalculadora {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
