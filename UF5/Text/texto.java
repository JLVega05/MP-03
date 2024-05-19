package Text;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class texto extends JFrame {
    public JPanel panel;
    private JTextField cajaTexto;
    private JTextField cajaTexto2;

    public texto(){
        this.setSize(500, 300);
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
        cajaTexto = new JTextField("Escribe tu E-Mail");
        cajaTexto.setBounds(50, 50, 200, 30);
        cajaTexto.setFont(new Font("Arial", Font.PLAIN, 12));
        cajaTexto.setForeground(Color.GRAY);

        cajaTexto2 = new JTextField("First name please");
        cajaTexto2.setBounds(50, 100, 350, 50);
        cajaTexto2.setFont(new Font("Arial", Font.BOLD, 20));
        cajaTexto2.setForeground(Color.GREEN);

        panel.add(cajaTexto);
        panel.add(cajaTexto2);

        eventosTeclado();
    }

    private void eventosTeclado() {
        KeyListener listener1 = new KeyListener() {
            private boolean placeholderVisible = true;

            @Override
            public void keyTyped(KeyEvent e) {
                if (placeholderVisible ) {
                    cajaTexto.setText("");
                    cajaTexto.setForeground(Color.BLACK);
                    placeholderVisible = false;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                if (cajaTexto.getText().isEmpty()) {
                    cajaTexto.setText("Escribe tu E-Mail");
                    cajaTexto.setForeground(Color.GRAY);
                    placeholderVisible = true;
                }
            }
        };

        KeyListener listener2 = new KeyListener() {
            private boolean placeholderVisible = true;

            @Override
            public void keyTyped(KeyEvent e) {
                if (placeholderVisible) {
                    cajaTexto2.setText("");
                    cajaTexto2.setForeground(Color.BLACK);
                    placeholderVisible = false;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // No implementar
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (cajaTexto2.getText().isEmpty()) {
                    cajaTexto2.setText("First name please");
                    cajaTexto2.setForeground(Color.GREEN);
                    placeholderVisible = true;
                }
            }
        };
        cajaTexto.addKeyListener(listener1);
        cajaTexto2.addKeyListener(listener2);
    }
}
