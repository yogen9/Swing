import java.awt.event.*;
import javax.swing.*;    
public class ButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setMnemonic(KeyEvent.VK_C);
    b.setBounds(50,100,95,30);  
    b.addActionListener( (e)-> tf.setText("Welcome to BVM"));
    f.add(b);f.add(tf);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
} 