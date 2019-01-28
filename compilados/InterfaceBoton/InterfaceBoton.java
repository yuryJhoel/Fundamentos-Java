import javax.swing.*;
import java.awt.event.*; 

public class InterfaceBoton extends JFrame implements ActionListener {
    JButton boton1;
    
    public InterfaceBoton(){
        setLayout(null);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent myevent){
        if( myevent.getSource() == boton1 ) {
            System.exit(0);
        }
    }//Esto es para que pueda capturar el evento

    public static void main(String args[]) {
        InterfaceBoton interfaceBoton1 = new InterfaceBoton();
        interfaceBoton1.setBounds(0,0,450,350);
        interfaceBoton1.setVisible(true);
        interfaceBoton1.setResizable(false);
        interfaceBoton1.setLocationRelativeTo(null);
    }

}