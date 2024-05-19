package Text;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class texto extends JFrame {
    public JPanel panel;
    public texto(){
        
        this.setSize(500, 500);
        setTitle("Lenguajes");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarCajasDeTexto();
    }

    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarCajasDeTexto(){
        JTextField cajaTexto = new JTextField("Escribe tu E-Mail");
        cajaTexto.setBounds(50, 50, 200, 30);
        cajaTexto.setFont(new Font("arial",Font.PLAIN, 12));
        cajaTexto.setForeground(Color.GRAY);

        JTextField cajaTexto2 = new JTextField("First name please");
        cajaTexto2.setBounds(50, 100, 350, 50);
        cajaTexto2.setFont(new Font("arial",1, 20));
        cajaTexto2.setForeground(Color.GREEN);

        panel.add(cajaTexto);
        panel.add(cajaTexto2);
    }

}
