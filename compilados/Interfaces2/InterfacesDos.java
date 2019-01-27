import javax.swing.*;
public class InterfacesDos extends JFrame {

  public InterfacesDos(){
    setLayout(null);    
  }
  public static void main(String args[]){
    InterfacesDos interfaces1 = new InterfacesDos();
    interfaces1.setBounds(0,0,400, 500);
    interfaces1.setVisible(true);
    interfaces1.setLocationRelativeTo(null);
    interfaces1.setResizable(false);
  }
}