/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashSet;
import java.util.Locale;
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
        
JPanel pnBorder=new JPanel();
pnBorder.setLayout(new BorderLayout());
JPanel pnNorth=new JPanel();
pnNorth.setBackground(Color.RED);
pnBorder.add(pnNorth,BorderLayout.NORTH);
JPanel pnSouth=new JPanel();
pnSouth.setBackground(Color.RED);
pnBorder.add(pnSouth,BorderLayout.SOUTH);
JPanel pnWest=new JPanel();
pnWest.setBackground(Color.BLUE);
pnBorder.add(pnWest,BorderLayout.WEST);
JPanel pnEast=new JPanel();
pnEast.setBackground(Color.BLUE);
pnBorder.add(pnEast,BorderLayout.EAST);
JPanel pnCenter=new JPanel();
pnCenter.setBackground(Color.yellow);
pnBorder.add(pnCenter,BorderLayout.CENTER);
getContentPane().add(pnBorder);




        
    


        


    




