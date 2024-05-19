package Dropdown;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lista extends JFrame {
    public JPanel panel;
    private JLabel titulo;
    private JComboBox<String> listaDesplegable;
    private JButton b1;
    public lista() {
        this.setSize(400, 300);
        setTitle("ComboBox Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarLabels();
        colocarBotones();
        colocarListasDesplegables();
    }

    private void colocarBotones() {
        b1 = new JButton("Show");
        b1.setBounds(250, 80, 80, 20);
        panel.add(b1);

        oyenteAccion();
    }

    private void colocarLabels() {
        titulo = new JLabel("Programming language Selected: ");
        titulo.setBounds(50, 20, 300, 50);
        panel.add(titulo);
    }

    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarListasDesplegables() {
        String[] lenguajes = {"C", "C++", "C#", "Java", "PHP"};
        listaDesplegable = new JComboBox<>(lenguajes);
        listaDesplegable.setBounds(50, 80, 100, 20);
        panel.add(listaDesplegable);
    }

    private void oyenteAccion() {
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lenguajeSeleccionado = (String) listaDesplegable.getSelectedItem();
                titulo.setText("Programming language Selected: " + lenguajeSeleccionado);
            }
        };

        b1.addActionListener(oyenteAccion);
    }
}