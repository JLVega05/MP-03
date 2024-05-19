package TwoButtons;

import javax.swing.*;
import java.awt.*;


public class Botones extends JFrame {
    public Botones() {
        this.setSize(500, 500);
        setTitle("El mejor título");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana();
    }

    private void ventana() {
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);

       
        JButton b1 = new JButton("Click");
        b1.setBounds(90, 120, 100, 30);
        b1.setForeground(Color.BLUE);
        b1.setFont(new Font("cooper black", 3, 20));
        b1.setEnabled(true);
        panel.add(b1);

        
        JButton b2 = new JButton();
        b2.setBounds(90, 200, 100, 30);

     
        ImageIcon foto = new ImageIcon("C:\\Users\\jairo\\OneDrive\\Clase\\MP-03\\UF5\\TwoButtons\\boton2.png");
        b2.setIcon(new ImageIcon(foto.getImage().getScaledInstance(b2.getWidth(), b2.getHeight(), Image.SCALE_SMOOTH)));
        b2.setEnabled(true);
        panel.add(b2);
    }
}
