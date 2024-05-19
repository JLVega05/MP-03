package RadioButton;

import javax.swing.*;

public class botonradio extends JFrame {
    public JPanel panel;
    public botonradio(){
        
        this.setSize(300, 300);
        setTitle("Lenguajes");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarLabels();
        colocarBotones();
        colocarRadioBotones();
    }

    private void colocarBotones(){
        JButton b1 = new JButton("Validar");
        b1.setBounds(50, 150, 80, 20);
        panel.add(b1);
    }

    private void colocarLabels(){
        JLabel titulo = new JLabel("Lenguajes:");
        titulo.setBounds(50, 20, 200, 30);;
        panel.add(titulo);
    }
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarRadioBotones() {    
        JRadioButton radioBoton1 = new JRadioButton("Java", false);
        radioBoton1.setBounds (50, 50, 100, 30);
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Php", false);
        radioBoton2.setBounds (50, 80, 100, 30);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("C++", false);
        radioBoton3.setBounds (50, 110, 100, 30);
        panel.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
}
