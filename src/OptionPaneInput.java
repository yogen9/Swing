import javax.swing.*;  
public class OptionPaneInput {  
JFrame f;  
OptionPaneInput(){  
    f=new JFrame();   
    String name=JOptionPane.showInputDialog(f,"Enter Name"); 

	System.out.println(name);     
}  
public static void main(String[] args) {  
    new OptionPaneInput();  
}  
}  