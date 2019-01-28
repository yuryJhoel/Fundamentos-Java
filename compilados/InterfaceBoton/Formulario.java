import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
    private JButton boton1, boton2, boton3;
    private JLabel label1;

    public Formulario(){
        setLayout(null);
        boton1 = new JButton("1");
        boton2 = new JButton("2");
        boton3 = new JButton("3");
        boton1.setBounds(10, 200, 100, 30);
        boton2.setBounds(120, 200, 100, 30);
        boton3.setBounds(230, 200, 100, 30);
        add(boton1);
        add(boton2);
        add(boton3);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    // LABELS
        label1 = new JLabel("En espera ...");
        label1.setBounds(10,10,300,30);
        add(label1);
    }


    public void actionPerformed(ActionEvent myevent){
        if( myevent.getSource() == boton1 ){
            label1.setText("Haz presionado el boton 1");
        }else if(myevent.getSource() == boton2){
            label1.setText("Haz presionado el boton 2");
        }else if(myevent.getSource() == boton3) {
            label1.setText("Haz presionado el boton 3");
        }else{
            System.out.println("Rompiste mi programa");
        }
    }

    public static void main(String args[]) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,500,500);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

}