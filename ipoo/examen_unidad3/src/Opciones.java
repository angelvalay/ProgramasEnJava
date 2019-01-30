import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opciones extends JFrame {
    private Rectangulo rectangulo;

    public Opciones(Rectangulo rectangulo){
        this.rectangulo = rectangulo;
        setTitle(this.rectangulo.getNombre());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iniciarComponentes();
        setSize(410,140);
        setLocationRelativeTo(null);
    }
    private void iniciarComponentes(){
        setLayout(null);
        JButton btnImprimir = new JButton("Imprimir");
        JButton btnColor = new JButton("Cambiar color");
        JButton btnDesplazar = new JButton("Desplazar");
        JButton btnTalla = new JButton("Escalar");
        JButton btnArea = new JButton("Area");
        JButton btnPerimetro = new JButton("Perimetro");
        btnImprimir.setBounds(10,10,100,30);
        btnColor.setBounds(120,10,150,30);
        btnDesplazar.setBounds(280,10,100,30);
        btnTalla.setBounds(10,50,100,30);
        btnArea.setBounds(120,50,150,30);
        btnPerimetro.setBounds(280,50,100,30);
        btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rectangulo.imprimir();
            }
        });
        btnColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] colores = {"Rojo", "Azul", "Negro", "Amarillo", "Verde", "Gris"};
                int selColor = JOptionPane.showOptionDialog(null,
                        "Escoge un color", rectangulo.getNombre(),
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, colores, colores[0]);
                switch (selColor){
                    case 0:
                        rectangulo.setColor(Color.RED);
                        break;
                    case 1:
                        rectangulo.setColor(Color.BLUE);
                        break;
                    case 2:
                        rectangulo.setColor(Color.BLACK);
                        break;
                    case 3:
                        rectangulo.setColor(Color.YELLOW);
                        break;
                    case 4:
                        rectangulo.setColor(Color.GREEN);
                        break;
                    case 5:
                        rectangulo.setColor(Color.GRAY);
                        break;
                }
            }
        });
        btnDesplazar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int posX = Integer.parseInt(JOptionPane.showInputDialog("Desplazamiento e X:"));
                int posY = Integer.parseInt(JOptionPane.showInputDialog("Desplazamiento e Y:"));
                rectangulo.desplazarFigura(posX,posY);
            }
        });
        btnTalla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double escalar = Double.parseDouble(JOptionPane.showInputDialog("Escalar a:"));
                rectangulo.modificarTalla(escalar);
            }
        });
        btnArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Area: " + rectangulo.obtenerArea(),rectangulo.getNombre(),JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnPerimetro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Perimetro: " + rectangulo.obtenerPerimetro(),rectangulo.getNombre(),JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(btnImprimir);
        add(btnColor);
        add(btnDesplazar);
        add(btnTalla);
        add(btnArea);
        add(btnPerimetro);
    }
}
