/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
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
        
        JPanel pnFlow=new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        JButton btn1=new JButton("FlowLayout");
        JButton btn2=new JButton("Add các control");
        JButton btn3=new JButton("Trên 1 dòng");
        JButton btn4=new JButton("Thì xuống dòng");
        pnFlow.add(bt1);pnFlow.add(btn2);
        pnFlow.add(btn3);pnFlow.add(btn4);
        pnFlow.add(btn5);
        
        Container con=getContentPane();
        con.add(pnFlow);
        
        

        

    
}
