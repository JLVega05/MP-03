package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
    public Ventana(){
        this.setSize(600,600); //Establecemos el tamaño de la ventana
        //setLocation(200,200); //Establecemos la posición inicial de la ventana
        
        setTitle("Hola Caracola"); //Establecemos el titulo de la ventana
        //setBounds(300, 300, 500, 500); //Establecemos tamaño y posición inicial
        setLocationRelativeTo(null); //establecemos la ventana en el centro

        setMinimumSize(new Dimension(400,400)); //Tamaño minimo de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciarComponentes();
        //this.getContentPane().setBackground(Color.BLUE); //Se cambia el color de fondo
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel();

        panel.setLayout(null);
        //panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);

        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta = new JLabel("Hola"); //Creamos etiqueta
        //etiqueta.setOpaque(true);// Que sea opaca
        etiqueta.setBounds(10, 10, 30, 20); //Posicion y tamaño
        //etiqueta.setBackground(Color.BLUE);// Color del fondo
        etiqueta.setForeground(Color.WHITE); // Color de la letra
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);// Posición de la etiqueta
        etiqueta.setFont(new Font("arial",Font.ITALIC , 12 )); //Fuente del texto
        panel.add(etiqueta);

        //Etiqueta 2 - etiqueta tipo imagen
        JLabel etiqueta2 = new JLabel(new ImageIcon("C:\\Users\\jairo\\OneDrive\\Clase\\MP-03\\UF5\\ventana\\HolaCaracola.jpg"));
        etiqueta2.setBounds(10, 10, 500, 550);
        panel.add(etiqueta2);
        
    }
}