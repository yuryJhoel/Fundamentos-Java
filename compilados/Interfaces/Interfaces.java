import javax.swing.*;
public class Interfaces extends JFrame {
    private JLabel label1;

    public Interfaces(){
        setLayout(null);
        label1 =  new JLabel("la Casa de Yury");
        label1.setBounds(100, 10, 100, 1000);
        add(label1);
    }

    public static void main(String args[]) {
        Interfaces formulario1 = new Interfaces();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }

}