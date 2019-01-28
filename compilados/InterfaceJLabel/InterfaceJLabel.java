import javax.swing.*;
public class InterfaceJLabel extends JFrame{
    
    private JLabel label1; 
    private JLabel label2;

    public InterfaceJLabel(){
        setLayout(null);
        label1 = new JLabel("Interfaz Gráfica");
        label1.setBounds(10, 20, 300, 30);
        add(label1);

        label2 = new JLabel("Version 1.0.0");
        label2.setBounds(10, 100, 100,30);
        add(label2);
    }

    public static void main(String args[]) {
        InterfaceJLabel interface1 = new InterfaceJLabel();

        interface1.setBounds(0,0,300,200);
        interface1.setResizable(false);
        interface1.setVisible(true);
        interface1.setLocationRelativeTo(null);

    }

}