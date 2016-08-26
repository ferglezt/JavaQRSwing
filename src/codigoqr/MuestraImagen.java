package codigoqr;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MuestraImagen extends JFrame{
    public MuestraImagen(String arg){
        if (arg == null ) {
            arg = "C:\\Users\\dell\\Desktop\\prueba.png";
        }      
        JPanel panel = new JPanel(); 
        panel.setSize(500,640);
        panel.setBackground(Color.WHITE); 
        ImageIcon icon = new ImageIcon(arg); 
        JLabel label = new JLabel(); 
        label.setIcon(icon); 
        panel.add(label);
        this.getContentPane().add(panel); 
        this.setBounds(1,1,600,600);
        this.setLocationRelativeTo(null);
        this.setTitle("C:\\Users\\dell\\Desktop\\prueba.png");
        this.setVisible(true);
        
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        GeneraQR.controlMuestraImagen = false;
    }   
}
