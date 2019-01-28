import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
    private JTextField textfield1;
    private JLabel label1;
    private JButton boton1, boton2;

    public Formulario(){
        setLayout(null);

        label1 = new JLabel("Usuario: ");
        label1.setBounds(10,10,100,30);
        add(label1);

        textfield1 = new JTextField();
        textfield1.setBounds(120,17,150,20);
        add(textfield1);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Cerrar");
        boton2.setBounds(120,80,100,30);
        add(boton2);
        boton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1 ){
            String texto = textfield1.getText();
            setTitle(texto);
        }
        if(e.getSource() == boton2) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 300, 150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

}