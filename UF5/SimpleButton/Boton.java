package SimpleButton;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Boton extends JFrame {
    public Boton(){
        this.setSize(500, 500);
        setTitle("Button Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        ventana();
    }

    private void ventana() {
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        setLocationRelativeTo(null);

        JButton b1 = new JButton("Click");
        b1.setBounds(180, 120, 100, 30);
        b1.setEnabled(true);
        panel.add(b1);
    }
}