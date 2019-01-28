import javax.swing.*;

public class ScrollTextarea extends JFrame {
    private JTextField textfield1;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;

    public ScrollTextarea(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10, 10, 200, 30);
        add(textfield1);

        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 50, 400, 300);
        add(scrollpane1);
    }

    public static void main(String args[]) {
        ScrollTextarea scrolltextarea1 = new ScrollTextarea();
        scrolltextarea1.setBounds(0,0, 540,400);
        scrolltextarea1.setVisible(true);
        scrolltextarea1.setResizable(false);
        scrolltextarea1.setLocationRelativeTo(null);
    }
}