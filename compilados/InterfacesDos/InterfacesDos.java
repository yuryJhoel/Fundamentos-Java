import javax.swing.*;
public class InterfacesDos extends JFrame {
  public InterfacesDos(){
    setLayout(null);
  }
  public static void main(String args[]){
    InterfacesDos interfacesDos = new InterfacesDos();
    interfacesDos.setBounds(0,0,400,550);
    interfacesDos.setVisible(true);
    interfacesDos.setLocationRelativeTo(null);
    interfacesDos.setResizable(false);
  }
}