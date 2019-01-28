import javax.swing.*;
import java.awt.event.*;

public class ComboBox extends JFrame implements ItemListener {
    private JComboBox combo1;
    public ComboBox(){
        setLayout(null);
        combo1 = new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);

        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == combo1){
            String seleccion = combo1.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }
    public static void main(String args[]) {
        ComboBox comboBox1 = new ComboBox();
        comboBox1.setBounds(0,0,200,150);
        comboBox1.setVisible(true);
        comboBox1.setResizable(true);
        comboBox1.setLocationRelativeTo(null);
    }
}