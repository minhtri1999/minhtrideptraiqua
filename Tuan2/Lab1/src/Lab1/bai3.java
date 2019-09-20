/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
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
        
        JPanel pnBox=new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        JButton btn1=new JButton("BoxLayout");
        btn1.setForeground(Color.RED);
        Font font=new Font("Arial",Font.BOLD / Font.ITALIC,25);
        btn1.setFont(font);pnBox.add(btn1);
        JButton btn2=new JButton("X_AXIS");
        btn2.setForeground(Color.BLUE);
        btn2.setFont(font);pnBox.add(btn2);
        JButton btn3=new JButton("Y_AXIS");
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);pnBox.add(btn3);
                
                Container con=getContentPane();
                con.add(pnBox);
    }}


    
        
        

    

