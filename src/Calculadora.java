import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculadora {
    public JPanel panelMain;
    private JTextField num1Txt;
    private JTextField num2Txt;
    private JButton sumaBtn;
    private JButton restaBtn;
    private JButton multBtn;
    private JButton divBtn;
    private JButton raizBtn;
    private JButton potenciaBtn;
    private JButton senoBtn;
    private JButton cosenoBtn;
    private JButton tangenteBtn;


    public Calculadora() {
        sumaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int suma = conversionInt1() + conversionInt2();

                JOptionPane.showMessageDialog(null, "La suma es de "+suma,"Suma", JOptionPane.PLAIN_MESSAGE);
            }
        });
        restaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta =  conversionInt1() - conversionInt2();

                JOptionPane.showMessageDialog(null, "La resta es de "+resta,"Resta", JOptionPane.PLAIN_MESSAGE);
            }
        });
        multBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplicacion = conversionInt1() * conversionInt2();

                JOptionPane.showMessageDialog(null, "La multiplicacion es de "+multiplicacion,"Multiplicacion", JOptionPane.PLAIN_MESSAGE);
            }
        });
        divBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.##");

                double division = (double) conversionInt1() / conversionInt2();

                JOptionPane.showMessageDialog(null, "La division es de "+df.format(division),"Division", JOptionPane.PLAIN_MESSAGE);
            }
        });
        raizBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.##");

                double raiz =  Math.sqrt(conversionDialog());
                JOptionPane.showMessageDialog(null, "La Rais cuadrada es de "+df.format(raiz),"Raiz cuadrada", JOptionPane.PLAIN_MESSAGE);
            }
        });
        potenciaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.##");
                String pot = JOptionPane.showInputDialog("A que potencia quiere elevar el numero ? ");
                int valor = Integer.parseInt(pot);
                double potencia = Math.pow(conversionDialog(),valor);

                JOptionPane.showMessageDialog(null, "La Potencia es de "+df.format(potencia),"Potencia", JOptionPane.PLAIN_MESSAGE);
            }
        });
        senoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.##");
                double seno = Math.sin(conversionDialog());

                JOptionPane.showMessageDialog(null, "El seno es de "+df.format(seno),"Seno", JOptionPane.PLAIN_MESSAGE);
            }
        });
        cosenoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.##");
                double coseno = Math.cos(conversionDialog());

                JOptionPane.showMessageDialog(null, "El coseno es de "+df.format(coseno),"Coseno", JOptionPane.PLAIN_MESSAGE);
            }
        });
        tangenteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("#.##");
                double tangente = Math.tan(conversionDialog());

                JOptionPane.showMessageDialog(null, "La tangente es de "+df.format(tangente),"Tangente", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

    public int conversionInt1(){
        String num1 = num1Txt.getText();
        int numero1 = Integer.parseInt(num1);

        return  numero1;
    }

    public int conversionInt2(){
        String num2 = num2Txt.getText();
        int numero2 = Integer.parseInt(num2);

        return  numero2;
    }

    public double conversionDialog(){
        String num =  JOptionPane.showInputDialog("Ingrese un numero ");
        double numero = Double.parseDouble(num);
        return numero;
    }


}
