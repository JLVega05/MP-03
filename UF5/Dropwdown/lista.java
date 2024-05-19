
import javax.swing.*;

public class lista extends JFrame {
    public JPanel panel;
    public void lista (){
        
        this.setSize(500, 500);
        setTitle("Lenguajes");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarLabels();
        colocarBotones();
        colocarListasDesplegables();
    }

    private void colocarBotones(){
        JButton b1 = new JButton("Show");
        b1.setBounds(150, 50, 80, 20);
        panel.add(b1);
    }

    private void colocarLabels(){
        JLabel titulo = new JLabel("Programming language Selected: ");
        titulo.setBounds(50, 20, 200, 50);;
        panel.add(titulo);
    }
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarListasDesplegables(){
        String[] lenguajes = {"C","C++","C#","Java","PHP"};
        JComboBox listaDesplegable = new JComboBox<>(lenguajes);
        listaDesplegable.setBounds(50, 40, 80, 20); 
    }
}
