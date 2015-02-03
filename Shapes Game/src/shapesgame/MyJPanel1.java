/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author emg5478
 */
public class MyJPanel1 extends JPanel implements ActionListener {
    
    public MyJPanel1 () {
        
        JButton start = new JButton ();
        start.addActionListener(this);  
        add(start);
        JButton exit = new JButton ();
        exit.addActionListener(this);
        add(exit);
    }
    public void actionPerformed(ActionEvent colors){
        
    }
    
}
