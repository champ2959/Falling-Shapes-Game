/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author emg5478
 */
public class MyJPanel3 extends JPanel implements ActionListener {
    
    JButton b1, b2, b3, b4;
    Timer tim;
    int i = 0;
    int delay = 1000;
    
    public MyJPanel3() {
    
        super();
        
        
        int limit = 0;
        
        
        tim = new Timer(delay, this);
        
        b1 = new JButton("B1");
        add(b1);
        b2 = new JButton("B2");
        b3 = new JButton("b3");
        b4 = new JButton("B4");
        
        
        
        
        
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();
        
        
        
    
    
    }
}
