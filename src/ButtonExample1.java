import javax.swing.*;
public class ButtonExample1{    
ButtonExample1(){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("C:\\Users\\Yogen\\Pictures\\WallPaper\\Abstract-Wallpaper-Hd-Full-HD-21.jpg"));
b.setBounds(100,100,100, 40);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new ButtonExample1();    
}    
}  