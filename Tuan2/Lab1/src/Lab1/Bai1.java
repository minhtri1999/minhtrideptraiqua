/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;


/**
 *
 * @author MinhTriLaAnh
 */
public class MinhTri extends JFrame{
    public MinhTri(){
        super("Demon Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String[] args) {
        MinhTri ui=new MinhTri();
        ui.setSize(WIDTH, HEIGHT);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
        
      
        
        
        
        
    
    

