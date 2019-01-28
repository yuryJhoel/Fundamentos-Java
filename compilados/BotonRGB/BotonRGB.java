import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonRGB extends JFrame implements ActionListener {

    private JButton boton1;
    private JComboBox combo1, combo2, combo3;
    private JLabel label1, label2, label3;

    public BotonRGB(){
        setLayout(null);
        label1 = new JLabel("Rojo");
        label1.setBounds(10,10,35,10);
        add(label1);

        label2 = new JLabel("Green");
        label2.setBounds(10,30,50,10);
        add(label2);

        label3 = new JLabel("Blue");
        label3.setBounds(10,50,35,10);
        add(label3);

        combo1 = new JComboBox();
        combo1.setBounds(60,10,150,25);
        add(combo1);
        
        combo2 = new JComboBox();
        combo2.setBounds(60,30,150,25);
        add(combo2);

        combo3 = new JComboBox();
        combo3.setBounds(60,50,150,25);
        add(combo3);

        for(int i = 0; i<=255; i++){
            combo1.addItem(String.valueOf(i));
            combo2.addItem(String.valueOf(i));
            combo3.addItem(String.valueOf(i));
        }

        boton1 = new JButton("Fijar Color");
        boton1.setBounds(10,100,70,25);
        add(boton1);
        boton1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            String cad1 = combo1.getSelectedItem().toString();         
            String cad2 = combo2.getSelectedItem().toString();  
            String cad3 = combo3.getSelectedItem().toString();  

            int red = Integer.parseInt(cad1);
            int green = Integer.parseInt(cad2);
            int blue = Integer.parseInt(cad3);

            Color color1 = new Color(red, green, blue);
            boton1.setBackground(color1);
        }
    }
    public static void main(String args[]) {
        BotonRGB botonrgb1 = new BotonRGB();
        botonrgb1.setBounds(0,0,450,350);
        botonrgb1.setResizable(false);
        botonrgb1.setVisible(true);
        botonrgb1.setLocationRelativeTo(null);
    }
}